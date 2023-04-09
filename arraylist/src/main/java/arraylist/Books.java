package arraylist;


import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<String> books;

    public Books(List<String> books){
        this.books = books;
    }

    public void add(String book){
        this.books.add(book);
    }

    public List<String> findAllByPrefix(String prefix){

        List<String> result = new ArrayList<>();

        for(String title : this.books){
            if(title.contains(prefix)){
                result.add(title);
            }
        }
        return result;
    }

    public List<String> getTitles(){
        return this.books;
    }

}
