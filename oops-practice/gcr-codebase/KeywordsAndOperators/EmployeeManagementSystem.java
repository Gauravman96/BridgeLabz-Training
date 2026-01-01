class Employee{
    
    static String companyName="Tech Solutions Inc.";
    static int totalEmployees=0;

    // Instance variables
    String name;
    String designation;
    final int id;

    //  Constructor using 'this'
    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }
    //static method
    static void displayTotalEmployees(){
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Company Name: " + companyName);
    }

     // Method using instanceof
    void displayEmployeeDetails(Object obj) {
        //  instanceof check
        if (obj instanceof Employee) {
            Employee e = (Employee) obj;
            System.out.println("Employee ID: " + e.id);
            System.out.println("Name: " + e.name);
            System.out.println("Designation: " + e.designation);
            System.out.println("Company Name: " + companyName);
        }
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
         Employee e1 = new Employee(101, "Thamarai", "Software Engineer");
        Employee e2 = new Employee(102, "Rohan", "Project Manager");

        Employee.displayTotalEmployees();

        e1.displayEmployeeDetails(e1);
        e2.displayEmployeeDetails(e2);
    }
}
