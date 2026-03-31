import java.util.*;
public class LexicographicalCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1= sc.next();
        String str2= sc.next();

        int str1len=str1.length();
        int str2len= str2.length();

        int minlen = Math.min(str1len,str2len);
     
        boolean isfoundlexicoorder= false;
        for(int i =0;i<minlen;i++){
            if(str1.charAt(i) != str2.charAt(i)){
                if(str1.charAt(i)< str2.charAt(i)){
                    System.out.println("\"" + str1 + "\" comes before \"" + str2 +
                            "\" in lexicographical order");
                }else{
                    System.out.println("\"" + str2 + "\" comes before \"" + str1 +
                            "\" in lexicographical order");
                }

            }
            isfoundlexicoorder= true;
            break;
        }


    }
}
