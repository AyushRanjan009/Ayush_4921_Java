// Q21 - Polymorphism and Method Overloading

class Calculator {

    // Q1: Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Q1: Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Q1: Add two decimal numbers
    double add(double a, double b) {
        return a + b;
    }
}


class Display {

    // Q2: Display student's name
    void show(String name) {
        System.out.println("Student Name: " + name);
    }

    // Q2: Display student's name and age
    void show(String name, int age) {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
    }

    // Q2: Display student's name, age and marks
    void show(String name, int age, double marks) {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}


class Maximum {

    // Q3: Maximum between two integers
    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Q3: Maximum between three integers
    int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // Q3: Maximum between two decimal numbers
    double max(double a, double b) {
        return (a > b) ? a : b;
    }
}


public class Q21_PolymorphismAndMethodOverloading {

    public static void main(String[] args) {

        // Q1: Calculator Addition
        Calculator calculator = new Calculator();

        System.out.println("===== CALCULATOR ADDITION =====");
        System.out.println("Addition of two integers: "
                + calculator.add(10, 20));

        System.out.println("Addition of three integers: "
                + calculator.add(10, 20, 30));

        System.out.println("Addition of two decimal numbers: "
                + calculator.add(10.5, 20.5));


        // Q2: Display Method
        Display display = new Display();

        System.out.println("\n===== DISPLAY STUDENT INFORMATION =====");

        display.show("Rahul");

        System.out.println();

        display.show("Rahul", 19);

        System.out.println();

        display.show("Rahul", 19, 85.5);


        // Q3: Find Maximum
        Maximum maximum = new Maximum();

        System.out.println("\n===== FIND MAXIMUM =====");

        System.out.println("Maximum of two integers: "
                + maximum.max(10, 25));

        System.out.println("Maximum of three integers: "
                + maximum.max(10, 25, 15));

        System.out.println("Maximum of two decimal numbers: "
                + maximum.max(12.5, 9.8));
    }
}