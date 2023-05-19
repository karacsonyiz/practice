package interfacemethods.print;

import java.util.ArrayList;
import java.util.List;

public class NewsPaper implements Printable {

    private List<String> pages = new ArrayList<>();

    public void addPage(String page){
        pages.add(page);
    }

    @Override
    public int getLength() {
        return pages.size();
    }

    @Override
    public String getPage(int pageNumber) {
        return pages.get(pageNumber);
    }

    @Override
    public String getColor(int page) {
        return Printable.super.getColor(page);
    }

}
