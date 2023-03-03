package net.fortuna.soap.configuration;

import net.fortuna.soap.helper.ServiceProperties;
import net.fortuna.soap.services.booking.FareInfoPricingWithoutPNRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapClientConfig {


    @Autowired
    private ServiceProperties properties;

    @Bean
    public FareInfoPricingWithoutPNRService fareInfoPricingWithoutPNRService() {
        FareInfoPricingWithoutPNRService service = new FareInfoPricingWithoutPNRService();
        String contextPath = "net.fortuna.soap.generated.com.amadeus.xml.tipnrq_18_1_1a";
        String contextPathRes = "net.fortuna.soap.generated.com.amadeus.xml.tipnrr_18_1_1a";
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath(contextPath);
        Jaxb2Marshaller unmarshaller = new Jaxb2Marshaller();
        unmarshaller.setContextPath(contextPathRes);
        service.setMarshaller(marshaller);
        service.setUnmarshaller(unmarshaller);
        service.setDefaultUri(properties.getWsdl());
        return service;
    }

}
