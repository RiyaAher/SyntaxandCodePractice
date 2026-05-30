import java.util.Scanner;

public class Fibonacci {

    public static int fibo(int n) {
        if (n <= 1) return n;

        int a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }

        return b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int result = fibo(num);
        System.out.println("The Fibonacci number is: " + result);
    }
}