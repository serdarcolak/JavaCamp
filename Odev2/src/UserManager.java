
public class UserManager extends User{
	public void add(User user) {
		System.out.println("Kullanýcý Eklendi " + user.getFirstName());
	}
	public void delete(User user) {
		System.out.println("Kullanýcý silindi " + user.getFirstName());
	}
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi " + user.getFirstName());
	}
}
