public class Lock { //so we created parent class called Lock
    private boolean isLocked = true; // we set the variable boolean to check the state of the lock

    public void unlock() { // we created methods to check if unlocked
        isLocked = false;
        System.out.println("Lock is now OPEN.");
    }

    public void lock() { //another method to check if locked
        isLocked = true;
        System.out.println("Lock is now CLOSED.");
    }
}

class SmartLock extends Lock { // the nwe created a class to extend the parent class - so we can fetch data from it instead of writing it again by using the key word 'extends' - this is called inheritance.
    private int batteryLevel = 100; //we created this class's own variable.

    public void fingerprintUnlock(int battery) { // its own method to interact with it its class's variable
        //Check if battery is greater than 0
        if(battery >= 0 || battery <= 100){ //If yes, call the unlock() method from the Parent
            unlock();
        } else {
            System.out.println("Battery dead!"); // If no, print "Battery dead!"
        }
    }

    public static void main(String[] args) { //created the main function to create an object out of all the info that we wrote in the parent class and subclass - this is the main function where the object is created.
        SmartLock lockk = new SmartLock();

        lockk.fingerprintUnlock(34); //here we can access both parent class and sub class's variables 
    }
}
