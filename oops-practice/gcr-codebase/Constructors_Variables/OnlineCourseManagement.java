class Course {

    // Instance variables
    String courseName;
    int duration;     
    double fee;

    // Class variable
    static String instituteName = "Tech Academy";

    // Parameterized constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    // Instance method
    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: ₹" + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class (static) method
    static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}

public class OnlineCourseManagement {
    public static void main(String[] args) {
         Course c1 = new Course("Java Full Stack", 6, 45000);
        Course c2 = new Course("MERN Stack", 5, 50000);

        c1.displayCourseDetails();
        System.out.println();

        // Update institute name for all courses
        Course.updateInstituteName("BridgeLabz Academy");
        System.out.println();

        c2.displayCourseDetails();
    }
}
