import java.util.*;

public class StringsClass {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); // taking an input from the user for the size of the string

        String arr[] = new String[size]; // declaring that in the array

        int startpoint = 0; // to create a base to add to (for the combined length)

        for(int i = 0; i < size; i++) {
            arr[i] = sc.next();
            startpoint += arr[i].length();
        }
        System.out.println(startpoint);
    }
}

//Here we took an input of a number of characters(String) we want to add to the array of strings.
//then Java will count each character in the string and will give you the output(total)
//eg: 4 (input)
//Riya
//Aher
//is
//Goated
//16 (Total)
