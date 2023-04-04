package dependencyinjection.robot;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class RotorsTest {

    @Test
    public void testEnergy() {
        FlyingMechanism flyingMechanism = new Rotors();
        assertThat(flyingMechanism.moveForward(10), equalTo(1500));
        assertThat(flyingMechanism.turnLeft(10), equalTo(10));
    }
}
