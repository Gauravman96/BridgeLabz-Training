import java.util.Scanner;
public class CountVowelCons {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String");
    String str= sc.next().toLowerCase();

    int Cvowels=0;
    int Ccons=0;

    for(int i =0;i<str.length();i++){
     char ch = str.charAt(i);
    
        if(ch >= 'a' && ch <='z'){
           if(ch=='a' || ch== 'e' || ch== 'i' || ch=='o' || ch== 'u'){
            Cvowels++;
          }else{
            Ccons++;
         }
        }
    }
    System.out.println(Cvowels);
    System.out.println(Ccons);
    }
}
