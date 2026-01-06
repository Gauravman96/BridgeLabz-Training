import java.util.*;
public class ContainsDuplicate {
    public static boolean  containdup(int []nums){
        HashSet<Integer>set= new HashSet<>();
        for(int num :nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]= {3,5,6,89,6,8};
        System.out.println("COntain Duplicate"+containdup(nums));
    }
}
