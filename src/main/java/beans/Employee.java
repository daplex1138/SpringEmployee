package beans;

public class Employee {
	private long id;
	private String name;
	private double payRate;
	private double bonus;
	
	public Employee() {
		
	}

	public Employee(long id, String name, double payRate) {
		this.id = id;
		this.name = name;
		this.payRate = payRate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	

}
