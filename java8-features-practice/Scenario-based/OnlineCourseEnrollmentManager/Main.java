import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        
        List<Enrollment> enrollments = Arrays.asList(
                new Enrollment("Gaurav", "Java", "Programming", LocalDate.of(2026, 2, 1)),
                new Enrollment("Rahul", "Python", "Programming", LocalDate.of(2026, 1, 15)),
                new Enrollment("Anita", "Digital Marketing", "Marketing", LocalDate.of(2026, 2, 5)),
                new Enrollment("Rohit", "Java", "Programming", LocalDate.of(2026, 1, 20)),
                new Enrollment("Priya", "SEO", "Marketing", LocalDate.of(2026, 2, 10))
        );

        //filter by coursename

        System.out.println("Filter by Java Course:");
        enrollments.stream().filter(e -> e.getCourseName().equalsIgnoreCase("Java")).
                forEach(System.out :: println);

        // Filter by Category
        System.out.println("\nFilter by Category");
        enrollments.stream().filter(e->e.getCategory().equalsIgnoreCase("Programming")).
                forEach(System.out :: println);

        // Group by Course Name
        System.out.println("\nGroup by Course Name:");
        Map<String, List<Enrollment>> groupedByCourse =
                enrollments.stream()
                        .collect(Collectors.groupingBy(Enrollment::getCourseName));

        groupedByCourse.forEach((course, list) -> {
            System.out.println(course + " -> " + list);
        });


        //Count Enrollments per Category
        System.out.println("\nCount per Category:");
        Map<String, Long> countByCategory =
                enrollments.stream()
                        .collect(Collectors.groupingBy(
                                Enrollment::getCategory,
                                Collectors.counting()
                        ));

        countByCategory.forEach((category, count) ->
                System.out.println(category + " -> " + count)
        );

        //Sort by Enrollment Date
        System.out.println("\nSorted by Enrollment Date:");
        enrollments.stream()
                .sorted(Comparator.comparing(Enrollment::getEnrollmentDate))
                .forEach(System.out::println);

    }


}
