public class SortStudentMarks {

    public static void SortMarks(int marks[]){
        int n = marks.length;
        for(int i =0;i<n-1;i++){
            for(int j =0;j<n-i-1;j++){
                if(marks[j]>marks[j+1] ){
                    int temp= marks[j];
                    marks[j]= marks[j+1];
                    marks[j+1]= temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int marks[]= {34,21,56,44,78,89,54};
        SortMarks(marks);
       // System.out.println(Arrays.toString(marks));
       for(int i=0;i<marks.length;i++){
        System.out.print(marks[i]+" ");
       }
    }

}
