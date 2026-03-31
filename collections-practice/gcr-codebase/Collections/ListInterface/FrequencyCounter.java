import java.util.*;
public class FrequencyCounter {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "apple", "orange");

        HashMap<String ,Integer>map= new HashMap<>();

        for(String item : list){
            map.put(item,map.getOrDefault(item,0)+1);
        }
         System.out.println(map);

    }
    
}
