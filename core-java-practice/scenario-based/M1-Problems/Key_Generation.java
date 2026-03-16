import java.util.Scanner;
public class Key_Generation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for(int i=0;i<n;i++){

            String s = sc.nextLine();

            if(s.length()==0){
                System.out.println("Invalid Input (empty string)");
                continue; 
            }

            if(s.length()<6){
                System.out.println("Invalid Input (length < 6)");
                continue;
            }

            if(s.contains(" ")){
                System.out.println("Invalid Input (contains space)");
                continue;
            }

            if(s.matches(".*\\d.*")){
                System.out.println("Invalid Input (contains digits)");
                continue;
            }

            if(!s.matches("[a-zA-Z]+")){
                System.out.println("Invalid Input (contains special character)");
                continue;
            }
            s = s.toLowerCase();

            String temp="";

            for(char c : s.toCharArray()){
                if(c % 2 != 0)
                    temp += c;
            }

            String rev = new StringBuilder(temp).reverse().toString();

            String result="";

            for(int j=0;j<rev.length();j++){

                char c = rev.charAt(j);

                if(j%2==0)
                    result += Character.toUpperCase(c);
                else
                    result += c;
            }

            System.out.println("The generated key is - "+result);
        }
    }
}

