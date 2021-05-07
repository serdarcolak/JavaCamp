package eticaretSystem.business.abstracts;

import eticaretSystem.entities.concretes.User;

public interface UserService {
	void register(User user);
	void userLogin(String email, String password);
	
}
