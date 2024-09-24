// package Linked_List;

public class Operations_Linked_List {
    Node head;
    class Node {
        String data;
        Node next; // variable
        Node(String data) { // cunstructer to String types of data.
            this.data = data;
            this.next = null;
        }
    }
    // add - first , last.

    // 1.. add first:
    public void addFirst(String data) {
        // create a Node.
        Node newNode = new Node(data);

        if (head == null) { // if list is empty
            head = newNode;
        } else { // if list is not empty
            newNode.next = head; // set the next pointer of new node to current head
            head = newNode; // update head to point to the new node
        }
    }

    // 2... add last:

    public void addLast(String data) {
        // create a Node.
        Node newNode = new Node(data);
        if (head == null) { // if the list is empty
            head = newNode;
            return;
        }
        // Traverse to find the last node.
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        // Set the next pointer of the last node to the new node.
        lastNode.next = newNode;
    }

    // Print the Linked List.
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head; // Assigning the value of head.
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null"); // Changed "Null" to "null"
    }

    // Delete - first , Last:

    // 1...Delete First.
    public void deleteFirst(){
        if(head ==null){
            System.out.println("Linked list is empty");
            return;
        }
        head=head.next;
    }

    // 2... Delete last.

    public void deleteLast(){
        if(head ==null){
            System.out.println("Linked list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secoundLast=head;
        Node lastNode=head.next; // head.next=null -> lastnode=null
        while(lastNode.next !=null){ // null.next.
            lastNode=lastNode.next;
            secoundLast=secoundLast.next;
        }

        secoundLast.next=null;
    }
    public static void main(String[] args) {
        Operations_Linked_List list = new Operations_Linked_List();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();

        list.deleteFirst();
        list.printList();
        
        list.deleteLast();
        list.printList();
    }
}
