import java.util.*;
public class RotateList {
    public static void main(String[] args) {
         List<Integer> list = new ArrayList<>(List.of(10, 20, 30, 40, 50));

         int k =2;
         Collections.rotate(list, -k); // left rotation
RemoveDuplicates
         System.out.println(list);
    }
}
