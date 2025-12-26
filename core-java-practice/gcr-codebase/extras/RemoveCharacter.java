import java.util.*;
public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        char remove= sc.next().charAt(0);
        
        StringBuilder res = new StringBuilder();
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)  != remove){
                res.append(str.charAt(i));
            }
        }
        System.out.println(res.toString());
    }
}
