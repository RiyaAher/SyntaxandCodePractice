import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // lets say n is 3
        for (int i = 0; i < n; i++) { 
            System.out.println("Meow");
            
            for (int j = 0; j < n; j++) {
            System.out.println("Hello, World!");
            }
        }
        scanner.close();
    }
}

//Every time the outer loop runs, the inner loop runs n times. So, if n is 3, the inner loop will run 3 times for each iteration of the outer loop. Since the outer loop also runs 3 times, the total number of times "Hello, World!" is printed will be 3 (outer loop) * 3 (inner loop) = 9 times.
//Everytime outer loop runs, 'meow' is printed once, then inner loop will run 3 times,
//then 'hello world' will be printed 3 times, then outer and then inner,
//this will go on for total 9 times (3 - inner and 3 - outer, so 3*3 = 9)
//output will be something like this: 
// Meow
// Hello, World!
// Hello, World!
// Hello, World!
// Meow
// Hello, World!
// Hello, World!
// Hello, World!
// Meow
// Hello, World!
// Hello, World!
// Hello, World!