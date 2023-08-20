package catalog;

import java.util.List;

public class PrintedFeatures implements Feature {


    private final String title;
    private final int numberOfPages;
    private final List<String> authors;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        isTitlePresent(title);
        isNumberOfPagesValid(numberOfPages);
        isAuthorsValid(authors);
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.authors = authors;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public List<String> getContributors() {
        return this.authors;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    private void isTitlePresent(String title){
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException("Empty title");
        }
    }

    private void isNumberOfPagesValid(int numberOfPages){
        if(numberOfPages < 1){
            throw new IllegalArgumentException("Invalid length");
        }
    }

    private void isAuthorsValid(List<String> authors){
        if(Validators.isEmpty(authors)){
            throw new IllegalArgumentException();
        }
    }
}
