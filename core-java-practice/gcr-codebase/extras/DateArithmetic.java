import java.time.LocalDate;
import java.util.*;
public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date (yyyy-mm-dd): ");
        String inputdate = sc.next();

        LocalDate date = LocalDate.parse(inputdate);
          // Add 7 days, 1 month, and 2 years
        LocalDate updatedDate = date
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2);

        // Subtract 3 weeks
        updatedDate = updatedDate.minusWeeks(3);

        System.out.println("Final Date: " + updatedDate);
    }
}
