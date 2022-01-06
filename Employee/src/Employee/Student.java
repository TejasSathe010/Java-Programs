package Employee;

public class Student extends Person{
	private String major;

	Student(String name,String major){
		super(name);
		this.major = major;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "A Student Majoring In " + major;
	}

}
