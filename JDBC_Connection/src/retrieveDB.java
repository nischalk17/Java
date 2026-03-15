import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class retrieveDB {

        public static void main(String[] args) {
            // Database Credentials
            String url = "jdbc:mysql://localhost:3306/teacher";  // Make sure 'Students' DB exists
            String user = "root";
            String password = "password";  // Optional in XAMPP

            // Correct SQL insert Query
            String query = "SELECT * FROM empolyees";

            try {
                // Load JDBC Driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Establish Connection
                Connection conn = DriverManager.getConnection(url, user, password);
                System.out.println("✅ Connection Successful");

                // Create Statement
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery(query);

                while(rs.next()){
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String job = rs.getString("job_title");
                    double salary = rs.getDouble("salary");
                    System.out.println("");
                    System.out.println("============================");
                    System.out.println("id:" +id);
                    System.out.println("Name:" +name);
                    System.out.println("Job:" +job);
                    System.out.println("Salary:" +salary);
                }
                conn.close();
            }

            catch (ClassNotFoundException e) {
                System.out.println("❌ JDBC Driver not found.");
                e.printStackTrace();
            }

            catch (Exception e) {
                System.out.println("❌ Error during database operation.");
                e.printStackTrace();
            }
        }
    }

