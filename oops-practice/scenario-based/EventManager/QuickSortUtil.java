
public class QuickSortUtil {
    
    // Partition logic

    static int partition(Ticket[] arr , int low , int high){
         double pivot = arr[high].price;
         int i = low-1;

         for(int j =low;j<high;j++){
            if(arr[j].price <= pivot){
                i++;
                swap(arr,i,j);
            }
         }

         swap(arr,i+1,high);
         return i+1;
    }

         // quick sort

         static void quickSort(Ticket [] arr, int low, int high){
            if(low<high){
                int pi= partition(arr, low, high);

                quickSort(arr, low,pi-1);
                quickSort(arr, pi+1, high);
            }
         }

         static  void swap(Ticket[] arr, int i ,int j){
            Ticket temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
         }
}

