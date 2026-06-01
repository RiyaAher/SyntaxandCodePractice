import java.util.*;

public class StackPractice {

    public static void main(String[] args) { //We are going to create a stack in the main method.
        
        Stack <String> St = new Stack<>(); // created an object of the Stack class
        St.push("Onika"); //added item 1
        St.push("Marcus"); //added item 2
        St.push("Zoey"); //added item 3
        St.push("Jennifer"); //added item 4

        while(!St.empty()){ //we called the .empty() func of java to see if the stack is empty or not. basically asking until the stack is not empty, we ll keep peeking and popping the top.
           System.out.println("Peeking at: " + St.peek()); //peeking at the top of the stack
           St.pop(); //popping the top of the stack
        }
        System.out.println("Final Stack: " + St); //final stack (which should be empty) will give an empty stack output. 
    }
}