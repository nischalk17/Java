import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class deleteDB {
    public static void main(String[] args) {
        // Database Credentials
        String url = "jdbc:mysql://localhost:3306/teacher";
        String user = "root";
        String password = "password";  // Optional in XAMPP

        // Correct SQL insert Query
        String query = "DELETE FROM empolyees WHERE id=12";

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
                System.out.println("✅ Deletion Successful. Rows affected: " + rowsAffected);
            } else {
                System.out.println("⚠️ Deletion failed. No rows affected.");
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



