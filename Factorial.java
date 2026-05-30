public class Factorial { //main class

    public static int facto(int n) { //we create a method to find the factorial of input which is n and its int in the name of the method becuase it should return a value that is going to be int
        //base case
        if (n == 1){ //until n is equal to 1 - we need to stop here! this is the condition for the function to meet.
            return n; //keep returning n 
        }
        return n * facto(n-1); //then use that n and multiply it by the factorial of a number before that, i.e 4 and so on..
    }  
    
    public static void main (String[] args) {
        int Result = facto(5); // created a new method to store the value of Factorial
        System.out.println(Result); // print it
        
    }

}
