package distjar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GentlemanMainTest {

    private ByteArrayOutputStream out = new ByteArrayOutputStream();
    private ByteArrayOutputStream err = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(out));
        System.setErr(new PrintStream(err));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void withoutArgument() {
        GentlemanMain.main(new String[]{});
        assertThat(out.toString().trim(), equalTo("Hello Anonymous"));
    }

    @Test
    public void withArgument() {
        GentlemanMain.main(new String[]{"John Doe"});
        assertThat(out.toString().trim(), equalTo("Hello John Doe"));
    }
}
