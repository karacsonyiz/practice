package dependencyinjection.robot;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class CaterpillarRowerTest {

    @Test
    public void testEnergy() {
        Rower rower = new CaterpillarRower();
        assertThat(rower.moveForward(10), equalTo(1000));
        assertThat(rower.turnLeft(10), equalTo(500));
    }
}
