import java.util.*;
public class Power_calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("Enter the base");

    int base = sc.nextInt();
    System.out.println("Enter the exponent");
    int exponent = sc.nextInt();

    int result= (int)Math.pow(base,exponent);
    System.out.println(result);
    }
   

}
