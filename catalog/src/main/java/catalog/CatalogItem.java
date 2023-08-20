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
}
