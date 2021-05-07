package eticaretSystem;

import eticaretSystem.business.concretes.LoggerManager;
import eticaretSystem.business.concretes.UserManager;
import eticaretSystem.core.GoogleManagerAdapter;
import eticaretSystem.dataAccess.concretes.HibernateUserDao;
import eticaretSystem.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(1,"serdar","colak","serdar@gmail.com","123456");
		UserManager userManager = new UserManager(new HibernateUserDao(), new LoggerManager(), new GoogleManagerAdapter());
		userManager.register(user);
		userManager.userLogin("serdar@gmail.com", "123456");
		userManager.userLogin("serdar@gmail.com", "1234567");
		
		
		
		
	}

}
