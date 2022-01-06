package STUDENTDB;
import java.sql.Connection;
import java.sql.Statement;

public class Create {
	static Statement create(Connection conn) {
		Statement stmt = null;
		String sql = "CREATE TABLE IF NOT EXISTS StudentDBMS (\n"
                + "	name text NOT NULL,\n"
                + "	age int NOT NULL,\n"
                + "	sex text NOT NULL,\n"
                + "	benifits text NOT NULL,\n"
                + "	address text NOT NULL,\n"
                + "	course text NOT NULL,\n"
                + "	semester text NOT NULL,\n"
                + "	campus text NOT NULL,\n"
                + ")";
		try {
			 stmt = conn.createStatement();
	         stmt.executeUpdate(sql);
	         System.out.println("Table Created...");
		}catch(Exception e){
			
		}
        return stmt;
	}
}

