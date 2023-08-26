package catalog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Catalog {

    public static List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem){
        catalogItems.add(catalogItem);
    }

    public void deleteItemByRegistrationNumber(String registrationNumber){
        CatalogItem c = null;
        for(CatalogItem catalogItem : catalogItems){
            if(catalogItem.getRegistrationNumber().equals(registrationNumber)){
                c = catalogItem;
            }
        }
        if(c != null) {
            catalogItems.remove(c);
        }
    }

    public static List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> items = new ArrayList<>();
        for(CatalogItem c : catalogItems) {
            if(c.hasAudioFeature()) {
                items.add(c);
            }
        }
        return items;
    }

    public static List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> items = new ArrayList<>();
        for(CatalogItem c : catalogItems) {
            if(c.hasPrintedFeature()) {
                items.add(c);
            }
        }
        return items;
    }

    public int getAllPageNumber() {
        int result = 0;
        for(CatalogItem c : catalogItems) {
            result += c.numberOfPagesAtOneItem();
        }
        return result;
    }

    public int getFullLength(){
        int result = 0;
        for(CatalogItem c : catalogItems) {
            result += c.fullLengthAtOneItem();
        }
        return result;
    }

    public double averagePageNumberOver(int page){
        if(page < 1){
            throw new IllegalArgumentException("Page number must be positive");
        }
        int result = 0;
        int validItem = 0;
        for(CatalogItem c : catalogItems) {
            if(c.numberOfPagesAtOneItem() > page) {
                validItem += 1;
                result += c.numberOfPagesAtOneItem();
            }
        }
        if(result == 0){
            throw new IllegalArgumentException("No page");
        }
        return (double) result / validItem;

    }


    public void removeAllItems(){
        catalogItems.clear();
    }
}
