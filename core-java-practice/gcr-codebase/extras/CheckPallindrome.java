import java.util.*;
public class CheckPallindrome {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a String");
       String str= sc.next();
       String rev= "";
       for(int i=str.length()-1;i>=0;i--){
        rev += str.charAt(i);
       }
       if(str.equals(rev)){
        System.out.println(" String is pallindrome");
       }else{
        System.out.println("String is not pallindrome");
       }
   } 
}
