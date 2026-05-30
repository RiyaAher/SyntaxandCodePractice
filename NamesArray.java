import java.util.Scanner;

public class NamesArray {
    public static void main(String [] args) {

        //input number of names and store them in an array
        Scanner sc = new Scanner(System.in);

        System.out.println("How many names do you want to enter? ");
        int numberofNames = sc.nextInt(); //input number of names

        String names [] = new String[numberofNames]; //create an array of strings to store the names

        //input names and store them in the array
        for(int i = 0; i < numberofNames; i++) {
            names[i] = sc.next(); //input name and store it in the array
        }
        //print the names in the array
        System.out.println("The names you entered are: ");
        for(int i = 0; i < numberofNames; i++) {
            System.out.println(names[i]); //print the name at index i
        }
        sc.close(); //close the scanner
    }
    
}