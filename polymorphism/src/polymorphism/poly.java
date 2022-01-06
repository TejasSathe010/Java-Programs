package polymorphism;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class poly {

	private static int MONTH;
	private static int YEAR;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//list L = new list();
		cat c = new cat();
		dog d = new dog();
		//d.info();
		//d.display();
		//System.out.println(d.getClass() + " "+ d.hashCode());

		ArrayList<animal> A = new ArrayList<animal>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		B.add(5);
		//c.info();
		A.add(c);
		System.out.println(animal.x);
		//d.info();
		A.add(d);
		
		System.out.println(Math.round(Math.random()*10) + " " + Math.addExact(4, 6));
		
		String s = "5";
		String t = "4";
	
		
		System.out.println(Integer.parseInt(s) + Integer.parseInt(t) + " " + String.format("%,d",1000000));
		System.out.println(String.format("%tr", new Date()));
		System.out.println(String.format("%tA,%tB,%td", new Date(),new Date(),new Date()));
		System.out.println(String.format("%tA,%<TB,%<td", new Date()));
		
		Calendar c1 = Calendar.getInstance();
		//c1.roll(c1.DATE, 10);
		System.out.println(c1.get(c1.MINUTE));
	}

}
