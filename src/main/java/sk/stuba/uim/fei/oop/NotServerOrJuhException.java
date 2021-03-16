package sk.stuba.uim.fei.oop;

public class NotServerOrJuhException extends Exception{
    public NotServerOrJuhException() {
    }

    public NotServerOrJuhException(String message) {
        super(message);
    }

    public NotServerOrJuhException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotServerOrJuhException(Throwable cause) {
        super(cause);
    }

    public NotServerOrJuhException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

