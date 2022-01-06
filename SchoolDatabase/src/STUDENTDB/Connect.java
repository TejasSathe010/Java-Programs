package STUDENTDB;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

	static Connection connect() {
		
		Connection conn =null;
		String url = "jdbc:sqlite:StudentDatabase"; 		   
        try {  
			Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(url);  
            if (conn != null) {  
                DatabaseMetaData meta = conn.getMetaData();  
                System.out.println("The driver name is " + meta.getDriverName() + " " + meta.getURL());  
                System.out.println("A new database has been created.");
            }  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return conn;
	}
}


