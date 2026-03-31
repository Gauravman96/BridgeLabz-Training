import java.util.Scanner;

public class HeightConverte {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter your height in centimeters");
         double heightCm = sc.nextDouble();

        // Convert cm to inches
         double totalInches = heightCm / 2.54;

        // Convert inches to feet and remaining inches
         double feet = (int) (totalInches / 12);
         double inches = totalInches % 12;

        System.out.println("Your Height in cm is " + heightCm +
                           " while in feet is " + feet +
                           " and inches is " + inches);
    }
}
