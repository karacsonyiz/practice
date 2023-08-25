package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    public static List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem){
        catalogItems.add(catalogItem);
    }

    public void deleteItemByRegistrationNumber(String registrationNumber){
        for(CatalogItem catalogItem : catalogItems){
            if(catalogItem.getRegistrationNumber().equals(registrationNumber)){
                catalogItems.remove(catalogItem);
            }
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
            result += c.fullLengthAtOneItem();
        }
        return result;
    }
}
