import java.util.Calendar;
import static java.lang.System.out;
import java.util.Date;
import java.util.GregorianCalendar;

class Test {
	GregorianCalendar c;
	Date d;
	String Name;
	String aName;
	
	Test(String n){
		Name = n;
	}
	
	Test(String N,String n){
		this(n);
		aName = N;
	}
	
	Test(){
		d = new Date();
		c = new GregorianCalendar(2018,8,3,04,8,13);
		//c.setTime(d);
		//c.add(Calendar.DAY_OF_MONTH, 5);
		
	}
	void date() {
		out.println(c.getTime());
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		
		
	
		System.out.println(year + " : " + month + " : " + day + " : " + hour + " : " + min + " : " +sec);
		//System.out.println(c.get(Calendar.DAY_OF_WEEK));

	}
}
class PassOb {
	public static void main(String args[]) {
		Test t = new Test();
		t.date();
	} 
}