package bank2;

public class InvalidAccountNumberBankOperationException extends InvalidBankOperationException {

    public InvalidAccountNumberBankOperationException(String errorMessage, ErrorCode errorCode) {
        super(errorMessage, errorCode);
    }
}
