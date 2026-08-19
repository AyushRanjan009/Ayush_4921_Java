import java.util.Scanner;

public class Q7_NumberDivisibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        if (number % 5 == 0) {
            System.out.println("Number is divisible by 5");

            if (number % 10 == 0) {
                System.out.println("Number is also divisible by 10");
            } else {
                System.out.println("Number is not divisible by 10");
            }

        } else {
            System.out.println("Number is not divisible by 5");
        }

        sc.close();
    }
}