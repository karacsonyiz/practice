package methodchain.robot;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RobotTest {

    private Robot robot;

    @Before
    public void setUp() {
        this.robot = new Robot();
    }

    @After
    public void tearDown() {
        this.robot = null;
    }

    @Test
    public void testGoAndRotate() {
        //When
        robot.go(5).go(10).rotate(30);
        //Then
        assertThat(robot.getDistance(), is(15));
        assertThat(robot.getAzimut(), is(30));
    }

    @Test
    public void testRotate() {
        //When
        robot.rotate(45).rotate(45).rotate(-90);
        //Then
        assertThat(robot.getAzimut(), is(0));
    }
}

