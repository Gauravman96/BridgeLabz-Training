import java.util.*;
public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter the index ");
        int idx= sc.nextInt();

        System.out.println("Value is " + arr[idx]);

    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Index out of bound");
    }catch(NullPointerException e){
        System.out.println("Array is not initialized");
    }



    }
}
