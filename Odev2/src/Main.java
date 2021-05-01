
public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1,60);
		student1.setId(2);
		student1.setFirstName("Ekin");
		student1.setLastName("Uç");
		student1.setEmail("ekinucc2004@gmail.com");
		
		
		Instructor instructor1 = new Instructor(1);
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setEmail("engindemirog@gmail.com");
		
		Course course1 = new Course(1, "C#&Angular.jpg", "C#&Angular", "Engin Demiroğ");
		Course course2 = new Course(2, "Java&React.jpg", "Java&React", "Engin Demiroğ");
		
		Course[] courses = {
			course1,
			course2
		};
		
		InstructorManager instructorManager = new InstructorManager();
		for (Course course : courses) {
			instructorManager.addCourse(course);
		}
		
		StudentManager studentManager = new StudentManager();
		for (Course course : courses) {
			studentManager.joinCourse(course);
		}
		
		
		
	}
	

}
