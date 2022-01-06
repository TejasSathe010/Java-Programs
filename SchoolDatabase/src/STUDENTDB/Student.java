package STUDENTDB;
/*import java.util.Scanner;
import java.sql.Connection;
import java.sql.Statement;


public class Student {

	public static void main(String[] args) {
		String DBName,TableNm;
		int Choice;
		Connection conn = null;
		Statement stmt = null;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("1.Create DataBase");
			System.out.println("2.Create Table");
			Choice = sc.nextInt();

			switch(Choice) {
			case 1:
				System.out.println("Enter DataBase Name....>>");
				DBName = sc.next();
				if(!DBName.isEmpty()) {
					conn = Connect.connect(DBName);
				}
				if(conn != null) {
					System.out.println("SQLite Connected...");
				}
				break;
			case 2:
				System.out.println("Enter Table Name....>>");
				TableNm = sc.next();
				stmt = Create.create(TableNm, conn);
				if(stmt != null) {
					System.out.println("Table Created...");
				}
				break;
			case 3: 
				System.out.println("Exiting Program...");
				System.exit(0);
				break;
			default:
				System.out.println(Choice + " is not a valid Menu Option! Please Select Another.");
			}
		}while(Choice != 3);
		sc.close();
	}
}
*/
