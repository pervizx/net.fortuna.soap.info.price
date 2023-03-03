package net.fortuna.soap.helper;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleLogger {
    private Logger logger = null;
    private StringBuilder sb = null;

    public SimpleLogger(String name, Level logLevel) {
        if (logLevel != null && logLevel != Level.OFF) {
            logger = Logger.getLogger(name);
            logger.setLevel(logLevel);
        }
    }

    public void logIt(String str) {
        if (logger == null) {
            return;
        }
        if (sb == null) {
            sb = new StringBuilder();
        }
        sb.append("\n").append(str);
    }

    public void logStack(Exception e) {
        if (logger == null) {
            e.printStackTrace();
        } else {
            logIt(e.getMessage());
            for (StackTraceElement el : e.getStackTrace()) {
                logIt(el.toString());
            }
        }
    }

    public void flush(Level level) {
        if (logger == null) {
            return;
        }
        logger.log(level, sb.toString());
        sb = null;
    }
}
