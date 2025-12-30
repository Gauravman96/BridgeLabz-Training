import java.util.*;
public class LineComparison {
    public static double calculatelength(int x1,int x2,int y1,int y2){
        return Math.sqrt(Math.pow(x1,x2)+Math.pow(y1,y2));
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        // Line 1 input
        System.out.println("\nEnter coordinates for Line 1:");
        Scanner sc = new Scanner(System.in);
        int x1= sc.nextInt();
        int y1= sc.nextInt();
        int x2= sc.nextInt();
        int y2= sc.nextInt();

        // Line 2 input
        System.out.println("\nEnter coordinates for Line 2:");
         int x3= sc.nextInt();
        int y3= sc.nextInt();
        int x4= sc.nextInt();
        int y4= sc.nextInt();

        //UC1- calculate length
        Double length1= calculatelength(x1, y1, y1, y2);
        Double length2= calculatelength(x3, y3, x4, y4);

        System.out.printf("\nLength of Line 1: %.2f%n " , length1);
        System.out.printf("Length of Line 2: %.2f%n " ,length2);

        //UC2- check equality using equals();
        if(length1.equals(length2)){
            System.out.println("Both lines are equals");
        }else {
            System.out.println("Both lines are not equals");
        }

        //UC3- comapre lines using compareto()
      int result= length1.compareTo(length2);
      if(result==0) System.out.println("Both lines a re equal");
      else if(result>0) System.out.println("Line 1 is greater than line 2");
      else System.out.println("line 1 less than line 2");
      sc.close();
    }
}
