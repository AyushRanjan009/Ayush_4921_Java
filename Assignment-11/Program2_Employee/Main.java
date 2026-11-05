
class Employee {

    int empId;
    String name;
    String designation;
    double salary;

    // Default constructor
    Employee() {
        empId = 0;
        name = "Not Assigned";
        designation = "Not Assigned";
        salary = 0.0;
    }

    // Parameterized constructor
    Employee(int empId, String name, String designation, double salary) {
        this.empId = empId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    // Copy constructor
    Employee(Employee e) {
        this.empId = e.empId;
        this.name = e.name;
        this.designation = e.designation;
        this.salary = e.salary;
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Designation : " + designation);
        System.out.println("Salary      : " + salary);
        System.out.println("---------------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        Employee e2 = new Employee(
            201, "Ayush Ranjan", "Software Engineer", 55000
        );

        Employee e3 = new Employee(e2); // Copy of e2

        System.out.println("Employee 1 (Default):");
        e1.display();

        System.out.println("Employee 2 (Parameterized):");
        e2.display();

        System.out.println("Employee 3 (Copy):");
        e3.display();
    }
}
