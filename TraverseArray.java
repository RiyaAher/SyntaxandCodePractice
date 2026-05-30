import java.util.*;

public class TraverseArray { 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: "); //input for rows
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns: "); // input for columns
        int columns = sc.nextInt();

        int matrix[][] = new int[rows][columns]; //declare array

        //input for elements
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                 matrix[i][j] = sc.nextInt();
            }
        }
        //what do you want to find? 
        System.out.println("What you want to find?: ");
        int x = sc.nextInt();

        //find x
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                if(x == matrix[i][j]){
                    System.out.println("Your number is found at location: (" + i + " , " + j + ")");
                }
            }
        } 
    }
}