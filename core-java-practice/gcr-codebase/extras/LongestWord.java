import java.util.*;
public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();

        String[] words = str.split(" ");
        String longestword= "";
        for(String word : words){
            if(word.length() >longestword.length()){
                longestword= word;
            }

        }
        System.out.println(longestword);
    }
}
