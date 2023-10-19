package polymorphism;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

public class TrainerTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testCreate(){
        Trainer trainer = new Trainer("John Doe", Arrays.asList(new Course("Course1")));

        assertThat(trainer, instanceOf(Trainer.class));
        assertThat(trainer, instanceOf(Human.class));
        assertThat(trainer, instanceOf(Object.class));
        assertThat(trainer, instanceOf(HasName.class));


    }

}
