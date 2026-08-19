import java.util.Scanner;

public class Q8_CheckWorkingDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Day Number (1-7): ");
        int day = sc.nextInt();

        if (day >= 1 && day <= 5) {
            System.out.println("It is a Working Day");
        } else if (day == 6 || day == 7) {
            System.out.println("It is a Weekend");
        } else {
            System.out.println("Invalid Day Number");
        }

        sc.close();
    }
}
