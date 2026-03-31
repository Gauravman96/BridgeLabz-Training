import java.util.*;
public class FibonacciGenerator {
   
    public static void printfabonacci(int terms){
        int a =0 , b=1;
        System.out.println("fabonacci sequence");
        for(int i =0;i<terms;i++){
            System.out.println(a+"");
            int next = a+b;
             a=b;
             b= next;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the terms");
        int terms= sc.nextInt();
        printfabonacci(terms);
    }

}
