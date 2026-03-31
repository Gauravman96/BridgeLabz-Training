import java.util.*;
public class StudentGradeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[][] marks = new double[n][3]; // 0-Physics, 1-Chemistry, 2-Maths
        double[] percentage = new double[n];
        char[] grade = new char[n];

       
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            for (int j = 0; j < 3; j++) {
                while (true) {
                    if (j == 0)
                        System.out.print("Enter Physics marks: ");
                    else if (j == 1)
                        System.out.print("Enter Chemistry marks: ");
                    else
                        System.out.print("Enter Maths marks: ");

                    marks[i][j] = sc.nextDouble();

                    if (marks[i][j] >= 0)
                        break;
                    else
                        System.out.println("Invalid marks! Enter positive value.");
                }
            }
        }
        for (int i = 0; i < n; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3;

            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }
        System.out.println("\n--- Student Result ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + String.format("%.2f", percentage[i]) + "%");
            System.out.println("Grade: " + grade[i]);
            System.out.println();
        }
    }
}
