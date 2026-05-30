import java.util.*;

public class TwoDarray { 
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
        //output of elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++){
                System.out.print(matrix[i][j] + " "); //space so it looks clean - like a matrix itself!
            }
            System.out.println();
        }
    }
}