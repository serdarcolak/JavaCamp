
public class UserManager extends User{
	public void add(User user) {
		System.out.println("Kullan�c� Eklendi " + user.getFirstName());
	}
	public void delete(User user) {
		System.out.println("Kullan�c� silindi " + user.getFirstName());
	}
	public void update(User user) {
		System.out.println("Kullan�c� g�ncellendi " + user.getFirstName());
	}
}
