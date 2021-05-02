package Entities;

public class Gamer {
	private int id;
	private String tcNo;
	private String firstName;
	private String lastName;
	private int yearOfBirth;
	
	public Gamer() {
		
	}
	
	
	public Gamer(int id, String tcNo, String firstName, String lastName, int yearOfBirth) {
		super();
		this.id = id;
		this.tcNo = tcNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTcNo() {
		return tcNo;
	}


	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
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


	public int getYearOfBirth() {
		return yearOfBirth;
	}


	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
}
