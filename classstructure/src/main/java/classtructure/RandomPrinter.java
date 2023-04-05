package classtructure;

import java.util.Random;

public class RandomPrinter {

    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(9)+1;
        System.out.println(randomInt);
    }
}
