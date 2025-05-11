import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExpenseManager {
    private Connection conn;

    public ExpenseManager() {
        conn = DBConnector.connect();
    }

    public void addExpense(double amount, String category, String note) {
        if (conn == null) {
            System.out.println("❌ Connection is null. Cannot add expense.");
            return;
        }

        String sql = "INSERT INTO expenses (amount, category, note) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setDouble(1, amount);
            pstmt.setString(2, category);
            pstmt.setString(3, note);
            pstmt.executeUpdate();
            System.out.println("✅ Expense added.");
        } catch (Exception e) {
            System.out.println("❌ Error adding expense: " + e.getMessage());
        }
    }

    public void viewExpenses() {
        if (conn == null) return;

        String sql = "SELECT * FROM expenses";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ". ₹" + rs.getDouble("amount")
                        + " - " + rs.getString("category")
                        + " (" + rs.getString("note") + ")");
            }
        } catch (Exception e) {
            System.out.println("❌ Error retrieving expenses: " + e.getMessage());
        }
    }

    public double getTotalExpenses() {
        if (conn == null) return 0;

        double total = 0;
        try (PreparedStatement stmt = conn.prepareStatement("SELECT SUM(amount) AS total FROM expenses");
             ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) total = rs.getDouble("total");
        } catch (Exception e) {
            System.out.println("❌ Error calculating total: " + e.getMessage());
        }
        return total;
    }
}
