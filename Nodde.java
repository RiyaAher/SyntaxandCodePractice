public class Nodde { //we create this class to orchestrate the node object 
    int data; //will have data in it
    Nodde next; //will have the pointer to the next node, I have written nodde coz theres a different file named Node.

    Nodde(int data) { //constructor to create an node
        this.data = data; //data we input
        this.next = null; //first node will always point to null in the beginning.
    }
}

class LinkedList { //we create this class to organise all the nodes
    private Nodde head; //we create a private node head because we dont want to accidently change the head in the programme or let other classes touch this variable.
    private int size; // we create a prictae size for the same reason. Size is also there for program to keep a track of the size. its like a counter for the size, like a scoreboard.

    public void Linkedlist() {
        this.head = null; //we initilaize head here in this fucntion, by default, head's next is null, so head is assigned as null.
        this. size = 0; //size of the linkedlist is 0.
    }

    public void addFirst(int data) { //we create a function to add first. TC = O(1) - we are just running one operation here.
        Nodde newNode = new Nodde(data); //we created a newNode object
        newNode.next = head; //we point the newnode's head to the current head in the list
        head = newNode; //then we create the newnode as head.
        size++; //size of the list goes up.
    }

    public void addLast(int data) { //we create a function to add last. TC = O(n), because we ll have to traverse through the list.
        Nodde newNode = new Nodde(data); //we create a newnode object here
        if (head == null){ // if head is equal to null
            head = newNode; //then newnode becomes the head
        } else { 
            Nodde current = head; //we create a new node named current, that becomes the head
            while (current.next != null) { //until we reach the node(current), whos next is pointing towards null,
                current = current.next; // keep moving to the next node, the next node becomes current.
            }
            current.next = newNode; //once the while condition is checked, then we attach the new node at the last.
        }
        size++;
    }

    public void deleteFirst() { //O(1)
        if (head == null){ //if head is equal to null
            System.out.println("The list is empty.");
            return;
        }
        head = head.next; //move to he next node and make that head as first node will be deleted so next node becomes head.
        size--; //size reduces of the list. 
    }

    public void deleteLast() { //O(n)
        if(head == null){
            System.out.println("The list is empty.");
            return;
        }
        if(head.next == null) { //if only one element exists,
            head = null; //then that element becomes 1st and the last in the list. meaning, it gets deleted.
        } else {
            Nodde current = head; //temp variable current to hold head in the memory, so that java doesnt lose the heado of the linkedlist.
            while(current.next.next != null){ //traverse until the second last node, hence current's next's next node.
                current = current.next; // keeping moving one node ahead until the while condition is checked.
            }
            current.next = null; //once the while condition is checked, make the second last node last and delete the last from the system.\
        }
        size --; //size of the list reduces.
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        Nodde current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next; //keep moving to the next node and keep printing it until the while condition is not checked.
        }
        System.out.println("null"); //after that print null.
    }

    public static void main(String[] args) {
        LinkedList newList = new LinkedList();
        newList.addFirst(45);
        newList.addFirst(55);
        newList.addLast(30);
        newList.addLast(20);

        System.out.println("Current List: ");
        newList.printList();

        newList.deleteFirst();
        newList.deleteLast();

        System.out.println("After updation: ");
        newList.printList();

        System.out.println(newList.getSize()); //get size and print it.
    }
}


