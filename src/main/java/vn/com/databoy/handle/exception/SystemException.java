package vn.com.databoy.handle.exception;

public class SystemException extends RuntimeException {
    private static final long serialVersionUID = -4430803840375325775L;

    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }

    public SystemException(String message) {
        super(message);
    }

    public SystemException(Throwable cause) {
        super(cause);
    }
}
