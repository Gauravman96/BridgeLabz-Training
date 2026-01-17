import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

    public static void main(String[] args) {

        String filePath = "demo.txt"; 

        try {
            //  Create FileReader
            FileReader fr = new FileReader(filePath);

            //  Wrap with BufferedReader
            BufferedReader br = new BufferedReader(fr);

            //  Read file line by line
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

          
            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
