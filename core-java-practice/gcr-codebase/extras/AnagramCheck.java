import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().toLowerCase();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().toLowerCase();

        // Remove spaces
        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        int[] freq = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }

        for (int count : freq) {
            if (count != 0) {
                System.out.println("Not Anagrams");
                return;
            }
        }

        System.out.println("Strings are Anagrams");
    }
}
