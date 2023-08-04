package stringbuilder;

public class PalindromeValidator {

    public boolean isPalindrome(String text) {
        if(text == null) {
            throw new IllegalArgumentException("Text must not be null!");
        }

        StringBuilder sb = new StringBuilder(text.toLowerCase().replace("\n\t",""));
        if(sb.toString().equals(sb.reverse().toString())){
            return true;
        }
        return false;
    }
}
