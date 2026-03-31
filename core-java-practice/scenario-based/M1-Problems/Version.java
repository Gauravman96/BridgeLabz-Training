import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Version {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the totol file");
        int n = Integer.parseInt(sc.nextLine());

        Map<String, Map<String,Integer>> map = new HashMap<>();

        for(int i=0;i<n;i++){

            String[] parts = sc.nextLine().split(" ");
            String op = parts[0];

            if(op.equals("UPLOAD")){

                String file = parts[1];
                String ver = parts[2];
                int size = Integer.parseInt(parts[3]);

                map.putIfAbsent(file,new HashMap<>());

                map.get(file).putIfAbsent(ver,size);
            }

            else if(op.equals("FETCH")){

                String file = parts[1];

                if(!map.containsKey(file)){
                    System.out.println("File Not Found");
                    continue;
                }

                List<String> versions = new ArrayList<>(map.get(file).keySet());

                versions.sort((a,b)->{
                    int s1 = map.get(file).get(a);
                    int s2 = map.get(file).get(b);

                    if(s1!=s2) return s1-s2;
                    return a.compareTo(b);
                });

                for(String v:versions)
                    System.out.println(file+" "+v+" "+map.get(file).get(v));
            }

            else if(op.equals("LATEST")){

                String file = parts[1];

                if(!map.containsKey(file)){
                    System.out.println("File Not Found");
                    continue;
                }

                String last="";
                for(String v:map.get(file).keySet())
                    last=v;

                System.out.println(file+" "+last+" "+map.get(file).get(last));
            }

            else if(op.equals("TOTAL_STORAGE")){

                String file = parts[1];

                if(!map.containsKey(file)){
                    System.out.println("File Not Found");
                    continue;
                }

                int sum=0;

                for(int s:map.get(file).values())
                    sum+=s;

                System.out.println(file+" "+sum);
            }
        }
    }
}
    
    

