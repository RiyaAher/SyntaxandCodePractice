public class Node { //we create a Node class to initiate
    char data; //will have data
    Node next; //will have the address of the next node (Object)

    Node(char data){ //we create a constructor for this object
        this.data = data; //data we input
        this.next = null; // by default when node is created, its next pointer is null - which is the end of the list
    }
}

class ManualTrain {
    public static void main(String[] args){
    //create objects out of Node class
    Node Car1 = new Node('J');
    Node Car2 = new Node('A');
    Node Car3 = new Node('V');
    Node Car4 = new Node('A');

    //declare head(Starting point of the node, so that java knows this is the starting node.)
    Node head = Car1;

    //hook them together with 'next'.
    Car1.next = Car2;
    Car2.next = Car3;

    }
}