package controliteration.dictionary;

import java.util.*;

public class Translation {

    private String name;
    private List<String> translations;

    public Translation(String name, List<String> translations) {
        this.name = name;
        this.translations = translations;
    }

    public void addTranslation(List<String> translationList){
        Set<String> added = new HashSet<>(translations);
        added.addAll(translationList);
        translations = new ArrayList<>(added);
    }

    public String getName() {
        return name;
    }

    public List<String> getTranslations() {
        return translations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Translation that = (Translation) o;

        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
