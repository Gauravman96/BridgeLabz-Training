import java.util.*;

abstract  class Account{
    private int accountNumber;
    private String holderName;
    protected double balance;

    public Account(int accountNumber, String holderName,double balance){
           this.accountNumber = accountNumber;
           this.holderName= holderName;
           this.balance= balance;
    }

    public void deposit(double amount){
       balance += amount;
       System.out.println(amount + " deposited. New balance: " + balance);
    }

    public void withdraw(double amount)
        throws InsufficientBalanceException{
            if (balance < amount) {
            throw new InsufficientBalanceException("Insufficient Balance!");
        }
        balance -= amount;
        System.out.println(amount + " withdrawn. New balance: " + balance);
        

    }
        public double getBalance(){
            return balance;
        }

        public String getHolderName() {
        return holderName;
    }

    public abstract double calculateInterest();

}

//SavingsAccount class

class SavingAccount extends Account{
    public SavingAccount(int accNo, String name ,double balance){
        super(accNo,name,balance);
    }

    @Override
    public double calculateInterest(){
        return balance*0.04; // 4% interest
    }
}

//CurrentAccount

class CurrentAccount extends Account {

    public CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.02; // 2% interest
    }
}

interface BankService {
    void transfer(Account from, Account to, double amount)
            throws InsufficientBalanceException;

    void showBalance(Account account);
}


class Transaction {
    private String details;

    public Transaction(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }
}

//BankService Implementation

class BankServiceImpl implements BankService {

    private List<Transaction> history = new ArrayList<>();

    @Override
    public synchronized void transfer(Account from, Account to, double amount)
            throws InsufficientBalanceException {

        from.withdraw(amount);
        to.deposit(amount);

        history.add(new Transaction(
                "Transferred " + amount +
                " from " + from.getHolderName() +
                " to " + to.getHolderName()
        ));

        System.out.println("Transfer Successful!");
    }

    @Override
    public void showBalance(Account account) {
        System.out.println(
            "Balance of " + account.getHolderName() + " : " + account.getBalance()
        );
    }

    public void showTransactionHistory() {
        System.out.println("\n---- Transaction History ----");
        for (Transaction t : history) {
            System.out.println(t.getDetails());
        }
    }
}

//Multithreading

class TransactionTask extends Thread{
    private BankService bankService;
    private Account from;
    private Account to;
    private double amount;

    public TransactionTask(BankService bankService,Account from, Account to, double amount) {
        this.bankService = bankService;
        this.from = from;
        this.to = to;
        this.amount = amount;
}
    @Override
    public void run() {
        try {
            bankService.transfer(from, to, amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}


public class OnlineBankingApp {

    public static void main(String[] args) {

        Account acc1 = new SavingAccount(101, "Gaurav", 10000);
        Account acc2 = new CurrentAccount(102, "Rahul", 5000);

        BankServiceImpl bankService = new BankServiceImpl();

        Thread t1 = new TransactionTask(bankService, acc1, acc2, 2000);
        Thread t2 = new TransactionTask(bankService, acc1, acc2, 3000);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        bankService.showBalance(acc1);
        bankService.showBalance(acc2);

        System.out.println("\nInterest on Savings: " + acc1.calculateInterest());
        System.out.println("Interest on Current: " + acc2.calculateInterest());

        bankService.showTransactionHistory();
    }
}
