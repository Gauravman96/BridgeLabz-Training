public class InsertionSortEmployeeIDs {

    public static void insertionSort(int employeesID[]){
        int n = employeesID.length;

        for(int i =1;i<n;i++){
            int key= employeesID[i];
            int j =i-1;

            while(j>=0 && employeesID[j]>key){
                employeesID[j+1]=employeesID[j];
                j--;
            }
            employeesID[j+1]= key;
        }
    }
    public static void main(String[] args) {
        int employeesID[]= {130,104,230,107,98};

        System.out.println("Before Sorting");
        for(int id : employeesID){
            System.out.println(id+" ");
        }
         insertionSort(employeesID);
        System.out.println("\n After sorting");
        for(int id : employeesID){
            System.out.println(id+" ");
        }

    }
}
