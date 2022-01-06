package Employee;

public abstract class Person {
	public abstract String getDescription();
	private String name; 
	
	Person(String name){
		this.name = name;
	}
	
	 public String getName() {
			return name;
		}

}
