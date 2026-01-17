import java.util.*;
public class RemoveDuplicate {

    public static String removedup(String s){
     StringBuilder sb = new StringBuilder();  // store result

        HashSet<Character> set= new HashSet<>();
         
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(! set.contains(ch)){
                sb.append(ch);
                set.add(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String res= removedup(s);
        System.out.println(res);
    }
}
