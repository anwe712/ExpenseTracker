import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();
        User user = new User();

        while (true) {
            System.out.println("\n=== Expense Tracker ===");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Set Monthly Budget");
            System.out.println("4. View Summary");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter category: ");
                    String category = sc.nextLine();
                    System.out.print("Enter note (optional): ");
                    String note = sc.nextLine();
                    manager.addExpense(amount, category, note);
                    break;

                case 2:
                    manager.viewExpenses();
                    break;

                case 3:
                    System.out.print("Enter monthly budget: ");
                    double budget = sc.nextDouble();
                    user.setMonthlyBudget(budget);
                    break;

                case 4:
                    double total = manager.getTotalExpenses();
                    System.out.println("Total Spent: ₹" + total);
                    System.out.println("Budget Left: ₹" + (user.getMonthlyBudget() - total));
                    break;

                case 5:
                    System.out.println("👋 Exiting. Bye!");
                    System.exit(0);

                default:
                    System.out.println("❌ Invalid choice.");
            }
        }
    }
}
