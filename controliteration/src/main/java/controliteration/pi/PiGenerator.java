package controliteration.pi;

import java.math.BigDecimal;

public class PiGenerator {

    //private final BigDecimal PI = BigDecimal.valueOf(Math.PI);

    public BigDecimal getPi(){

        double pi = 2 * Math.acos(0.0);
        System.out.println(pi);
        pi = Math.round(pi * Math.pow(10, 15)) / Math.pow(10, 15);

        return new BigDecimal(pi);
    }
}
