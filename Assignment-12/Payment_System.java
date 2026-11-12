// Parent class
class Payment {
    public void makePayment() {
        System.out.println("Processing a generic payment...");
    }
}

class CreditCardPayment extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Payment done using Credit Card.");
    }
}

class UPIPayment extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Payment done using UPI.");
    }
}

class CashPayment extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Payment done using Cash.");
    }
}

public class Payment_System {
    public static void main(String[] args) {
        // Create objects of all child classes
        CreditCardPayment cc = new CreditCardPayment();
        UPIPayment upi = new UPIPayment();
        CashPayment cash = new CashPayment();

        // Call makePayment() for each object
        System.out.println("--- Calling using child class objects ---");
        cc.makePayment();
        upi.makePayment();
        cash.makePayment();

        // Demonstrate using a parent class reference
        System.out.println("\n--- Calling using parent class reference ---");
        Payment p;

        p = new CreditCardPayment();
        p.makePayment();

        p = new UPIPayment();
        p.makePayment();

        p = new CashPayment();
        p.makePayment();
    }
}