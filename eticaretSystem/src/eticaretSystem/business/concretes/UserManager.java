package eticaretSystem.business.concretes;

import java.util.regex.Pattern;

import eticaretSystem.business.abstracts.LoggerService;
import eticaretSystem.business.abstracts.UserService;
import eticaretSystem.core.GoogleService;
import eticaretSystem.dataAccess.abstracts.UserDao;
import eticaretSystem.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private LoggerService loggerService;
	private GoogleService googleService;

	public static final Pattern regex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	public UserManager(UserDao userDao, LoggerService loggerService, GoogleService googleService) {
		super();
		this.userDao = userDao;
		this.loggerService = loggerService;
		this.googleService = googleService;
	}

	@Override
	public void register(User user) {
		if (user.getFirstName().length() < 2 && user.getLastName().length() < 2) {
			System.out.println("Adiniz ve soyadiniz en 2 karakter olmalýdýr");
		}
		if (user.getPassword().length() < 6) {
			System.out.println("Þifreniz en az 6 karakter olmalýdýr");
		}
		if (!regex.matcher(user.getEmail()).find()) {
			return;
		}

		this.userDao.add(user);
		this.loggerService.send(user.getFirstName());
		this.googleService.myConnectionAccount("Baþarýlý");
	}

	@Override
	public void userLogin(String email, String password) {
		for (User users : userDao.getAll()) {
			if (email.equals(users.getEmail()) && password.equals(users.getPassword())) {
				System.out.println("Giriþ Yapildi");
			return;
			} else {
				System.out.println("Giriþ Yapýlamadý");
			}
		}
		
	}
}
