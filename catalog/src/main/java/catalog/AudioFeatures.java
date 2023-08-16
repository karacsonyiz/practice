package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {

    private final String title;
    private final int length;
    private List<String> contributors = new ArrayList<>();

    public AudioFeatures(String title, int length, List<String> contributors) {
        isTitlePresent(title);
        isLenghtValid(length);
        this.title = title;
        this.length = length;
        this.contributors = contributors;
    }

    public AudioFeatures(String title, int length, List<String> contributors, List<String> composer) {
        isTitlePresent(title);
        isLenghtValid(length);
        this.title = title;
        this.length = length;
        this.contributors.addAll(composer);
        this.contributors.addAll(contributors);
    }

    public int getLength() {
        return length;
    }

    @Override
    public List<String> getContributors() {
        return contributors;
    }

    @Override
    public String getTitle() {
        return title;
    }

    private void isTitlePresent(String title){
        if(title.equals("")){
            throw new IllegalArgumentException("Empty title");
        }
    }

    private void isLenghtValid(int lenght){
        if(lenght < 1){
            throw new IllegalArgumentException("Invalid length");
        }
    }


}
