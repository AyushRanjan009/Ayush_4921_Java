import java.util.Scanner;

public class Q5_EvenOddPositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Number is Positive");

            if (number % 2 == 0) {
                System.out.println("Number is Even");
            } else {
                System.out.println("Number is Odd");
            }

        } else if (number < 0) {
            System.out.println("Number is Negative");

            if (number % 2 == 0) {
                System.out.println("Number is Even");
            } else {
                System.out.println("Number is Odd");
            }

        } else {
            System.out.println("Number is Zero");
        }

        sc.close();
    }
}
