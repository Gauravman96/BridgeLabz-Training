import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class CheckedException {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");
            FileReader fr= new FileReader(file);

            int ch;
            while((ch= fr.read()) != -1){
                System.out.println((char)ch);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
