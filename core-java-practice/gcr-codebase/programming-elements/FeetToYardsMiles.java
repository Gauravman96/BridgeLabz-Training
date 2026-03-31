import java.util.Scanner;

public class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
       double distanceInFeet = sc.nextDouble();

        double yards = distanceInFeet / 3;
        double  miles = yards / 1760;

      
        System.out.println("Your Height in cm is " + miles +
                " while in feet is " + yards +
                " and inches is " + distanceInFeet);
    }
}
