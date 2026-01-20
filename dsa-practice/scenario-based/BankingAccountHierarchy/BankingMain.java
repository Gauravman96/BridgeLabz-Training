public class BankingMain {

    public static void main(String[] args) {

        BankAccount savings1 = new SavingsAccount("12345", 1000);
        System.out.printf("%.2f%n", savings1.calculateFee()); // 5.00

        BankAccount savings2 = new SavingsAccount("22222", 500);
        System.out.printf("%.2f%n", savings2.calculateFee()); // 2.50

        BankAccount checking1 = new CheckingAccount("33333", 1500);
        System.out.printf("%.2f%n", checking1.calculateFee()); // 0.00

        BankAccount checking2 = new CheckingAccount("44444", 500);
        System.out.printf("%.2f%n", checking2.calculateFee()); // 1.00
    }
}