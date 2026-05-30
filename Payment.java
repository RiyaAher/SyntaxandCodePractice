public class Payment {
    
    void processPayment() {
        System.out.println("Processing Generic Payment"); //starts method here

    }
}

class CreditCard extends Payment {

    @Override
    void processPayment() {
        System.out.println("Processing Credit Card (Adding 2% fee)"); //overrides original method 
    }

}

class Paypal extends Payment {

    @Override
    void processPayment() {
        System.out.println("Processing Paypal (Redirecting to login)"); // override's original method
    }

}

class Main {
    public static void main(String[] args) {
        
       // 1. Create an Array of Payment objects that can hold 2 items
        Payment[] paymentList = new Payment[2];
        
        // 2. Fill the slots with different "objects" (Polymorphism!)
        paymentList[0] = new CreditCard();
        paymentList[1] = new Paypal();
        
        // 3. Use the colon (:) for-each loop to run them all
        System.out.println("--- Starting Transactions ---");
        for (Payment p : paymentList) { //this is a cleaner way of doing a for loop , payment is class, p is a variable name such as (int i), and payment list is an array. 
            p.processPayment();
        }

    }

}