import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.print("Enter base in inches: ");
       double  base = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();

        // Calculate area
        double areaInSqInches = 0.5 * base * height;
        double areaInSqCm = areaInSqInches * 6.4516; // 1 square inch = 6.4516 square cm

        System.out.println("Your Height in cm is " + areaInSqCm +
                " while in feet is " + areaInSqInches +
                " and inches is " + areaInSqCm);
    }
}
