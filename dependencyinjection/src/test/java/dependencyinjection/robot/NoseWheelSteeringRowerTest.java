package dependencyinjection.robot;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class NoseWheelSteeringRowerTest {

    @Test
    public void testEnergy() {
        Rower rower = new NoseWheelSteeringRower();
        assertThat(rower.moveForward(10), equalTo(200));
        assertThat(rower.turnLeft(10), equalTo(300));
    }
}
