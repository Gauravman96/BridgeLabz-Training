import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class StudentResultGrouping {
	public static void main(String[] args) {
        List<Student> students =Arrays.asList(
            new Student("Gaurav", "A"),
            new Student("Abhay", "B"),
            new Student("Sachin", "A"),
            new Student("Ganni", "C"));

        //grouping by grade and collecting names
        Map<String, List<String>> groupedByGrade =students.stream().collect(Collectors.groupingBy(Student::getGrade,                    
                Collectors.mapping(Student::getName, Collectors.toList())
            ));

        groupedByGrade.forEach((grade, names) -> System.out.println("Grade- "+grade+ " and name- "+names));
    }
}

class Student {
    String name;
    String grade;

    Student(String name, String grade) {
        this.name=name;
        this.grade=grade;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }
}
