package ecommercesystem;

import ecommercesystem.business.concretes.UserManager;
import ecommercesystem.core.GoogleAdapter;
import ecommercesystem.dataAccess.concretes.HibernateUserDao;
import ecommercesystem.entity.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setFirstName("Hatice");
		user.setLastName("Durmaz");
		user.setEmail("htc@gmail.com");
		user.setPassword("123456");
		
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("K");
		user1.setLastName("Bayındır");
		user1.setEmail("kbra@gmail.com");
		user1.setPassword("5555");
		
		User user2 = new User();
		user2.setId(1);
		user2.setFirstName("Arthur");
		user2.setLastName("King");
		user2.setEmail("crzyking28@gmail.com");
		user2.setPassword("4645");
		
		User user3 = new User();
		user3.setId(1);
		user3.setFirstName("Engin");
		user3.setLastName("Demirog");
		user3.setEmail("enginlecturer@gmail.com");
		user3.setPassword("465461");

		UserManager userManager = new UserManager(new HibernateUserDao(), new GoogleAdapter());
		
		userManager.add(user);
		userManager.add(user1);
		userManager.add(user2);
		userManager.add(user3);
		
		userManager.getAll();
		

	}

}
