
public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setFirstName("Serdar");
		System.out.println(user.getId() + " " + user.getFirstName());
		
		Student student = new Student(1,"Serdar","�olak", "12345");
		System.out.println(student.getId() + " " + student.getFirstName());
		
		Instructor �nstructor = new Instructor(1,"Engin","Demiro�","kodlama");
		System.out.println(�nstructor.getId() + " " + �nstructor.getFirstName());
		
		UserManager userManager = new UserManager();
		userManager.add(user);
		
		InstructorManager �nstructorManager = new InstructorManager();
		�nstructorManager.addDomain(�nstructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.updateNumber(student);
	}

}
