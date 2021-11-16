package ecommercesystem.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import ecommercesystem.dataAccess.abstracts.UserDao;
import ecommercesystem.entity.concretes.User;

public class HibernateUserDao implements UserDao{
	
	private List<User> users=new ArrayList<User>();
	
	public HibernateUserDao() {
		User user1=new User(1,"Kübra Nur","Bayındır","kubra@gmail.com","123456",true);
		User user2=new User(2,"Engin","Demirog","engin@gmail.com","987654",true);
		
		users.add(user1);
		users.add(user2);
	}

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " user added.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " user updated.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " user deleted.");
		
	}

	@Override
	public User getByEmail(String email) {
		for (User user:users) {
		if(user.getEmail()==email)
			return user;
	} 
	return null;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public User getByEmailandPassword(String email, String password) {
		for(User user:users) {
			if(user.getEmail()==email&&user.getPassword()==password) {
				return user;
			}
		}
		return null;
	}

	@Override
	public void join(User user) {

		System.out.println(user.getFirstName() + " user join the system.");
		
	}

}
