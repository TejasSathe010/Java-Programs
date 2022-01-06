package Employee;

public class Manager extends Employee{
	private double bonus;
	Manager(String name,double salary){
		super(name,salary);
		bonus = 0;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	 public double getSalary() {
		double baseSalary = super.getSalary();
		return	baseSalary + bonus;
	}
	
	public String getDescription() {
		// TODO Auto-generated method stub
		return String.format("An Manager With Salary Of $%.2f", getSalary());
	}
	

}
