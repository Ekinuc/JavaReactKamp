package game.Entities;

public class Campaign {
	private int id;
	private String name;
	private String validationTime;
	private int discount;
	
	
	
	public Campaign() {
		
	}
	
	public Campaign(int id, String name, String validationTime, int discount) {
		super();
		this.id = id;
		this.name = name;
		this.validationTime = validationTime;
		this.discount = discount;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValidationTime() {
		return validationTime;
	}

	public void setValidationTime(String validationTime) {
		this.validationTime = validationTime;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	

}
