import java.util.*;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;
        while (number != 0) {
            // Step 4: Remove last digit
            number = number / 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}
