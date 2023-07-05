package bank2;

public class LowBalanceBankOperationException extends InvalidBankOperationException {

    public LowBalanceBankOperationException(String errorMessage, ErrorCode errorCode) {
        super(errorMessage, errorCode);
    }

}
