package introjunit;

import introjunit.Gentleman;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GentlemanTest {

    @Test
    public void byNull() {
        // Given
        String name = null;

        // When
        String greeting = new Gentleman().sayHello(name);

        // Then
        assertThat(greeting, equalTo("Hello Anonymous"));
    }

    @Test
    public void byNormalName() {
        // Given
        String name = "John Doe";

        // When
        String greeting = new Gentleman().sayHello(name);

        // Then
        assertThat(greeting, equalTo("Hello John Doe"));
    }
}
