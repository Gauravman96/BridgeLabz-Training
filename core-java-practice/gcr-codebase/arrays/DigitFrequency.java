import java.util.*;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int[] digits = new int[count];
        int index = 0;

        while (number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }
        int[] frequency = new int[10];

        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }
    }
}
