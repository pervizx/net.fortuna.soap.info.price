package net.fortuna.soap.helper;

public class AmadException extends Exception{
    private Object reason;

    public AmadException(String msg){
        super(msg);
    }

    public AmadException() {
        this.reason = null;
    }

    public AmadException(String message, Object reason) {
        this(message);
        this.reason = reason;
    }

    public AmadException(String message, Exception mainException) {
        super(message, mainException);
    }

    public AmadException(String message, Exception mainException, Object reason) {
        super(message, mainException);
        this.reason = reason;
    }

    public Object getReason() {
        return this.reason;
    }

    public void setReason(Object reason) {
        this.reason = reason;
    }
}
