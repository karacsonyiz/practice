package primitivetypes;

import java.util.ArrayList;
import java.util.List;

public class PrimitivesTypesMain {

    public static void main(String[] args) {
        int i = 9;

        Integer j = 9;

        List<Integer> numbers = new ArrayList<>();
        numbers.add(i);

        System.out.println(Integer.toString(9,2));
        System.out.println(Integer.toString(-9,2));
        System.out.println(Integer.toBinaryString(-9));

        int k = Integer.parseInt("9aa");
        Integer l = new Integer("9");

    }
}
