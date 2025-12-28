import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    // Method to generate a guess between low and high
    public static int generateGuess(int low, int high) {
        return random.nextInt(high - low + 1) + low;
    }

    // Method to get feedback from user
    public static char getUserFeedback(int guess) {
        System.out.println("Computer guesses: " + guess);
        System.out.print("Enter feedback (H = too High, L = too Low, C = Correct): ");
        return sc.next().toUpperCase().charAt(0);
    }

    // Method to update range based on feedback
    public static int[] updateRange(char feedback, int guess, int low, int high) {
        if (feedback == 'H') {
            high = guess - 1;
        } else if (feedback == 'L') {
            low = guess + 1;
        }
        return new int[]{low, high};
    }

    public static void main(String[] args) {

        int low = 1;
        int high = 100;
        boolean isCorrect = false;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!\n");

        while (!isCorrect && low <= high) {

            int guess = generateGuess(low, high);
            char feedback = getUserFeedback(guess);

            if (feedback == 'C') {
                System.out.println("🎉 Yay! I guessed your number correctly!");
                isCorrect = true;
            } else if (feedback == 'H' || feedback == 'L') {
                int[] range = updateRange(feedback, guess, low, high);
                low = range[0];
                high = range[1];
            } else {
                System.out.println("Invalid input! Please enter H, L, or C.");
            }
        }
    }
}
