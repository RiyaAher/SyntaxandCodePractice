
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LearningComparators {
    public static void main(String[] args) {

        ArrayList<String> makeup = new ArrayList<>();

        makeup.add("Maybelline");
        makeup.add("Rare");
        makeup.add("Haus Labs");
        makeup.add("Anastasia Beverly Hills");
        makeup.add("Nars");

        // --- USING COMPARABLE --- When you want to use default sorting method created by java. We use Collections coz Collections is a Class/framework which has a sort method for sorting.
        // This sorts alphabetically because String implements Comparable under the hood
        Collections.sort(makeup);

        System.out.println("--- Sorted Alphabetically (Comparable) ---");
        for(String s : makeup) {
            System.out.println(s);
        }

        // --- USING COMPARATOR --- When you wanna use your own way of sorting. 
        //We define a rule: compare the length of string 'a' to string 'b'
        //We create an object of the Comparator Class called 'brandLengthComparator' to wrap it around the method 'Compare' so that we can pass this object into makeup.sort
        //(a,b) belongs to the original 'compare' method under Comparator class that we override it here creating an annoymous inner class using Lambdas
        Comparator<String> brandLengthComparator = (a, b) -> Integer.compare(a.length(), b.length()); //because Comparator has only one method, compare, hence this is a functional interface and we use Lambdas here. 

        // Pass the comparator to the sort method
        makeup.sort(brandLengthComparator);

        System.out.println("--- Sorted by Name Length (Comparator) ---");
        for(String s : makeup) {
            System.out.println(s);
        }
    }
}

//**Under the hood, Integer.compare(x, y) is a very simple wrapper. It evaluates the two numbers and strictly returns one of three signals that the sorting algorithm expects:
//-1 (or any negative number) if x < y (means x should come first) - let it be
//0 if x == y (means they are equal)
//1 (or any positive number) if x > y (means y should come first) - Swap
//Instead of forcing you to write if/else statements to return -1, 0, or 1, Java handles it in a single, clean line.

// When Java compares "Nars" and "Rare":
//Integer.compare(4, 4) returns 0.
//The if statement sees the 0 and moves to the tie-breaker: a.compareTo(b).
//In ASCII, 'N' comes before 'R'. So "Nars".compareTo("Rare") returns a negative number.
//Java sees the negative number and ensures "Nars" comes before "Rare", even though "Rare" was added to the array first!


