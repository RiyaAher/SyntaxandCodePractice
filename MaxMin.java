import java.util.*;

public class MaxMin {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr [] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE; //initialize it to the smallest valu aka -2^31 - hence counting starts from there uptil largest number in array. 
        int min = Integer.MAX_VALUE; //initialize it to the largest value aka 2^31 - 1 - hence counting starts from there down to smallest number in array.

        for(int i = 0; i < arr.length; i++) { //we use loops to even check elements.
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum element in the array is: " + max);
        System.out.println("Minimum element in the array is: " + min);
    }
}