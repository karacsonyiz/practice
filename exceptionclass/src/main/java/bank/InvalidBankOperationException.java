package bank;

public class InvalidBankOperationException extends RuntimeException {

    private ErrorCode errorCode;

    public InvalidBankOperationException(String errorMessage, ErrorCode errorCode) {
        super(errorMessage);
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return this.errorCode;
    }


}
