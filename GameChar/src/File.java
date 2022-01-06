import java.io.*;
public class File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter W = new FileWriter("ABC.text");
			W.write("Hello....");
			W.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileReader R = new FileReader("ABC.text");
			int P = R.read();
			System.out.print(P);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
