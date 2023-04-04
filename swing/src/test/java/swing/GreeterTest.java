package swing;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GreeterTest {

    @Test
    public void sayHello() {
        assertThat(new Greeter().sayHello("John"), equalTo("Hello John"));
    }

    @Test
    public void sayHelloHtml() {
        assertThat(new Greeter().sayHelloHtml("John"), equalTo("<html>Hello <u>John</u></html>"));
    }
}
