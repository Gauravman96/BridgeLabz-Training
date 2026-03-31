import java.util.*;
public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str= sc.next();
        System.out.println("Enter substring");
        String sub= sc.next();

        int count=0;

        for(int i =0;i<=str.length()- sub.length();i++){
            if(str.substring(i,i+sub.length()).equals(sub)){
                count++;
            }
        }
        System.out.println("occurances"+ count);
    }
}
