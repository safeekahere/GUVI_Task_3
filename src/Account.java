import java.util.Scanner;

public class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // No-argument constructor
    public Account() {
        this.accountNumber = "1234";
        this.accountHolderName = "Safeeka";
        this.balance = 5000.00; // Default balance
    }

    // Two-argument constructor
    public Account(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0; // Default balance
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be above zero.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to check balance
    public double checkBalance() {
        return balance;
    }

    // Method to display account details
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: $" + balance);
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Account account1 = new Account();
        account1.displayAccountInfo();

       
        System.out.print("Enter account number for account 2: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter account holder name for account 2: ");
        String accountHolderName = scanner.nextLine();
        Account account2 = new Account(accountNumber, accountHolderName);
        account2.displayAccountInfo();

        // Deposit and withdraw money
        while (true) {
            System.out.print("Enter the amount you want to deposit (or 0 to exit): ");
            double depositAmount = scanner.nextDouble();
            if (depositAmount == 0) break;
            account2.deposit(depositAmount);

            System.out.print("Enter the amount you want to withdraw (or 0 to exit): ");
            double withdrawAmount = scanner.nextDouble();
            if (withdrawAmount == 0) break;
            account2.withdraw(withdrawAmount);

            System.out.println("Balance after transactions: $" + account2.checkBalance());
        }

       
    }
}
