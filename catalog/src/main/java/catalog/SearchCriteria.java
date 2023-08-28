package catalog;

public class SearchCriteria {

    private final String title;
    private final String contributor;

    private SearchCriteria(String title, String contributor) {
        this.title = title;
        this.contributor = contributor;
    }

    public static SearchCriteria createByTitle(String title){
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException();
        }
        return new SearchCriteria(title,null);
    }

    public static SearchCriteria createByContributor(String contributor){
        if(Validators.isBlank(contributor)){
            throw new IllegalArgumentException();
        }
        return new SearchCriteria(null,contributor);
    }

    public static SearchCriteria createByBoth(String title, String contributor){
        if(Validators.isBlank(contributor) || Validators.isBlank(title)){
            throw new IllegalArgumentException();
        }
        return new SearchCriteria(title,contributor);
    }

    public boolean hasTitle(){
        return title != null;
    }

    public String getTitle(){
        return title;
    }

    public boolean hasContributor(){
        return contributor != null;
    }

    public boolean hasBoth(){
        return contributor != null && title != null;
    }

    public String getContributor(){
        return contributor;
    }


}
