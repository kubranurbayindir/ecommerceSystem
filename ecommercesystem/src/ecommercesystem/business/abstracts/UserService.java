package ecommercesystem.business.abstracts;

import java.util.List;

import ecommercesystem.entity.concretes.User;

public interface UserService {
	 void add(User user);
	 User getByMail(String email);
	 List<User> getAll();
	

}
