class Employee {

    public int employeeID;         
    protected String department;    // accessible in subclass
    private double salary;          // accessible only inside this class

    // Constructor
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount");
        }
    }

    // Public method to access salary
    public double getSalary() {
        return salary;
    }

    // Display employee details
    void displayEmployee() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
    }
}
class Manager extends Employee {

    String role;

    // Constructor
    Manager(int employeeID, String department,
            double salary, String role) {
        super(employeeID, department, salary);
        this.role = role;
    }

    // Demonstrating access to public & protected members
    void displayManagerDetails() {
        System.out.println("Employee ID (Public): " + employeeID);
        System.out.println("Department (Protected): " + department);
        System.out.println("Role: " + role);
        System.out.println("Salary (via getter): ₹" + getSalary());
    }
}


public class EmployeeRecords {
     public static void main(String[] args) {

        Manager m = new Manager(
                501, "IT", 75000, "Project Manager");

        m.displayManagerDetails();

        // Modify salary using public method
        m.setSalary(85000);

        System.out.println("Updated Salary: ₹" + m.getSalary());
    }
}
