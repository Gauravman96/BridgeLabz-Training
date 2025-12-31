class Student {

    // Access Modifiers
    public int rollNumber;    
    protected String name;     // accessible in subclass
    private double cgpa;       // accessible only inside this class

    // Constructor
    Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Public getter for CGPA
    public double getCGPA() {
        return cgpa;
    }

    // Public setter for CGPA
    public void setCGPA(double cgpa) {
        if (cgpa >= 0 && cgpa <= 10) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA");
        }
    }

    // Display student details
    void displayStudent() {
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}

class PostgraduateStudent extends Student {

    String specialization;

    // Constructor
    PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    // Demonstrating use of protected member
    void displayPGStudent() {
        System.out.println("Name (Protected): " + name); // accessible
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA (via getter): " + getCGPA());
    }
}


public class UniversityManagement {
    public static void main(String[] args) {
         Student s1 = new Student(101, "Gaurav", 8.5);
        s1.displayStudent();

        System.out.println();

        PostgraduateStudent pg = new PostgraduateStudent( 201, "Amit", 9.0, "Computer Science");
        pg.displayPGStudent();

        // Modifying CGPA using public method
        pg.setCGPA(9.4);
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
}
