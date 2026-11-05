class Employee {
    int empId;
    String empName;
    double basicSalary;
 
    Employee(int empId, String empName, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
    }
}
 
class Manager extends Employee {
    String department;
    int teamSize;
 
    Manager(int empId, String empName, double basicSalary,
            String department, int teamSize) {
        super(empId, empName, basicSalary);
        this.department = department;
        this.teamSize = teamSize;
    }
}
 
class ProjectManager extends Manager {
    String projectName;
    int projectDuration; // in months
 
    ProjectManager(int empId, String empName, double basicSalary,
                   String department, int teamSize,
                   String projectName, int projectDuration) {
        super(empId, empName, basicSalary, department, teamSize);
        this.projectName = projectName;
        this.projectDuration = projectDuration;
    }
 
    void displayDetails() {
        System.out.println("Employee ID      : " + empId);
        System.out.println("Employee Name    : " + empName);
        System.out.println("Basic Salary     : " + basicSalary);
        System.out.println("Department       : " + department);
        System.out.println("Team Size        : " + teamSize);
        System.out.println("Project Name     : " + projectName);
        System.out.println("Project Duration : " + projectDuration + " months");
    }
}
 
public class Main {
    public static void main(String[] args) {
        ProjectManager pm = new ProjectManager(401, "Ayush Ranjan", 90000,
                "IT", 12, "Online Banking System", 8);
        pm.displayDetails();
    }
}
