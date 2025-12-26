import java.util.*;
public class RemoveDuplicate {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any string");
      String str= sc.next();
      LinkedHashSet<Character>set= new LinkedHashSet<>();
      for(char ch : str.toCharArray()){
          set.add(ch);
      }

      StringBuilder result= new StringBuilder();
      for(char ch :set){
        result.append(ch);
      }
      System.out.println(result);
      System.out.println(set);
  }  
}
