package ecommercesystem.dataAccess.abstracts;

import java.util.List;

import ecommercesystem.entity.concretes.User;

public interface UserDao {
	void join(User user);
	void add(User user);
	void update(User user);
	void delete(User user);
	User getByEmail(String email);
	List<User> getAll();
	User getByEmailandPassword(String email,String password);

}
