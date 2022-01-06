package StudentDBMS;
import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {
	private static final String sMakeInsert = "INSERT INTO Student(name,age,s_sec,s_b1 ,s_address,s_course,s_sem,s_campus) VALUES(?,?,?,?,?,?,?,?)";
	static Statement stmt = null;

	String name;
	int age;
	String s_sex, s_b1, s_address, s_course, s_sem, s_campus;


	static void add(Connection conn,String name,int age,String s_sex,String s_b1,String s_address,String s_course,String s_sem,String s_campus) {

		PreparedStatement ps = null;
		int numRowsInserted = 0;

		try {
			//stmt.executeUpdate( sMakeInsert );
			ps = conn.prepareStatement(sMakeInsert);
			ps.setString(1, name);
			ps.setInt(2, age);
			ps.setString(3, s_sex);
			ps.setString(4, s_b1);
			ps.setString(5, s_address);
			ps.setString(6, s_course);
			ps.setString(7, s_sem);
			ps.setString(8, s_campus);
			numRowsInserted = ps.executeUpdate();
			conn.commit();  
			System.out.println(numRowsInserted);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	static Statement create(Connection conn) {

		int iTimeout = 30;
		String sMakeTable = "CREATE TABLE IF NOT EXISTS Student (name text,age int,s_sec text,s_b1 text,s_address text,s_course text,s_sem text,s_campus text )";

		try {
			stmt = conn.createStatement();
			stmt.setQueryTimeout(iTimeout);
			stmt.executeUpdate( sMakeTable );

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return stmt;
	}
}


