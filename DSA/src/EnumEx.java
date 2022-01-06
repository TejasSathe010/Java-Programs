enum TrafficSignal 
{ 
    // This will call enum constructor with one 
    // String argument 
    RED("STOP"), GREEN("GO"), ORANGE("SLOW DOWN"); 
  
    // declaring private variable for getting values 
    private String action; 
  
    // getter method 
    public String getAction() 
    { 
        return this.action; 
    } 
  
    // enum constructor - cannot be public or protected 
    private TrafficSignal(String action) 
    { 
        this.action = action; 
    } 
} 
  
// Driver code 
public class EnumEx 
{ 
    public static void main(String args[]) 
    { 
        // let's print name of each enum and there action 
        // - Enum values() examples 
        TrafficSignal[] signals = TrafficSignal.values(); 
  
        for (TrafficSignal signal : signals) 
        { 
            // use getter method to get the value 
            System.out.println("name : " + signal.name() + 
                        " action: " + signal.getAction() ); 
        }
        
        StringBuffer sbf = new StringBuffer("JAV"); 
        System.out.println("String buffer = " + sbf); 
  
        // Here it appends the CodePoint as 
        // string to the string buffer 
        sbf.appendCodePoint(65); 
  
        System.out.println("After appending CodePoint is = " + sbf);

        int i = 1; 
  
        if (i > 15) 
            System.out.println("10 is less than 15"); 
  
        // This statement will be executed 
        // as if considers one statement by default 
        System.out.println("I am Not in if"); 
    } 
} 