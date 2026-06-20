interface Calculator { //we create a functional interface
    int result(int number1, int number2); //here the method returns a value called result which is an integer and takes parameters as number1 and number2.
}

public class LambdasWithReturn {
    public static void main(String[] args) {
      
        Calculator cal = (number1, number2) -> number1 + number2; //we straight up use the method body and dont mention return coz its a single line of code. so no curly brackets either. 
        int sum = cal.result(20,30); //we assign the total to the variable. Java knows to add it since the above method tells it to add. hence it adds 
        System.out.println("The total is: " + sum); //and use that variable here.

        Calculator calc = (number1, number2) -> { //here we are using curly brackets coz the method bodt is of more than one line of code
            System.out.println("Calculator is working under the hood.."); //1st line
            return number1 - number2; //2nd line. We use 'return' coz there is more than one line of code.
        };
        int difference = calc.result(30,20); //we assign that value in a variable
        System.out.println("The total is: " + difference); //we use that vriable here. 
    }
}