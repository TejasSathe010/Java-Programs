package STUDENTDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Add {
	static void add(Statement stmt,Connection conn,String name,int age,String s_sex,String s_b1,String s_address,String s_course,String s_sem,String s_campus) {
	    String INSERT_RECORD = "insert into StudentDBMS(name,age,sex,benifits,address,course,semester,campus) values(?, ?, ?, ?, ?, ?, ?, ?)";

	    PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(INSERT_RECORD);

		    pstmt.setString(1, name);
		    pstmt.setInt(2, age);
		    pstmt.setString(3, s_sex);
		    pstmt.setString(4, s_b1);
		    pstmt.setString(5, s_address);
		    pstmt.setString(6, s_course);
		    pstmt.setString(7, s_sem);
		    pstmt.setString(8, s_campus);
		    
		    pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	 }
}
//name,age,sex,benifits,address,course,semester,campus