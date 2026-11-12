// Parent class
class Employee {
    protected int employeeId;
    protected String employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public double calculateSalary() {
        return 0;
    }

    public void display() {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(int id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    // Salary based on a fixed monthly salary
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double paymentPerHour;

    public PartTimeEmployee(int id, String name, int hoursWorked, double paymentPerHour) {
        super(id, name);
        this.hoursWorked = hoursWorked;
        this.paymentPerHour = paymentPerHour;
    }

    // Salary = Hours Worked x Payment Per Hour
    @Override
    public double calculateSalary() {
        return hoursWorked * paymentPerHour;
    }
}

public class Employee_Salary  {
    public static void main(String[] args) {
        // Runtime polymorphism: parent reference, child objects
        Employee emp;

        emp = new FullTimeEmployee(101, "Ayush Ranjan", 50000);
        emp.display();
        System.out.println("Salary        : Rs. " + emp.calculateSalary());

        System.out.println();

        emp = new PartTimeEmployee(102, "Rahul Kumar", 80, 250);
        emp.display();
        System.out.println("Salary        : Rs. " + emp.calculateSalary());

        // Array of parent references holding different child objects
        System.out.println("\n--- Using parent class reference array ---");
        Employee[] list = {
            new FullTimeEmployee(103, "Neha Singh", 60000),
            new PartTimeEmployee(104, "Amit Verma", 60, 300)
        };
        for (Employee e : list) {
            System.out.println(e.employeeName + " -> Rs. " + e.calculateSalary());
        }
    }
}
