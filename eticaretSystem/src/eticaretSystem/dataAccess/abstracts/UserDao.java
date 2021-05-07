package eticaretSystem.dataAccess.abstracts;

import java.util.List;

import eticaretSystem.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete (User user);
	boolean get(User user);
	List<User> getAll();
}
