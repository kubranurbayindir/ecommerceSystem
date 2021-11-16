package ecommercesystem.business.concretes;

import java.util.List;

import ecommercesystem.business.abstracts.UserService;
import ecommercesystem.core.GoogleService;
import ecommercesystem.dataAccess.abstracts.UserDao;
import ecommercesystem.entity.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private GoogleService googleService;

	public UserManager(UserDao userDao, GoogleService googleService) {
		super();
		this.userDao = userDao;
		this.googleService = googleService;
	}

	@Override
	public void add(User user) {
		var result = checkIfUserValidate(user);

		if (result != false) {
			userDao.add(user);

			googleService.send(user.getEmail(), "Added");
		} else {
			System.out.println("Please try again");
		}

	}

	@Override
	public User getByMail(String email) {
		return userDao.getByEmail(email);
	}

	@Override
	public List<User> getAll() {
		for (User user : userDao.getAll()) {
			System.out.println(user.getFirstName() + " " + user.getLastName());
		}
		return userDao.getAll();
	}

	public boolean checkIfUserValidate(User user) {
		if (user.getFirstName().length() >= 2 && user.getLastName().length() >= 2) {

			return true;
		}
		System.out.println("First name anda last name must be equal or grater than 2!");
		return false;

	}

	public boolean userCheckIfNull(User user) {
		if (user != null && !user.getFirstName().isEmpty() && !user.getLastName().isEmpty()
				&& !user.getEmail().isEmpty() && !user.getPassword().isEmpty()) {
			return true;
		}
		System.out.println("These fields cannot be blank!");
		return false;
	}

	public boolean checkfPassword(String password) {
		if (password.length() < 6) {

			System.out.println("Password must be equals or grater than 6 !");
			return false;
		}

		return true;
	}

}
