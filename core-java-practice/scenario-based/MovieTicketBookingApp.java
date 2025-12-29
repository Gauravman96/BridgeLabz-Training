import java.util.Scanner;
public class MovieTicketBookingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char continueBooking = 'y'; 

        do {
            int ticketPrice = 0;

            System.out.println("\nSelect Movie Type:");
            System.out.println("1. Action");
            System.out.println("2. Comedy");
            System.out.println("3. Drama");

            int movieType = sc.nextInt();

            switch (movieType) {
                case 1:
                    ticketPrice = 200;
                    break;
                case 2:
                    ticketPrice = 180;
                    break;
                case 3:
                    ticketPrice = 150;
                    break;
                default:
                    System.out.println("Invalid movie type!");
                    continue; // restart loop
            }

            System.out.print("Select Seat Type (Gold/Silver): ");
            String seatType = sc.next();

            if (seatType.equalsIgnoreCase("Gold")) {
                ticketPrice += 100;
            } 
            else if (seatType.equalsIgnoreCase("Silver")) {
                ticketPrice += 50;
            } 
            else {
                System.out.println("Invalid seat type!");
                continue; // restart loop
            }

            System.out.print("Do you want snacks? (yes/no): ");
            String snacks = sc.next();

            if (snacks.equalsIgnoreCase("yes")) {
                ticketPrice += 80;
            }

            System.out.println("Total Ticket Price: ₹" + ticketPrice);

            System.out.print("Book another ticket? (y/n): ");
            continueBooking = sc.next().charAt(0);

        } while (continueBooking == 'y' || continueBooking == 'Y');

        System.out.println("Thank you for booking!");
        sc.close();
    }
}
