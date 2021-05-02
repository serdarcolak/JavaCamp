
public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setFirstName("Serdar");
		System.out.println(user.getId() + " " + user.getFirstName());
		
		Student student = new Student(1,"Serdar","Çolak", "12345");
		System.out.println(student.getId() + " " + student.getFirstName());
		
		Instructor ınstructor = new Instructor(1,"Engin","Demiroğ","kodlama");
		System.out.println(ınstructor.getId() + " " + ınstructor.getFirstName());
		
		UserManager userManager = new UserManager();
		userManager.add(user);
		
		InstructorManager ınstructorManager = new InstructorManager();
		ınstructorManager.addDomain(ınstructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.updateNumber(student);
	}

}
