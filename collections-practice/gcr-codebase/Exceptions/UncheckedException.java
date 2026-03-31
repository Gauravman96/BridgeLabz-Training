import java.util.*;
public class UncheckedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Enter the first number");
            int a = sc.nextInt();
           
            System.out.println("Enter the second number");
            int b = sc.nextInt();

            int res= a/b;
            System.out.println(res);


        } catch (ArithmeticException e) {
            System.out.println("Error : can not divide by zero");

        }catch(InputMismatchException e){
            System.out.println("enter valid numeric value");
        }
        finally{
            System.out.println("program execution completed");
        }
    }
}
