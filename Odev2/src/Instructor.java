
public class Instructor extends User {
	private int instructorId;

	public Instructor(int instructorId) {
		super();
		this.instructorId = instructorId;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	
}
