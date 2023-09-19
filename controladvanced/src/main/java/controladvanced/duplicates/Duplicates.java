package controladvanced.duplicates;

import org.apache.commons.collections.CollectionUtils;

import java.util.*;

public class Duplicates {

    public List<Integer> find(List<Integer> integers){
        return new ArrayList<Integer>(CollectionUtils.disjunction(integers, new HashSet<>(integers)));
    }
}
