public class BankingTest {

    public static void main(String[] args) {

        BankingSystem bank = new BankingSystem();

        // Add accounts
        bank.addAccount(101, 5000);
        bank.addAccount(102, 10000);
        bank.addAccount(103, 3000);

        // Withdrawal requests
        bank.requestWithdrawal(101, 2000);
        bank.requestWithdrawal(103, 5000);
        bank.requestWithdrawal(102, 3000);

        // Process withdrawals
        bank.processWithdrawals();

        // Display sorted accounts
        bank.displaySortedByBalance();
    }
}
