import java.util.*;

class InvalidMarkException extends Exception {
    public InvalidMarkException(String message) {
        super(message);
    }
}

class Student {
    String name;
    String[] subjects;
    int[] marks;

    Student(String name, String[] subjects, int[] marks) throws InvalidMarkException {
        this.name = name;
        this.subjects = subjects;
        this.marks = marks;
        validateMarks();
    }

    // Validate marks
    private void validateMarks() throws InvalidMarkException {
        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new InvalidMarkException("Marks must be between 0 and 100");
            }
        }
    }

    // Calculate average
    double calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    // Assign grade
        char assignGrade(){
            double avg= calculateAverage();
            if(avg >=90) return 'A';
            else if (avg >=75) return 'B';
            else if (avg >=60) return 'C';
            else return  'D';

        }

    // Display report
    void displayReport() {
        System.out.println("------------ Report Card ------------");
        System.out.println("Student Name : " + name);

        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + " : " + marks[i]);
        }

        System.out.printf("Average Marks : %.2f\n", calculateAverage());
        System.out.println("Grade         : " + assignGrade());
        System.out.println("-------------------------------------\n");
    }
}


public class StudentReportGenerator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        try {
            students.add(new Student(
                    "Rahul",
                    new String[]{"Maths", "Science", "English"},
                    new int[]{85, 90, 78}
            ));

            students.add(new Student(
                    "Anita",
                    new String[]{"Maths", "Science", "English"},
                    new int[]{92, 88, 95}
            ));

            for (Student s : students) {
                s.displayReport();
            }

        } catch (InvalidMarkException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
