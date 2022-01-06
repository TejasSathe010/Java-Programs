// To use randomUUID function. 
import java.util.UUID; 

class Singleton 
{ 
	// Initializing values of single and ID to null. 
	private static Singleton single = null; 
	private String ID = null; 

	private Singleton() 
	{ 
		/* Make it private, in order to prevent the 
		creation of new instances of the Singleton 
		class. */

		// Create a random ID 
		ID = UUID.randomUUID().toString(); 
	} 

	public static Singleton getInstance() 
	{ 
		if (single == null) 
			single = new Singleton(); 
		return single; 
	} 

	public String getID() 
	{ 
		return this.ID; 
	} 
} 

// Driver Code 
public class Test
{ 
	public static void main(String[] args) 
	{ 
		Singleton s = Singleton.getInstance(); 
      	Singleton p = Singleton.getInstance();
      	if(s.getID().equals(p.getID())) {
    		System.out.println("Same"); 
      	}else {
    		System.out.println("Not Same"); 
      	}

		System.out.println(s.getID()); 
		System.out.println(p.getID()); 

	} 
} 
