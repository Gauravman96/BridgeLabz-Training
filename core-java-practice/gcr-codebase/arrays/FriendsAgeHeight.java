import java.util.*;
public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] age = new int[3];
        int[] height = new int[3];

        String[] names = {"Amar", "Akbar", "Anthony"};
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + ": ");
            height[i] = sc.nextInt();
        }

        int youngest = age[0];
        int tallest = height[0];

        for (int i = 1; i < 3; i++) {
            if (age[i] < youngest) {
                youngest = age[i];
            }
            if (height[i] > tallest) {
                tallest = height[i];
            }
        }

        System.out.println("Youngest age is: " + youngest);
        System.out.println("Tallest height is: " + tallest);
    }
}
