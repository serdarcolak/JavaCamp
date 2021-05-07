package eticaretSystem.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eticaretSystem.dataAccess.abstracts.UserDao;
import eticaretSystem.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	ArrayList<User> users=new ArrayList<User>();
	
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Kullanýcý Eklendi " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean get(User user) {
		for (User userGet : users) {
			if (user.equals(userGet)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

}
