import java.util.*;

public class Hashmapp {
    public static void main (String[] args) {
      
        HashMap <String,Double> Balance = new HashMap<>(); //String is the type of Key and Double is the Type of Value in the hashmap isnce hashmap is always in pairs

        //here we use .put() function to add pairs to the hashmap
        Balance.put("Riya", 1500.50);
        Balance.put("Prasad",65050.50);
        Balance.put("Usha",34500.75);
        Balance.put("Bhausaheb", 150056.34);

        System.out.println(Balance); //print

        //this is to search a certain key, we use .containsKey() function for that.
        if(Balance.containsKey("Bhausaheb")) {
            System.out.println("Key is present");
        } else {
            System.out.println("Not present");
        }

        //this is to search a certain type of value of a particular key, we use .get() function.
        System.out.println(Balance.get("Prasad")); //if exists

        System.out.println(Balance.get("Loser")); // if doesnt exists, the output will be null.

        //iterators (i) in HashMap - For loop, here we are gonna use for-each loop - Always import iterator and map seperately.
        for(Map.Entry<String, Double> Pair : Balance.entrySet()) { //reads as : for each pair of entry in "Balance set", Print Ket and Value
            System.out.println(Pair.getKey()); // .getKey function
            System.out.println(Pair.getValue()); // .getvalue function
        }

        //Remove - Delete Function
        Balance.remove("Riya"); //if you remove a certain key, it removes both the key and the value of it.
        System.out.println(Balance);

    }
}