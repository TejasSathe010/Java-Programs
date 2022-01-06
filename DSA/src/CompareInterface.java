// Java program to demonstrate working of Comparator 
// interface 
import java.util.*; 

// A class to represent a student. 
class Student 
{ 
	int rollno; 
	String name, address; 

	// Constructor 
	public Student(int rollno, String name, 
							String address) 
	{ 
		this.rollno = rollno; 
		this.name = name; 
		this.address = address; 
	} 

	// Used to print student details in main() 
	public String toString() 
	{ 
		return this.rollno + " " + this.name + 
						" " + this.address; 
	} 
} 

class Sortbycity implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.address.compareTo(o2.address);
	}
	
}

class Sortbyroll implements Comparator<Student> 
{ 
	// Used for sorting in ascending order of 
	// roll number 
	public int compare(Student a, Student b) 
	{ 
		return a.rollno - b.rollno; 
	} 
} 

class Sortbyname implements Comparator<Student> 
{ 
	// Used for sorting in ascending order of 
	// roll name 
	public int compare(Student a, Student b) 
	{ 
		return a.name.compareTo(b.name); 
	} 
} 

// Driver class 
class CompareInterface 
{ 
	public static void main (String[] args) 
	{ 
		
		//ArrayList
		ArrayList<Integer> arr = new ArrayList<Integer>(); 
		arr.add(45);
		arr.add(35);
		arr.add(75);
		arr.add(55);
		arr.add(95);
		//Binary Search
		System.out.println(Collections.binarySearch(arr, 60));
		//Output Would Be -3 As 60 Can Be Inserted At 3..
		
		
		//Iterator
		Iterator<Integer> it = arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		while(it.hasNext()) {
			System.out.println(it.next());
			//Remove
			it.remove();
		}
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	
		//Vector
		Vector<Integer> v = new Vector<Integer>();
		for(int i = 1; i <= 10; i++ ) {
			v.add(i);
		}

		System.out.println(v);
		//Enumeration
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		System.out.println();
		System.out.println();

		//For Loop
		for(int i : arr) {
			System.out.println(i);
		}
		
		Collections.sort(arr);

		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i : arr) {
			System.out.println(i);
		}

		

		
		
		//ArrayList
		ArrayList<Student> ar = new ArrayList<Student>(); 
		ar.add(new Student(111, "bbbb", "london")); 
		ar.add(new Student(131, "aaaa", "nyc")); 
		ar.add(new Student(121, "cccc", "jaipur")); 
		
		ListIterator<Student> ltr = ar.listIterator();
		while(ltr.hasNext()) {
			System.out.println("\t\t\t\t\t\t" +ltr.nextIndex());
			ltr.next();
		}
	
		System.out.println("Unsorted"); 
		for (int i=0; i<ar.size(); i++) 
			System.out.println(ar.get(i)); 

		//Sorting Objects
		Collections.sort(ar, new Sortbyroll()); 

		System.out.println("\nSorted by Rollno"); 
		for (int i=0; i<ar.size(); i++) 
			System.out.println(ar.get(i)); 

		Collections.sort(ar, new Sortbyname()); 

		System.out.println("\nSorted by Name"); 
		for (int i=0; i<ar.size(); i++) 
			System.out.println(ar.get(i)); 
		

		Collections.sort(ar, new Sortbycity()); 

		System.out.println("\nSorted by Address"); 
		for (int i=0; i<ar.size(); i++) 
			System.out.println(ar.get(i));
	} 
} 
