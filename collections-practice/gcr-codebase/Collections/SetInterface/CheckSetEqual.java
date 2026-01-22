import java.util.*;

public class CheckSetEqual{
     public static void main(String[] args) {
         HashSet<Integer>set1= new HashSet<>(Set.of(1,2,3));
         HashSet<Integer>set2 = new HashSet<>(Set.of(1,2,3));

         System.out.println(set1.equals(set2));
         
     }
}