import java.sql.*;
public class SQLiteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection c = null;
		
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:test.db");
			System.out.println("SQLite Connected...");
			 String sql = "CREATE TABLE IF NOT EXISTS warehouses (\n"
		                + "	id integer PRIMARY KEY,\n"
		                + "	name text NOT NULL,\n"
		                + "	capacity real\n"
		                + ");";
			 try (Statement stmt = c.createStatement()) {
		            stmt.execute(sql);
					System.out.println("SQLite Table Created");				      
				      String sql1 = "INSERT INTO warehouses " +
				                   "VALUES (1, 'Zara', 18)";
				      stmt.executeUpdate(sql1);
				      sql1 = "INSERT INTO warehouses " +
				                   "VALUES (10, 'Mahnaz', 25)";
				      stmt.executeUpdate(sql1);
				      sql1 = "INSERT INTO warehouses " +
				                   "VALUES (12, 'Zaid', 30)";
				      stmt.executeUpdate(sql1);
				      sql1 = "INSERT INTO warehouses " +
				                   "VALUES(13, 'Sumit', 28)";
				      stmt.executeUpdate(sql1);
				      System.out.println("Inserted records into the table...");
				      String sql2 = "SELECT id, name, capacity FROM warehouses";
				      ResultSet rs = stmt.executeQuery(sql2);
				      //STEP 5: Extract data from result set
				      while(rs.next()){
				         //Retrieve by column name
				         int id  = rs.getInt("id");
				         String name = rs.getString("name");
				         int capacity = rs.getInt("capacity");

				         //Display values
				         System.out.print("ID: " + id);
				         System.out.print(", Name: " + name);
				         System.out.print(", Capacity: " + capacity);
				      }

		        } catch (SQLException e) {
		            System.out.println(e.getMessage());
		        }
		        
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
