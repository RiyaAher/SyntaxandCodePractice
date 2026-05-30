import java.util.Scanner;


public class ReportCard {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int marks = 1;

        do{ //do the following 
            System.out.print("Enter marks: ");
            marks = sc.nextInt();
        } while (marks < 0 || marks > 100); //until this condition is not met
        
         if (marks >= 90) {
            System.out.println("Good");
            } else if (marks >= 60) {
            System.out.println("This is good");
            } else {
            System.out.println("This is also good");
        }
    }
}