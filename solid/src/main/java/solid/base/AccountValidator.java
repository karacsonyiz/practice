package solid.base;

public class AccountValidator implements Validator {

        @Override
        public boolean isValid(String account) {
            if(isEmpty(account)) {
                return false;
            }
            if(account.length() < 6) {
                return false;
            }
            if(account.contains(" ")){
                return false;
            }
            return true;
        }

        private boolean isEmpty(String account) {
            return account == null || account.equals("");
        }
}
