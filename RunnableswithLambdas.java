public class RunnableswithLambdas {
    public static void main(String[] args) {

        // Thread 1: Defining the iPhone logic directly using a Lambda expression
        Thread ios = new Thread(() -> { 
            for(int i = 1; i < 5; i++) {
                System.out.println("Iphone");
                try { 
                    Thread.sleep(10); 
                } catch (Exception e) {
                    System.out.println(e); 
                }
            }
        }); 
    
        // Thread 2: Defining the Samsung logic directly using a Lambda expression
        Thread android = new Thread(() -> {
            for(int i = 1; i < 5; i++) {
                System.out.println("Samsung");
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        });

        // Starting the threads
        ios.start(); 
        android.start();

        // Waiting for both threads to finish
        try { 
            ios.join(); 
            android.join();  
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Phones have now rebooted"); // Finish line.
    }
}