import java.util.*;
public class SImpleInterest {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Double principle= sc.nextDouble();
        Double rate= sc.nextDouble();
        Double time= sc.nextDouble();
        Double SI= (principle *rate *time)/100;
        System.out.println("simple interest is"+SI);

        

     }
}
