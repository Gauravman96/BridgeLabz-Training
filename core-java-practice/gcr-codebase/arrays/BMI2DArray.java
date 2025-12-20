import java.util.*;
public class BMI2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Input loop
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));

            while (true) {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] > 0)
                    break;
                System.out.println("Invalid weight! Enter positive value.");
            }
            while (true) {
                System.out.print("Enter height (meters): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] > 0)
                    break;
                System.out.println("Invalid height! Enter positive value.");
            }
        }
        // Calculate BMI & status
        for (int i = 0; i < number; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];

            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi < 18.5)
                weightStatus[i] = "Underweight";
            else if (bmi < 25)
                weightStatus[i] = "Normal";
            else if (bmi < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }
        System.out.println("\n--- Person BMI Details ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) +
                    " | Weight: " + personData[i][0] +
                    " | Height: " + personData[i][1] +
                    " | BMI: " + String.format("%.2f", personData[i][2]) +
                    " | Status: " + weightStatus[i]);
        }
    }
}
