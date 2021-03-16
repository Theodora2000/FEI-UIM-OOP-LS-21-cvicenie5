package sk.stuba.uim.fei.oop;

public class NoServerException extends Exception {
    public NoServerException() {
    }

    public NoServerException(String message) {
        super(message);
    }

    public NoServerException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoServerException(Throwable cause) {
        super(cause);
    }

    public NoServerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
