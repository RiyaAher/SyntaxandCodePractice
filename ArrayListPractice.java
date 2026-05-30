import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<String> todo = new ArrayList<>(); //starts at 0 index.

        //add to the list
        todo.add("Laundry");
        todo.add("Dishes");
        todo.add("Cook");
        todo.add("Grocery Shopping");
        todo.add("Get Catfood");

        //set/change/modify the list at a certain index.
        todo.set(4, "Set Cupboard"); //4 is the index and 'set cupboard' is what you wanna change to.

       //Get a particular element from the list
       System.out.println(todo.get(2));

       //Delete a particular element in the list
       todo.remove(3); //3 is the index that you wanna delete.

       //to get/check the Size of the arraylist
       todo.size();

       //for loop to print element in the arraylist
       for(int i = 0; i<todo.size(); i++){
        System.out.println(todo.get(i)); //print element at the ith index
       }

       //enhanced for-loop (for-each)
       for(String Task : todo){ //for each string in variable task(which is i in this loop) in todo list, print the task.
        System.out.println(Task);
       }

       //to sort the arraylist
       Collections.sort(todo); //Collections is a class in java framework which has a method to sort the Arraylist in ascending order. You dont have to do it manually.

    }
}