import java.util.*; 

public class DStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an empty Stack 
        Stack<String> STACK = new Stack<String>(); 
  
        // Use push() to add elements into the Stack 
        STACK.push("Welcome"); 
        STACK.push("To"); 
        STACK.push("Geeks"); 
        STACK.push("For"); 
        STACK.push("Geeks"); 
  
        // Displaying the Stack 
        System.out.println("Initial Stack: " + STACK); 
  
        // Pushing elements into the stack 
        STACK.push("Hello"); 
        STACK.push("World"); 
  
        
        // Displaying the final Stack 
        System.out.println("Final Stack: " + STACK); 
        System.out.println("Last Stack Value: " + STACK.pop());
        System.out.println("Top Stack Value: " + STACK.peek()); 
        System.out.println("Stack Value Present: " + STACK.search("For"));
        System.out.println("Stack Value Present: " + STACK.empty()); 
	}
}
