package controliteration.dictionary;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Translation {

    private String name;
    private List<String> translations = new ArrayList<>();

    public Translation(String name, List<String> translations) {
        this.name = name;
        this.translations = translations;
    }

    public void addTranslation(List<String> translationList){
        for(String translation : translationList){
            if(!translations.contains(translation)){
                translations.add(translation);
            }
        }
    }

    public String getName() {
        return name;
    }

    public List<String> getTranslations() {
        return translations;
    }
}
