package dependencyinjection.person;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class UserServiceTest {

	class UserRepositoryImpl implements UserRepository {
		private List<User> findBySatusResponse;
		private User findOneUserResponse;
		private User saveAndFlushParam;
		private int findOneIdParam;

		public UserRepositoryImpl(List<User> findBySatusResponse, User findOneUserResponse) {
			this.findBySatusResponse = findBySatusResponse;
			this.findOneUserResponse = findOneUserResponse;
		}

		@Override
		public List<User> findByStatus(Status status) {
			return findBySatusResponse;
		}

		@Override
		public User findOne(int id) {
			findOneIdParam = id;
			return findOneUserResponse;
		}

		@Override
		public void saveAndFlush(User user) {
			saveAndFlushParam = user;
		}

		public User getSaveAndFlushParam() {
			return saveAndFlushParam;
		}

		public int getFindOneIdParam() {
			return findOneIdParam;
		}
	}

	@Test
	public void getAllDisabled() {

		List<User> findBySatusResponse = new ArrayList<>();
		findBySatusResponse.add(new User("1" , Status.DISABLED));
		findBySatusResponse.add(new User("2" , Status.DISABLED));
		User findOneUserResponse = new User("demo", Status.DISABLED);

		UserRepositoryImpl userRepository = new UserRepositoryImpl(
				findBySatusResponse, findOneUserResponse);
		UserService userService = new UserService(userRepository);

		List<User> users = userService.getAllDisabled();

		assertThat(users.size(), is(2));
		assertThat(users.get(0), is(findBySatusResponse.get(0)));
		assertThat(users.get(1), is(findBySatusResponse.get(1)));
	}

	@Test
	public void enableUser() {
		List<User> findBySatusResponse = new ArrayList<>();
		findBySatusResponse.add(new User("1" , Status.DISABLED));
		findBySatusResponse.add(new User("2" , Status.DISABLED));
		User findOneUserResponse = new User("demo", Status.DISABLED);

		UserRepositoryImpl userRepository = new UserRepositoryImpl(
				findBySatusResponse, findOneUserResponse);
		UserService userService = new UserService(userRepository);

		userService.enableUser(123);

		assertThat(userRepository.getFindOneIdParam(), is(123));
		assertThat(userRepository.getSaveAndFlushParam().getName(), is("demo"));
		assertThat(userRepository.getSaveAndFlushParam().getStatus(), is(Status.ENABLED));
	}

}