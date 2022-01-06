
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

	static Connection connect() {
		
		Connection conn =null;
		try {
			String sDriverName = "org.sqlite.JDBC";
			Class.forName(sDriverName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// now we set up a set of fairly basic string variables to use in the body of the code proper
		String sTempDb = "hello.db";
		String sJdbc = "jdbc:sqlite";
		String sDbUrl = sJdbc + ":" + sTempDb;
		try {
			conn = DriverManager.getConnection(sDbUrl);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return conn;
	}
}


