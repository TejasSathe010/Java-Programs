import java.io.IOException;
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client {

	public void go() {
		Socket A;
		try {
			A = new Socket("127.00.1",4242);
			InputStreamReader  R = new InputStreamReader(A.getInputStream());
			BufferedReader B = new BufferedReader(R);
			
			String FirstName,LastName;
			int RollNo;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Your Roll No..");
			RollNo = sc.nextInt();
			System.out.println("Enter Your First Name..");
			FirstName = sc.next();
			System.out.println("Enter Your Last Namr..");
			LastName = sc.next();
			
			Server S = new Server();
			S.AddStudent(RollNo, FirstName, LastName);


			
			

			//String Advice = B.readLine();
			//System.out.println("Today You Should: " + Advice);
			B.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Client C = new Client();
		C.go();
	}
}
