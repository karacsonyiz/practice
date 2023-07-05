package bank2;

public class InvalidAmountBankOperationException extends InvalidBankOperationException {


    public InvalidAmountBankOperationException(String errorMessage, ErrorCode errorCode) {
        super(errorMessage, errorCode);
    }
}
