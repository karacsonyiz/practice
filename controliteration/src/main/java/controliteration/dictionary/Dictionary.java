package controliteration.dictionary;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Dictionary {

    private List<Translation> translationList = new ArrayList<>();

    public void addItem(String item, List<String> translations){

        for(Translation translation : translationList){
            if(translation.getTranslations().equals(item)){
                translation.addTranslation(translations);
            } else {
                translationList.add(new Translation(item,translations));
            }
        }
    }

    public List<String> findTranslations(String item){
        List<String> translations = new ArrayList<>();
        for(Translation translation : translationList){
            if(translation.getName().equals(item)){
                translations = translation.getTranslations();
            }
        }
        return translations;
    }
}
