package controliteration.dictionary;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Dictionary {

    private List<Translation> translationList = new ArrayList<>();

    public void addItem(String item, List<String> translations){

        Translation newTranslation = new Translation(item,translations);

        if(translationList.contains(newTranslation)){
            Translation original = translationList.get(translationList.indexOf(newTranslation));
            original.addTranslation(translations);
        } else {
            translationList.add(newTranslation);
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
