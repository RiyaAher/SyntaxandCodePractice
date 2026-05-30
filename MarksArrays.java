import java.util.Scanner;

public class MarksArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of subjects: ");
        int numofsubjects = sc.nextInt(); //input size of array
        
        int marks [] = new int[numofsubjects]; //declaration of array - what that array will store and size of array.

        for (int i = 0; i < numofsubjects; i++) { //input values in array and print them
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < numofsubjects; i++) { //print values in array
            System.out.print(marks[i] + " ");
        }
        sc.close();
    }
}

//In this code we ask the user to input # of subject and then we ask the program to create an array of it 
//then we take input for the marks and put them in the array
//then we print the marks in the array.