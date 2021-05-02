
public class Instructor extends User{
	private int id;
	private String firstName;
	private String lastName;
	private String domain;
	
	public Instructor() {
		
	}

	public Instructor(int id, String firstName, String lastName, String domain) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.domain = domain
		;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}

}
