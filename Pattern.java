import java.util.Scanner;

public class Pattern{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // rows
        int m = sc.nextInt(); // columns
        for (int i=1; i<=n; i++){ // once this loop is done,
            for (int j=1; j<=m; j++){ // then it ll print this, how?
                System.out.print("* "); // by this funtion
            }
            System.out.println(); // once all is done, we ll go to the next line, by this function
        }
    }
}