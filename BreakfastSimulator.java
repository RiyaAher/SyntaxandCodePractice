class Coffeemaker extends Thread { //we are creating a coffeemaker class that extends thread to make sure java knows this is a thread.
    @Override //coz the thread class has its own method run() which we wanna override by our own behaviour.
    public void run() {
        for(int i = 0; i < 3; i++) {
            System.out.println("Brewing coffee.."); //this will go on three times
        try {
            Thread.sleep(800); //.sleep helps the thread to rest for a certain amount of period. eg: 800 miliseconds. this .sleep() throws and interruptedexception. Hence we handle that with try-catch
        } catch (InterruptedException e) { //the reason this try catch is in the loop coz we wanna make sure the loop runs even when the .sleep() throws an exception, the next round of loop runs.
            System.out.println(e); //in case of exception we catch it and print it. 
        }
        }
    }
}


class Toaster extends Thread { //same as above class, the only job of this thread to toast the bread. hence difference in signatures.
    @Override
    public void run() {
        for(int i = 0; i < 3; i++) {
            System.out.println("Toasting bread...");
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        }
    }
}

public class BreakfastSimulator { //actual class
    public static void main(String args[]) {
        
        Coffeemaker Latte = new Coffeemaker(); //creating objects of both the threads
        Toaster Sourdough = new Toaster(); //creating objects of both the threads

        System.out.println("Starting the breakfast preparation!");

        Latte.start(); //Thread class's inbuilt method called start() which prints the thread.
        Sourdough.start();

        // We use a try-catch because .join() can also be interrupted! We do this to avoid the race-condition, which means both the threads race with each other to reach the finish line and cause chaos. 
        try {
            Latte.join();       // Main thread pauses here until Latte finishes
            Sourdough.join();   // Main thread pauses here until Sourdough finishes
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Breakfast is ready! ☕️ 🍞"); //after both the threads are finished, this will be printed, not before or after.
    }
}