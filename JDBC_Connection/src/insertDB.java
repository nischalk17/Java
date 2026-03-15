import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insertDB {

    public static void main(String[] args) {
        // Database Credentials
        String url = "jdbc:mysql://localhost:3306/teacher";  // Make sure 'Students' DB exists
        String user = "root";
        String password = "password";  // Optional in XAMPP

        // Correct SQL insert Query
        String query = "INSERT INTO empolyees(id, name, job_title, salary) VALUES (12, 'Nischal', 'Developer', 300000)";

        try {
            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connection Successful");

            // Create Statement
            Statement stat = conn.createStatement();

            // Execute Update
            int rowsAffected = stat.executeUpdate(query);

            // Result Check
            if (rowsAffected > 0) {
                System.out.println("✅ Insertion Successful. Rows affected: " + rowsAffected);
            } else {
                System.out.println("⚠️ Insertion failed. No rows affected.");
            }

            // Close connection
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("❌ JDBC Driver not found.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("❌ Error during database operation.");
            e.printStackTrace();
        }
    }
}
