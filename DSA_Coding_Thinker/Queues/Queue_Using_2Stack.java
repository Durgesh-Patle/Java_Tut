import java.util.Stack;

public class Queue_Using_2Stack {
    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        public void add(int data) {
            while (s1.size() > 0) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (s2.size() > 0) {
                s1.push(s2.pop());
            }
        }

        public int peek() {
            return s1.peek();
        }

        public int remove() {
            return s1.pop();
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.isEmpty());
        System.out.println(q.peek());

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
