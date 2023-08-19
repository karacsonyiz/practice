package catalog;

import java.util.List;

public class Validators {

    public static boolean isBlank(String text){
        if(text == null || text.trim().isEmpty()){
            return true;
        }
        return false;
    }

    public static boolean isEmpty(List<String> texts){
        if(texts == null || texts.size() == 0){
            return true;
        }
        return false;
    }
}
