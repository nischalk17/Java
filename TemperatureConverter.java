import java.sql.*;
import java.util.Scanner;   

public class TemperatureConverter {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/java_nccs";
    
    static final String USER = "root";
    static final String PASS = "sisam123";
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);   
        System.out.println("Temperature Converter");       
        System.out.println("1. Celsius to Fahrenheit and Kelvin");
        System.out.println("2. Fahrenheit to Celsius and Kelvin");
        System.out.println("3. Kelvin to Celsius and Fahrenheit");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                celsiusToFahrenheitAndKelvin();
                break;
            case 2:
                fahrenheitToCelsiusAndKelvin();
                break;
            case 3:
                kelvinToCelsiusAndFahrenheit();
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
    // Method to retrieve conversion factor from the database using prepared statement
public static double getConversionFactor(String conversionType) throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    double conversionFactor = 0.0;
    try {
        Class.forName(JDBC_DRIVER);
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        
        String sql = "SELECT conversion_factor FROM temperature_conversion_factors WHERE conversion_type = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, conversionType);
        
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            conversionFactor = rs.getDouble("conversion_factor");
        }
        rs.close();
    } catch (SQLException se) {
        se.printStackTrace();
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        if (stmt != null) {
            stmt.close();
        }
        if (conn != null) {
            conn.close();
        }
    }
    return conversionFactor;
}

// Modify conversion methods to use database retrieval
public static void celsiusToFahrenheitAndKelvin() throws SQLException {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter temperature in Celsius: ");
    double celsius = scanner.nextDouble();
    
    double fahrenheit = (celsius * getConversionFactor("Celsius to Fahrenheit")) + 32;
    double kelvin = celsius + getConversionFactor("Celsius to Kelvin");
    
    System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    System.out.println("Temperature in Kelvin: " + kelvin);
    
    scanner.close();
}

public static void fahrenheitToCelsiusAndKelvin() throws SQLException {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter temperature in Fahrenheit: ");
    double fahrenheit = scanner.nextDouble();
    
    double celsius = (fahrenheit - 32) * getConversionFactor("Fahrenheit to Celsius");
    double kelvin = (fahrenheit + 459.67) * (5.0 / 9.0);
    
    System.out.println("Temperature in Celsius: " + celsius);
    System.out.println("Temperature in Kelvin: " + kelvin);
    
    scanner.close();
}

public static void kelvinToCelsiusAndFahrenheit() throws SQLException {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter temperature in Kelvin: ");
    double kelvin = scanner.nextDouble();
    
    double celsius = kelvin + getConversionFactor("Kelvin to Celsius");
    double fahrenheit = (kelvin * 1.8) - 459.67; // Convert Kelvin directly to Fahrenheit
    
    System.out.println("Temperature in Celsius: " + celsius);
    System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    
    scanner.close();
}
}
