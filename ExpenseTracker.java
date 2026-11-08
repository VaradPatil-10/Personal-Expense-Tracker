import java.util.Scanner;
public class ExpenseTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] expenses = new String[100];
        double[] amounts = new double[100];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Personal Expense Tracker =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Total Spending");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < 100) {
                        sc.nextLine();

                        System.out.print("Enter expense name: ");
                        expenses[count] = sc.nextLine();

                        System.out.print("Enter amount: ");
                        amounts[count] = sc.nextDouble();

                        count++;

                        System.out.println("Expense added successfully!");
                    } else {
                        System.out.println("System limit reached!");
                    }
                    break;

                case 2:
                    System.out.println("\nYour Expenses:");

                    for (int i = 0; i < count; i++) {
                        System.out.println(expenses[i] + " - Rs. " + amounts[i]);
                    }

                    if (count == 0) {
                        System.out.println("No expenses found.");
                    }
                    break;

                case 3:
                    double total = 0;

                    for (int i = 0; i < count; i++) {
                        total += amounts[i];
                    }

                    System.out.println("Total Spending: Rs. " + total);
                    break;

                case 4:
                    System.out.println("Thank you for using Expense Tracker!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}