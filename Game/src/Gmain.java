import java.util.Random;

public class Gmain {
	
	Gmain(){

		Random ran = new Random();
		int a = ran.nextInt();
		if((-a) < 200000000) {
			System.out.println(1);			
		}else if((-a) < 400000000) {
			System.out.println(2);			
		}else if((-a) < 600000000) {
			System.out.println(3);			
		}else if((-a) < 800000000) {
			System.out.println(4);			
		}else if((-a) > 200000000) {
			System.out.println(0);			
		}else if((-a) > 400000000) {
			System.out.println(2);			
		}else if((-a) > 600000000) {
			System.out.println(4);			
		}else if((-a) > 800000000) {
			System.out.println(6);			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Gmain();
	}

}
