
class Student {

    int studentId;
    String studentName;
    String course;
    int age;

    // Default constructor
    Student() {
        studentId = 0;
        studentName = "Not Assigned";
        course = "Not Assigned";
        age = 0;
    }

    // Parameterized constructor
    Student(int studentId, String studentName, String course, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
        this.age = age;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Course       : " + course);
        System.out.println("Age          : " + age);
        System.out.println("---------------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student(101, "Ayush Ranjan", "B.Tech CSE", 20);

        System.out.println("Using Default Constructor:");
        s1.displayDetails();

        System.out.println("Using Parameterized Constructor:");
        s2.displayDetails();
    }
}
