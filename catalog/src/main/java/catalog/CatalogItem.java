package catalog;

import java.util.Arrays;
import java.util.List;

public class CatalogItem {

    private final String registrationNumber;
    private final int price;
    private List<Feature> features;

    public CatalogItem(String registrationNumber, int price,Feature... features) {
        this.registrationNumber = registrationNumber;
        this.price = price;
        this.features = Arrays.asList(features);
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getPrice() {
        return price;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public int numberOfPagesAtOneItem(){
        int result = 0;
        for(Feature f : features) {
            if(f instanceof PrintedFeatures) {
                result += ((PrintedFeatures) f).getNumberOfPages();
            }
        }
        return result;
    }

    public int fullLengthAtOneItem(){
        int result = 0;
        for(Feature f : features) {
            if(f instanceof AudioFeatures) {
                result += ((AudioFeatures) f).getLength();
            }
        }
        return result;
    }
}
