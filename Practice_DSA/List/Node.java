public class  Node {
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        Node next=null;
    }
}
class Linked_List {

    public static void main(String[] args) {
        Node newNode1=new Node(1);
        // Node newNode2=new Node(2);
        // Node newNode3=new Node(3);

        System.out.println(newNode1);
    }
}
