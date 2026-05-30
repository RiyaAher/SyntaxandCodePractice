import java.util.*;

public class AscendingOrder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        boolean isAscending = true;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                isAscending = false;
                break;
            }
        }
        if (isAscending) {
            System.out.println("The array is in ascending order.");
        } else {
            System.out.println("The array is not in ascending order.");
        }
        sc.close();
    }
}