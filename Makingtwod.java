public class Makingtwod {
    public static void main(String[] args){
        
        int matrix[][] = { //creating array
            {2, 3, 4, 5},
            {6, 7, 8, 9},
            {10, 11, 12, 13}
        };

        int sum = 0; // initializer for sum to add
        int rows = matrix.length; //row location
        int cols = matrix[0].length; // column location coz by default, if we write matrix.length, java assumes row, so we ask tell me whats at [0] index at this row? 
        
        for(int i = 0; i < rows; i++){ // creating rows
            for(int j = 0; j < cols; j++){ // creating columns
                if(i == 0 || i == rows - 1 || j == 0 || j == cols - 1){ //go to the location 
                    if(matrix[i][j] % 2 == 0){ // check if at that location the number is odd or even
                        sum += matrix[i][j]; // if its even sum it
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
