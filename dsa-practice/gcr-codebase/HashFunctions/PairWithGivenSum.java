import java.util.*;
public class PairWithGivenSum {

    public static boolean hasPair(int arr[],int target){
       HashSet<Integer>set= new HashSet<>();

       for(int num : arr){
          int complement= target-num;

          if(set.contains(complement)){
              System.out.println("Pair found: " + num + " + " + complement + " = " + target);
                return true;
          }
          set.add(num);
       }
       return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= {8,7,2,6,5,3,2};
        int target= sc.nextInt();

        if(!hasPair(arr, target)){
            System.out.println("no pair found");
        }
    }
    
}
