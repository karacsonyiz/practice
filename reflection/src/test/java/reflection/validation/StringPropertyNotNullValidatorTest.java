package reflection.validation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StringPropertyNotNullValidatorTest {

	@Test
	public void validateWithBook() {
		StringPropertyNotNullValidator validator = new StringPropertyNotNullValidator();
		assertThat(validator.validate(new Book(null, "1984")), is(false));
		assertThat(validator.validate(new Book("George Orwell", null)), is(false));
		assertThat(validator.validate(new Book("George Orwell", "1984")), is(true));
	}

	@Test
	public void validateWithEmployee() throws Exception {
		StringPropertyNotNullValidator validator = new StringPropertyNotNullValidator();
		assertThat(validator.validate(new Employee(null, 30)), is(false));
		assertThat(validator.validate(new Employee("John Doe", 30)), is(true));
	}

}