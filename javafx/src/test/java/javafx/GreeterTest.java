package javafx;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GreeterTest {

    @Test
    public void sayHello() {
        assertThat(new Greeter().sayHello("John"), equalTo("Hello John"));
    }

}
