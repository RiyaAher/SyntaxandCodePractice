import java.util.Scanner;

public class HighestCommonFactor {
    public static int findHCF(int a, int b){
        int hcf = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        int hcf = findHCF(num1, num2);
        System.out.println("The Highest Common Factor = " + hcf);
        sc.close();
    }
}