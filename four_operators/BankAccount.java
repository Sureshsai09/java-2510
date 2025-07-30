public class BankAccount {
    
    // Variable declarations
    String accountHolderName;
    int accountNumber;
    double balance;
    double deposit;
    double withdraw;
    int noOfTransactions;
    boolean isActive;

    // Deposit method
    public void performDeposit(double amount) {
        if (amount > 0 && isActive) {
            deposit = amount;               // Store deposited amount
            balance = balance + amount;     // Arithmetic
            noOfTransactions++;             // Increment
        }
    }

    // Withdraw method
    public void performWithdraw(double amount) {
        if (amount > 0 && isActive) {
            if ((balance - amount) >= 500) {   // Relational check
                withdraw = amount;             // Store withdrawn amount
                balance = balance - amount;    // Arithmetic
                noOfTransactions++;            // Increment
            } else {
                System.out.println("Withdrawal denied: Minimum ₹500 balance required.");
            }
        }
    }

    // Print method
    public void printAccountSummary() {
        System.out.println("Account Holder Name   : " + accountHolderName);
        System.out.println("Account Number        : " + accountNumber);
        System.out.println("Final Balance         : " + balance);
        System.out.println("Total Deposited       : " + deposit);
        System.out.println("Last Withdrawal       : " + withdraw);
        System.out.println("Number of Transactions: " + noOfTransactions);
    }

    // Main method
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Set initial values
        account.accountHolderName = "sai Kumar";
        account.accountNumber = 12345678;
        account.balance = 1000.0;
        account.noOfTransactions = 0;
        account.isActive = true;

        // Perform some transactions
        account.performDeposit(500);    // Valid deposit
        account.performWithdraw(400);   // Valid withdrawal
        account.performWithdraw(800);   // Denied due to min balance
        account.performDeposit(-100);   // Invalid deposit

        // Display final account details
        account.printAccountSummary();
    }
}
