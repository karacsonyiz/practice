package catalog;

import java.util.ArrayList;
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

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria){

        List<CatalogItem> result = new ArrayList<>();
        for(CatalogItem c : catalogItems){
            if(searchCriteria.hasBoth()){
                hasBothCriteriaSearch(result,c,searchCriteria);
                continue;
            }
            if(searchCriteria.hasTitle()){
                hasTitleCriteriaSearch(result,c,searchCriteria);
                continue;
            }
            if(searchCriteria.hasContributor()){
                hasContributorCriteriaSearch(result,c,searchCriteria);
            }
        }
        return result;
    }

    public void removeAllItems(){
        catalogItems.clear();
    }

    private void hasBothCriteriaSearch(List<CatalogItem> result, CatalogItem catalogItem, SearchCriteria searchCriteria){
        if(catalogItem.getContributors().contains(searchCriteria.getContributor())
                && catalogItem.getTitles().contains(searchCriteria.getTitle())){
            result.add(catalogItem);
        }
    }

    private void hasTitleCriteriaSearch(List<CatalogItem> result, CatalogItem catalogItem, SearchCriteria searchCriteria){
        if(catalogItem.getTitles().contains(searchCriteria.getTitle())){
            result.add(catalogItem);
        }
    }

    private void hasContributorCriteriaSearch(List<CatalogItem> result, CatalogItem catalogItem, SearchCriteria searchCriteria){
        if(catalogItem.getContributors().contains(searchCriteria.getContributor())){
            result.add(catalogItem);
        }
    }
}
