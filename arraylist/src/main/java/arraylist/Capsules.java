package arraylist;

import java.util.List;

public class Capsules {

    private List<String> capsules;

    public Capsules(List<String> capsules) {
        this.capsules = capsules;
    }

    public void addLast(String last){
        this.capsules.add(last);
    }

    public void addFirst(String first){
        this.capsules.add(0,first);
    }

    public void removeFirst(){
        this.capsules.remove(0);
    }

    public void removeLast(){
        this.capsules.remove(capsules.size()-1);
    }

    public List<String> getColors(){
        return this.capsules;
    }
}
