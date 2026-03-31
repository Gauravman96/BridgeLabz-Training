import java.util.Arrays;
import java.util.List;

public class UpperNAme {

    public static void main(String[] args) {

        List<String> employees =
                Arrays.asList("Abhay", "Rahul", "Neha", "gaurav");

        employees.stream()
                .map(String::toUpperCase) .forEach(System.out::println);
    }
}
