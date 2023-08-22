package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogItem {

    private final String registrationNumber;
    private final int price;
    private final List<Feature> features;

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

    public List<String> getContributors(){
        List<String> result = new ArrayList<>();
        for(Feature f : features){
            result.addAll(f.getContributors());
        }
        return result;
    }

    public List<String> getTitles(){
        List<String> result = new ArrayList<>();
        for(Feature f : features){
            result.add(f.getTitle());
        }
        return result;
    }

    public boolean hasAudioFeature(){
        for(Feature f : features) {
            if(f instanceof AudioFeatures) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature(){
        for(Feature f : features) {
            if(f instanceof PrintedFeatures) {
                return true;
            }
        }
        return false;
    }
}
