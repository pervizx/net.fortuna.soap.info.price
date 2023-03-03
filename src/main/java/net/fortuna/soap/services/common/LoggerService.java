package net.fortuna.soap.services.common;

import net.fortuna.common.entity.RequestResponseLog;
import net.fortuna.common.enums.RequestAction;
import net.fortuna.common.mongo.MongoRequestResponseLog;
import net.fortuna.common.mongo.MongoRequestResponseLogRepository;
import net.fortuna.common.repositories.RequestResponseLogRepository;
import net.fortuna.soap.helper.RequestResponseListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.time.LocalDateTime;

@Service
public class LoggerService {
    private static final Logger logger = LoggerFactory.getLogger(LoggerService.class);


    @Autowired
    private RequestResponseLogRepository requestResponseLogRepository;

    @Autowired
    private MongoRequestResponseLogRepository mongoRequestResponseLogRepository;

    @Autowired
    private PlatformTransactionManager txManager;

    @Async
    public void saveRequestResponseLog(RequestResponseListener listener, String sessionId, String bookingNumber, String error, RequestAction action, String methodName) {
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
        TransactionStatus status = txManager.getTransaction(def);
        RequestResponseLog requestResponseLog = null;
        try {
            requestResponseLog = new RequestResponseLog(listener.getUUID(), sessionId, methodName, null, null, bookingNumber, listener.getRequestTimeUtc(),
                    LocalDateTime.now(), error, listener.getFormat(), action);
            requestResponseLogRepository.save(requestResponseLog);
            txManager.commit(status);
            try {
                requestResponseLog.setRequest(listener.getRequest());
                requestResponseLog.setResponse(listener.getResponse());
                saveRequestResponseLogMongo(requestResponseLog);
            } catch (Exception ex) {
                DefaultTransactionDefinition def1 = new DefaultTransactionDefinition();
                def1.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
                TransactionStatus newStatus = txManager.getTransaction(def1);
                requestResponseLogRepository.save(requestResponseLog);
                txManager.commit(newStatus);
            }
        } catch (Exception ex) {
            logger.error("Error occurred while saving request_response_log");
            if(requestResponseLog != null) {
                DefaultTransactionDefinition def1 = new DefaultTransactionDefinition();
                def1.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
                TransactionStatus newStatus = txManager.getTransaction(def1);
                requestResponseLogRepository.save(requestResponseLog);
                txManager.commit(newStatus);
            }
        }
    }

    public void saveRequestResponseLogMongo(RequestResponseLog requestResponseLog) {
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
        TransactionStatus status = txManager.getTransaction(def);
        MongoRequestResponseLog mongoRequestResponseLog = new MongoRequestResponseLog(requestResponseLog.getId(), requestResponseLog.getUuid(), requestResponseLog.getSessionId(), requestResponseLog.getMethodName(),
                requestResponseLog.getRequest(), requestResponseLog.getResponse(), requestResponseLog.getBookingNumber(), requestResponseLog.getRequestDateUTC(), requestResponseLog.getRequestDate(),
                requestResponseLog.getError(), requestResponseLog.getMediaFormat(), requestResponseLog.getAction());
        mongoRequestResponseLogRepository.save(mongoRequestResponseLog);
        txManager.commit(status);
    }
}
