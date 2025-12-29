import java.util.*;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s= sc.next().toLowerCase();
        int consonant=0;
        int vowels=0;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
             if(ch >= 'a' && ch<='z'){
                if(ch !='a' && ch!='e' && ch!='i'&& ch!='o' && ch!='u'){
                    consonant++;
                }else{
                    vowels++;
                }
             }
        }
        System.out.println("consonant is "+consonant);
        System.out.println("vowels is "+ vowels);
    }
}
