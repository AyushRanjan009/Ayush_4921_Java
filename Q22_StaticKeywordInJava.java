class BankAccount {

    String accountNumber;
    String accountHolderName;
    double balance;

    static double interestRate = 5.0;
    
    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println();
    }
}

public class Q22_StaticKeywordInJava {

    public static void main(String[] args) {
        
        BankAccount account1 =
                new BankAccount("ACC101", "Rahul Sharma", 50000);

        BankAccount account2 =
                new BankAccount("ACC102", "Aman Kumar", 60000);

        BankAccount account3 =
                new BankAccount("ACC103", "Priya Singh", 75000);

    
        System.out.println("===== BEFORE CHANGING INTEREST RATE =====");
        account1.displayDetails();
        account2.displayDetails();
        account3.displayDetails();

        BankAccount.interestRate = 7.5;

        System.out.println("===== AFTER CHANGING INTEREST RATE =====");
        account1.displayDetails();
        account2.displayDetails();
        account3.displayDetails();
    }
}