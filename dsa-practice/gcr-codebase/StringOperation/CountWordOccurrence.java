import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordOccurrence {

    public static void main(String[] args) {

        String filePath = "demo.txt";   // File path
        String targetWord = "java";        // Word to search (case-insensitive)
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {

                String[] words = line.toLowerCase().split("\\s+");

                // Check each word
                for (String word : words) {
                    if (word.equals(targetWord.toLowerCase())) {
                        count++;
                    }
                }
            }

            System.out.println("Word '" + targetWord + "' occurred " + count + " times.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
