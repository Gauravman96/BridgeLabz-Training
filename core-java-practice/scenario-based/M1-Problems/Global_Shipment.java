import java.time.LocalDate;
import java.util.Scanner;

public class Global_Shipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  no. of ids");
        int n = Integer.parseInt(sc.nextLine());

        String regex= "^(?!.*(\\d)\\1{3})SHIP-[1-9]\\d{5}\\|"+
                        "20\\d{2}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])\\|"+
                        "(AIR|SEA|ROAD|RAIL|EXPRESS|FREIGHT)\\|"+
                        "(0|[1-9]\\d{0,5})(\\.\\d{1,2})?\\|"+
                        "(DELIVERED|CANCELLED|IN_TRANSIT)$";

         for(int i =0;i<n;i++){
            String record = sc.nextLine();

            if(!record.matches(regex)){
                 System.out.println("NON-COMPLIANT RECORD");
                continue;
            }

            String date = record.split("\\|")[1];

            try {
                LocalDate.parse(date);
                System.out.println("COMPLIANT RECORD");
            } catch (Exception e) {
                System.out.println("NON-COMPLIANT RECORD");
            }
         }               
    }
}
