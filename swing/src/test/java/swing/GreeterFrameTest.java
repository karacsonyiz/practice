package swing;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GreeterFrameTest {
    @Test
    public void pushButton() {
        GreeterFrame greeterFrame = new GreeterFrame();
        greeterFrame.getTextField().setText("John Doe");
        greeterFrame.getButton().doClick();

        assertThat(greeterFrame.getLabel().getText(), equalTo("Hello John Doe"));
    }
}
