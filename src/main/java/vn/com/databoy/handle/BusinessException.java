package vn.com.databoy.handle;

public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = -7664370531422975930L;

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }
}