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

}
