class Student{

        
    static String universityName = "Global University";
    static int totalStudents = 0;

    // Instance variables
    String name;
    String grade;
    final int rollNumber; 

    // Constructor using 'this'
    Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

     static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
        System.out.println("University Name: " + universityName);
    }

    // Display student details using instanceof
    void displayStudent(Object obj) {
        
        if (obj instanceof Student) {
            Student s = (Student) obj;
            System.out.println("Roll Number: " + s.rollNumber);
            System.out.println("Name: " + s.name);
            System.out.println("Grade: " + s.grade);
            System.out.println("University Name: " + universityName);
        }
    }
    // Update grade using instanceof
    void updateGrade(Object obj, String newGrade) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            s.grade = newGrade;
            System.out.println("Grade updated to: " + s.grade);
        }
    }

}

public class UniversityStudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Hemashree", "A");
        Student s2 = new Student(102, "Sharmila", "B");

        Student.displayTotalStudents();

        s1.displayStudent(s1);
        System.out.println();

        s2.displayStudent(s2);
        s2.updateGrade(s2, "A");
        System.out.println();

        
    }
}
