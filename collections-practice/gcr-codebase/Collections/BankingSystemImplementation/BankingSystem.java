import java.util.*;

class BankingSystem {

    // AccountNumber -> Balance
    private Map<Integer, Integer> accounts = new HashMap<>();

    // Withdrawal requests
    private Queue<WithdrawalRequest> queue = new LinkedList<>();

    void addAccount(int accNo, int balance) {
        accounts.put(accNo, balance);
    }

    // Add withdrawal request
    void requestWithdrawal(int accNo, int amount) {
        queue.add(new WithdrawalRequest(accNo, amount));
    }

    // Process withdrawal queue
    void processWithdrawals() {

        while (!queue.isEmpty()) {

            WithdrawalRequest req = queue.remove();
            int accNo = req.accountNumber;
            int amount = req.amount;

            if (!accounts.containsKey(accNo)) {
                System.out.println("Account not found: " + accNo);
                continue;
            }

            int balance = accounts.get(accNo);

            if (balance >= amount) {
                accounts.put(accNo, balance - amount);
                System.out.println("Withdrawal successful: " + accNo);
            } else {
                System.out.println("Insufficient balance: " + accNo);
            }
        }
    }

    // Display accounts sorted by balance
    void displaySortedByBalance() {

        TreeMap<Integer, List<Integer>> sorted = new TreeMap<>();

        for (Map.Entry<Integer, Integer> entry : accounts.entrySet()) {
            sorted
                .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                .add(entry.getKey());
        }

        System.out.println("\nAccounts Sorted by Balance:");
        for (Map.Entry<Integer, List<Integer>> entry : sorted.entrySet()) {
            for (int accNo : entry.getValue()) {
                System.out.println("Account " + accNo + " -> Balance ₹" + entry.getKey());
            }
        }
    }
}
