import java.util.*;

public class ReplaceString {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); //creating an object of scanner class
        String name = sc.next(); //input for the user

        String result = ""; //baseline to start counting the str.length aka string length.

        for(int i = 0; i < name.length(); i++){ // go on each letter and check if the string is 'e' or not.
            if (name.charAt(i) == 'e'){ // if you (java) stop at 'e'.
                result += "i"; // add it to the total of the strings and replace it with 'i'. meaning, let the original be the same but only replace 'e' with 'i'. 
            }
            else {
            result += name.charAt(i); // this will keep the original. 
            }
        }
        System.out.println(result);
    }
}

//in this function, we replace a string with another. 