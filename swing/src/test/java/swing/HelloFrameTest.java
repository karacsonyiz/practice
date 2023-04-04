package swing;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class HelloFrameTest {

    @Test
    public void pushButton() {
        HelloFrame helloFrame = new HelloFrame();
        helloFrame.getButton().doClick();

        assertThat(helloFrame.getLabel().getText(), equalTo("Hello World!"));
    }
}
