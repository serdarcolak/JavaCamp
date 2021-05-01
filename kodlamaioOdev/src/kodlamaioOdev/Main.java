package kodlamaioOdev;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "JAVA + REACT", "Engin Demiroð", 32);

		Course[] courses = { course1 };

		for (Course course : courses) {
			System.out.println(course.Name);
		}

		Category category1 = new Category();

		category1.id = 1;
		category1.name = "Programlama";

		System.out.println(category1.name);

		System.out.println("----------------------------------------------");

		CourseManager courseManager = new CourseManager();
		courseManager.Add();
		courseManager.Remove();
		
		
	}

}
