import java.util.ArrayDeque;
// import java.util.LinkedList;
import java.util.Queue;
public class Implemention_UsingCollection {
    public static void main(String[] args) {

        // Queue <Integer> q=new LinkedList<>();
        Queue <Integer> q=new ArrayDeque<>(); // ArrayDeque faster as Compare to LinkedList.

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
