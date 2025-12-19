import java.util.*;
public class DivideByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = sc.nextInt();
        if(num%5==0){
            System.err.println("Is the number " + num + " divisible by 5? Yes");
        }else{
            System.out.println("Is the number " + num + " divisible by 5? No");
        }

    }
}
