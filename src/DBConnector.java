import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {
    private static final String DB_URL = "jdbc:sqlite:database/expense_tracker.db";

    public static Connection connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(DB_URL);
        } catch (Exception e) {
            System.out.println("❌ Database connection failed: " + e.getMessage());
            return null;
        }
    }
}
