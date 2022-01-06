package polymorphism;

import java.util.Scanner;

public class animal {
	static {
		String MY_NAME = "Tejas";
	}
	static int x = 0;
	String name,spe,color;
	int age,height,weight;
	void info() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Name OF Animal");
		name = s.next();
		x++;
		/*System.out.println("Enter Species OF Animal");
		spe = s.next();
		System.out.println("Enter Color OF Animal");
		color = s.next();
		System.out.println("Enter Age OF Animal");
		age = s.nextInt();
		System.out.println("Enter Height OF Animal");
		height = s.nextInt();
		System.out.println("Enter Weight OF Animal");
		weight = s.nextInt();*/
		s.close();
	}
	void display() {
		System.out.print("The Animal Is " + name + ". The Species Of The Animal IS " + spe );
	}

}
