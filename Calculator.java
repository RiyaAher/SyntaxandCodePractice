import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Select Operator: +, -, *, /, %");
        char op = sc.next().charAt(0);
        
        double result = 0; // initiator

        switch (op){
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '%':
                result = a % b;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println("Total is :" +result);
    }
}
