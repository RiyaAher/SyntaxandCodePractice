import java.util.HashSet;
import java.util.Iterator;

public class Hashsett {
    public static void main (String[] args) {
        
        //creating a hashset
        HashSet <Integer> Set = new HashSet<>();

        //insert elements - similar to 'list.add', but here we use set.add()
        Set.add(1);
        Set.add(2);
        Set.add(3);
        Set.add(3); //I have purposely added three to the list to see if the hashset accepts duplicates or not. 

        //search - for search we use 'contains()'
        if(Set.contains(1)) {
            System.out.println("Set Contains 1");
        }
        if(!Set.contains(4)) {
            System.out.println("Set doesnt contain 4");
        }

        //delete - for deleting we use 'remove()'
        Set.remove(3); //3 is the element

        //get size - size()
        System.out.println("The size of the Hashset is : " + Set.size()); //size will be printed 2 coz in set no duplicates are allowed and since the total # of elements is 3, therefore 3-1 = 2.

        //iterator - we use iterator just like in for-loops we use 'i'. This is to print all the elements in the hashset
        //hashset has no index so output of the element can be in any order. not necessarily in the order you added the element so we cant trace the index directly. 
        //so we create an object of the Iterator class named IT, and IT runs until it doesnt have the next element, which is why we use 'hasnext'
        Iterator IT = Set.iterator();

        while(IT.hasNext()) {
            System.out.println(IT.next());
        }




    }
}