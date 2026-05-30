import java.util.Scanner;

public class Oddoreven {

    public static int isoddoreven(int received) {  // received = what the method got
        //operations
        if (received % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        return received; //return it to the main (hand over the result to the main)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int typed = sc.nextInt();  // typed = what the user typed
        int result = isoddoreven(typed);  // hand "typed" to the method - basically method (isoddoreven) will guage 'typed'.
        sc.close();
    }

}