import java.util.*;
public class ReverseList {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ArrayList<Integer>list2= new ArrayList<>();

        for(int i = list.size()-1;i>=0;i-- ){
            list2.add(list.get(i));
        }

        System.out.println(list2);
        for(int i :list2){
            System.out.println(i);
        }

    }
}
