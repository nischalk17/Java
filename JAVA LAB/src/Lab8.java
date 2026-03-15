import java.sql.*;
import java.util.Scanner;
public class Lab8 {
    private static final String URL = "jdbc:mysql://localhost:3306/student";
    private static final String USER = "root";
    private static final String PASSWORD = "sisam123";
    private Connection conn;
    public Lab8() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database connected successfully.");
        } catch (Exception e) {
            System.out.println("Database connection failed: " + e.getMessage());
        }
    }
    // CREATE
    public void addStudent(String name, int age, String address, String email, String phone) {
        String sql = "INSERT INTO student (name, age, address, email, phone) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, address);
            pstmt.setString(4, email);
            pstmt.setString(5, phone);
            pstmt.executeUpdate();
            System.out.println("Student added successfully!");
        } catch (SQLException e) {
            System.out.println("Error adding student: " + e.getMessage());
        }
    }

    // READ
    public void getStudents() {
        String sql = "SELECT * FROM student";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("\n--- Student Records ---");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Age: " + rs.getInt("age") +
                        ", Address: " + rs.getString("address") +
                        ", Email: " + rs.getString("email") +
                        ", Phone: " + rs.getString("phone"));
            }
        } catch (SQLException e) {
            System.out.println("Error fetching students: " + e.getMessage());
        }
    }

    // UPDATE
    public void updateStudent(int id, String name, int age, String address, String email, String phone) {
        String sql = "UPDATE student SET name=?, age=?, address=?, email=?, phone=? WHERE id=?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, address);
            pstmt.setString(4, email);
            pstmt.setString(5, phone);
            pstmt.setInt(6, id);
            int rows = pstmt.executeUpdate();
            if (rows > 0)
                System.out.println("Student updated successfully!");
            else
                System.out.println("No student found with ID " + id);
        } catch (SQLException e) {
            System.out.println("Error updating student: " + e.getMessage());
        }
    }

    // DELETE
    public void deleteStudent(int id) {
        String sql = "DELETE FROM student WHERE id=?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int rows = pstmt.executeUpdate();
            if (rows > 0)
                System.out.println("Student deleted successfully!");
            else
                System.out.println("No student found with ID " + id);
        } catch (SQLException e) {
            System.out.println("Error deleting student: " + e.getMessage());
        }
    }

    // MAIN (Menu-driven)
    public static void main(String[] args) {
        Lab8 crud = new Lab8();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== Student CRUD Menu ====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Address: ");
                    String address = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();
                    crud.addStudent(name, age, address, email, phone);
                    break;
                case 2:
                    crud.getStudents();
                    break;
                case 3:
                    System.out.print("Enter Student ID to update: ");
                    int idU = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String uName = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int uAge = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Address: ");
                    String uAddress = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String uEmail = sc.nextLine();
                    System.out.print("Enter Phone: ");
                    String uPhone = sc.nextLine();
                    crud.updateStudent(idU, uName, uAge, uAddress, uEmail, uPhone);
                    break;
                case 4:
                    System.out.print("Enter Student ID to delete: ");
                    int idD = sc.nextInt();
                    crud.deleteStudent(idD);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
