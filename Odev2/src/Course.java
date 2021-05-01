
public class Course {
	private int courseId;
	private String img;
	private String name;
	private String instructor;
	
	public Course() {
		
	}
	
	public Course(int courseId, String img, String name, String instructor) {
		super();
		this.courseId = courseId;
		this.img = img;
		this.name = name;
		this.instructor = instructor;
	}
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
}
