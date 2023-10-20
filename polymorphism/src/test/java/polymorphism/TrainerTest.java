package polymorphism;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.hamcrest.CoreMatchers.instanceOf;
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

        Object object = new Trainer("John Doe", Arrays.asList(new Course("Course1")));
        assertThat(object, instanceOf(Trainer.class));
        assertThat(object, instanceOf(Human.class));
        assertThat(object, instanceOf(Object.class));
        assertThat(object, instanceOf(HasName.class));

        Human human = new Trainer("John Doe", Arrays.asList(new Course("Course1")));
        assertThat(human, instanceOf(Trainer.class));
        assertThat(human, instanceOf(Human.class));
        assertThat(human, instanceOf(Object.class));
        assertThat(human, instanceOf(HasName.class));

        HasName hasName = new Trainer("John Doe", Arrays.asList(new Course("Course1")));
        assertThat(hasName, instanceOf(Trainer.class));
        assertThat(hasName, instanceOf(Human.class));
        assertThat(hasName, instanceOf(Object.class));
        assertThat(hasName, instanceOf(HasName.class));

    }

}
