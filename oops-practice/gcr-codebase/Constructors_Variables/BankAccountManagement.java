class BankAccount {

    // Access Modifiers
    public int accountNumber;        // accessible everywhere
    protected String accountHolder;  // accessible in subclass
    private double balance;          // accessible only inside this class

    // Constructor
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public getter for balance
    public double getBalance() {
        return balance;
    }

    // Public setter / updater for balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Display account info
    void displayAccount() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder Name: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {

    double interestRate;

    // Constructor
    SavingsAccount(int accountNumber, String accountHolder,
                   double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Demonstrates access to public & protected members
    void displaySavingsAccount() {
        System.out.println("Account No (Public): " + accountNumber);
        System.out.println("Account Holder (Protected): " + accountHolder);
        System.out.println("Balance (via getter): ₹" + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(
                123456, "Gaurav", 50000, 4.5);

        sa.displaySavingsAccount();

        // Modify balance using public methods
        sa.deposit(10000);
        sa.withdraw(5000);

        System.out.println("Updated Balance: ₹" + sa.getBalance());
    }
}


