import java.util.Scanner;
import java.util.*;

public class AverageCalculator {

    public static int Doaverage(int a, int b, int c) {
        int sum = a + b +c;
        int mean = sum / 3;
        return mean;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter the number 2: ");
        int b = sc.nextInt();
        System.out.print("Enter the number 3: ");
        int c = sc.nextInt();

        int Average = (Doaverage(a, b, c));
        System.out.println("The average of the three numbers is: " + Average);
        sc.close();
    }
}