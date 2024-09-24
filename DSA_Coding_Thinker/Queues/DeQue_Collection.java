import java.util.ArrayDeque;
import java.util.Deque;

public class DeQue_Collection {
    public static void main(String[] args) {
        Deque<Integer> dq=new ArrayDeque<>(); // Doubly ended Queue.
        System.out.println("Orignal the Deque.");
        dq.add(1);
        dq.add(2);
        dq.add(3);
        dq.add(4);

        while(!dq.isEmpty()){
            System.out.println(dq.peek());
            dq.removeFirst();
        }

        System.out.println("Reverse the Deque.");
        dq.add(1);
        dq.add(2);
        dq.add(3);
        dq.add(4);

        while(!dq.isEmpty()){
            System.out.println(dq.peekLast());
            dq.removeLast();
        }
    }
}
