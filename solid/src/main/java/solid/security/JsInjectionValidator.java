package solid.security;

import solid.base.Validator;

public class JsInjectionValidator implements Validator {


    @Override
    public boolean isValid(String account) {
        if(account == null) {
            return false;
        }
        if(account.contains("<script>")) {
            return false;
        }
        return true;
    }
}
