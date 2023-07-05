package bank2;


public class InvalidBankOperationException extends RuntimeException {

    private final ErrorCode errorCode;

    public InvalidBankOperationException(String errorMessage, ErrorCode errorCode) {
        super(errorMessage);
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return this.errorCode;
    }


}
