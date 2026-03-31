import java.util.*;
public class LeapYearLogical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year >= 1582 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is a Leap Year");
        } else if (year < 1582) {
            System.out.println("Invalid input. Leap year calculation works only for year >= 1582");
        } else {
            System.out.println(year + " is NOT a Leap Year");
        }
    }
}
