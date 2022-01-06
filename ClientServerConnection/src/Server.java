import java.io.IOException;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
public class Server {
	final int cnt = 1;
	static List<Student> StudentList;
	//String adviceList[] = {"Take A Smaller Bites","Go For Thight Jeans : Don't Make You Look Fat",
			//"One Word : Inappropriate","Just For Today To Be Honest"};

	void go() {
		ServerSocket server;
		try {
			server = new ServerSocket(4242);
			Socket s = server.accept();
			OutputStreamWriter P = new OutputStreamWriter(s.getOutputStream());
			//String advice = getAdvice();
			//P.write(advice);
			P.close();
			//System.out.println(advice);
			
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*private String getAdvice() {
		int random = (int) (Math.random() * adviceList.length);
		return adviceList[random];
	}*/
	void AddStudent(int R,String F,String L) {
		StudentList = new ArrayList<Student>();
		System.out.println("Roll No :" + R + " First Name : " + F + " Last Name " + L);
		
		Student  stu = new Student(F,L,R);
		StudentList.add(stu);
		
		System.out.println("StuRoll No :" + stu.getRollNo() + " StuFirst Name : " + stu.getFirstName() + " StuLast Name " + stu.getLastName());
	}
	
	static List<Student> ListPass(){
		return StudentList;
	}
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Server S = new Server();
		S.go();

	}

}
