import java.util.*;
public class ConcatenateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  number of string");
        int n = sc.nextInt();
        sc.nextLine();

        String [] arr= new String[n];
        System.out.println("Enter the strings");
        for(int i =0;i<n;i++){
            arr[i]= sc.nextLine();
        }

    StringBuffer sb = new StringBuffer();
    for(String s :arr){
       sb.append(s);
    }
    System.out.println("Concatenate String is"+ sb.toString());
   

    }
}
