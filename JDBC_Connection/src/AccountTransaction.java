import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountTransaction {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/teacher";
        String user = "root";
        String password = "password";

        String fromAccount = "ACC1001";
        String toAccount = "ACC1002";
        double amount = 500;

        String checkBalanceSQL = "SELECT balance FROM account WHERE account_number = ?";
        String debitSQL = "UPDATE account SET balance = balance - ? WHERE account_number = ?";
        String creditSQL = "UPDATE account SET balance = balance + ? WHERE account_number = ?";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            conn.setAutoCommit(false);

            PreparedStatement checkStmt = conn.prepareStatement(checkBalanceSQL);
            checkStmt.setString(1, fromAccount);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                double currentBalance = rs.getDouble("balance");

                if (currentBalance >= amount) {
                    PreparedStatement debitStmt = conn.prepareStatement(debitSQL);
                    debitStmt.setDouble(1, amount);
                    debitStmt.setString(2, fromAccount);
                    debitStmt.executeUpdate();

                    PreparedStatement creditStmt = conn.prepareStatement(creditSQL);
                    creditStmt.setDouble(1, amount);
                    creditStmt.setString(2, toAccount);
                    creditStmt.executeUpdate();

                    conn.commit();
                    System.out.println("Transaction successful: " + amount + " transferred from " + fromAccount + " to " + toAccount);
                } else {
                    System.out.println("Insufficient balance in: " + fromAccount);
                    conn.rollback();
                }
            } else {
                System.out.println("From account not found");
                conn.rollback();
            }

        } catch (SQLException e) {
            e.printStackTrace();
            if (conn != null) {
                try {
                    conn.rollback();
                    System.out.println("Transaction rolled back due to error");
                } catch (SQLException rollbackEx) {
                    rollbackEx.printStackTrace();
                }
            }
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException closeEx) {
                    closeEx.printStackTrace();
                }
            }
        }
    }
}
