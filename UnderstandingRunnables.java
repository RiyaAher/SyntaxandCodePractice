class Iphone implements Runnable { //we used runnables here coz thread is a class and we cant extend classes more than once, which is multiple inheritance, which is not allowed with classes but allowed with interfaces and 'Runnable' is an interface so we use that when we want extend multiple classes of threads out of one class.
    @Override
    public void run(){ // we are overriding run() coz run() is an abstract method of runnable class. so we create our own body of method.
        for(int i = 1; i < 5; i++) {
            System.out.println("Iphone");
        try { //we are try-catching here coz .sleep throws an interruptedexception error.
            Thread.sleep(10); //this allows the thread to wait for 10 milliseconds. how did we use thread here? actually thread is class that implements runnable. 
        } catch (Exception e) {
            System.out.println(e); //the try-catch is inside the loop coz we want the thread to sleep after every print.
        }
        }
    }
}

class Samsung implements Runnable { //same as above, we create a second class that implements runnable coz runnable allows it. if we were extending thread, we couldnt do that.
    @Override
    public void run() {
        for(int i = 1; i < 5; i++){
            System.out.println("Samsung");
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            System.out.println(e);
        }
        }
    }
}

public class UnderstandingRunnables {
    public static void main(String[] args) {

        Iphone iphone = new Iphone(); //creating object of the class
        Samsung samsung = new Samsung(); //creating object of the class

        Thread ios = new Thread(iphone); //we created an object of thread class and used thread's consturctor to accept runnable object coz the thread class has multiple constructors which allows it. 
        Thread android = new Thread(samsung); //why do we create a thread object again? coz the .start() method belongs to the thread class and not runnable. and for us to link the two, we need an object of a thread class which takes runnable task (object) in its constuctor. 

        ios.start(); //belongs to the thread class.
        android.start();

        try { //.join also throws interuptedexception error 
            ios.join(); //we use join for the threads to finish the execution gracefully and meet us at the finish line. 
        android.join();  
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Phones have now rebooted"); //finish line.
        
    }
}