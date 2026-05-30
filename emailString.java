import java.util.*;

public class emailString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // create an object named sc in Scanner class.

        System.out.println("Enter Email: "); //input email
        String email = sc.next(); //user inputs email

        String username = "";
        
        for(int i = 0; i < email.length(); i++){
            if (email.charAt(i) == '@') {
                break;
            }
            else {
                username += email.charAt(i);
            }
        }
        System.out.println(username);
    }
}