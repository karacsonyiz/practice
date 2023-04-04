package dependencyinjection.robot;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class RobotTest {

	@Test
    public void testRobotWithCaterpillar() {
	    CaterpillarRower caterpillarRower = new CaterpillarRower();
	    Robot robot = new Robot(caterpillarRower);
	    robot.moveForward(10);
	    robot.turnLeft(15);
        robot.moveForward(20);
	    assertThat(robot.getEnergy(), equalTo(16250));
    }

    @Test
    public void testRobotWithNoseWheelSteering() {
        NoseWheelSteeringRower noseWheelSteeringRower = new NoseWheelSteeringRower();
        Robot robot = new Robot(noseWheelSteeringRower);
        robot.moveForward(10);
        robot.turnLeft(15);
        robot.moveForward(20);
        assertThat(robot.getEnergy(), equalTo(18950));
    }

    @Test
    public void testRobotWithFlyingMechanism() {
        NoseWheelSteeringRower noseWheelSteeringRower = new NoseWheelSteeringRower();
        Robot robot = new Robot(noseWheelSteeringRower);
        Rotors rotors = new Rotors();
        robot.setFlyingMechanism(rotors);
        robot.moveForward(10);
        robot.turnLeft(15);
        robot.moveForward(20);
        assertThat(robot.getEnergy(), equalTo(15485));
    }

}