package Employee;

//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

class Employee extends Person implements Comparable<Employee>,Cloneable {
	private static int nextId = 1;
	private int id;
	private	double salary;
	private Date hireDay;
	
	static {
		Random r = new Random();
		nextId = r.nextInt(1000);
	}
	
	public Employee(String name, double salary, int year, int month, int day) {
		super(name);
		this.salary = salary;
		GregorianCalendar c = new GregorianCalendar(year,month-1,day);
		setHireDay(c.getTime());
		setId();
	}
	
	public Employee(String name, double salary) {
		super(name);
		this.salary = salary;
		setId();
	}
	
	public Employee(double salary) {
		this("Employee#"+nextId,salary);
	}
	

	public void setId() {
		id = nextId;
		nextId++;
	}

	public int getId() {
		return id;
	}
	
	public static int getNextId() {
		return nextId;
	}

	public double getSalary() {
		return salary;
	}
	
	public void raiseSalary(double per) {
		double raise = salary * per / 100;
		salary += raise;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return String.format("An Employee With Salary Of $%.2f", salary);
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return Double.compare(salary, o.salary);
	}
	
	public Employee clone() {
		Employee cloned;
		try {
			cloned = (Employee) super.clone();
			cloned.hireDay = (Date) hireDay.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return cloned;
	}

	public Date getHireDay() {
		return hireDay;
	}

	public void setHireDay(Date hireDay) {
		this.hireDay = hireDay;
	}

	

}

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* **Type 1**
		 * 
		 * ArrayList<Person> person = new ArrayList<>();
		
		Employee E = new Employee("Texas Bathe",85000);
		Student S = new Student("Agile Pail","E&TC");
		Manager boss = new Manager("Agar Pail",950000);
		boss.setBonus(8000);
		
		person.add(boss);
		person.add(E);
		person.add(S);
		
		
		person.set(0, S);
		person.set(1, boss);
		person.set(2, E);
		*
		*
		*/
		
		
		
		/* **Type 2**
		 *
		 * Employee[] staff = new Employee[4];
		Manager boss = new Manager("Earl Cracker",10000);
		staff[0] = boss;
		boss.setBonus(5000);
		staff[1] = new Employee("Teas Sate",85000);
		staff[2] = new Employee("Giver Pastor",75000);
		staff[3] = new Employee(4000);
		
		
		for(Employee e: staff) {
		e.raiseSalary(5);
		}
		
		Arrays.sort(staff);
		//person.trimToSize();
		
		
		for(Person e: staff) {
			System.out.print("Name : "+ e.getName());
			System.out.print(  "   ,  " + e.getDescription() + ".");
			System.out.println();
		}
		
		System.out.println("Next Available Id=" + Employee.getNextId());
		//System.out.println(person.size());
		 * 
		 * 
		 */
		
		
		
		/* **Type3**
		 * 
		 * Employee original = new Employee("Jack Gales",50000); 
		GregorianCalendar c = new GregorianCalendar(2018,3,4);
		original.setHireDay(c.getTime());
		Employee cloned = original.clone();
		cloned.raiseSalary(10);
		System.out.println("Original=" + original.getSalary());
		System.out.println("Cloned=" + cloned.getSalary());	
		*
		*
		*/	
		
		
		
		Manager original = new Manager("Jack Kalies",50000);
		original.setBonus(23232);
		GregorianCalendar c = new GregorianCalendar(2018,3,4);
		original.setHireDay(c.getTime());
		Employee cloned = original.clone();
		cloned.raiseSalary(10);
		System.out.println("Original=" + original.getSalary());
		System.out.println("Cloned=" + cloned.getSalary());	

	}

}
