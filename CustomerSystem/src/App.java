import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class App {
    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/customer_manage",
                    "root",
                    "Savas1453.."
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}