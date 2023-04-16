package introexception.patient;

public class SsnValidator {

    public boolean isValidSsn(String ssn){
        if(ssn.length() != 9){
            return false;
        }
        int ssnAsNumber;
        try {
            ssnAsNumber = Integer.parseInt(ssn);
        } catch (NumberFormatException e){
            return false;
        }


        return true;
    }

}
