// package Queues;
import java.util.Queue;
public class Queue_Outer { // main method.
    public static class Queue { // craete aa new queue.
        int arr[];
        int rear;
        int size;

        Queue(int size) {
            this.size = size;
            rear = -1;
            arr = new int[size];
        }

        public boolean isEmpty() {
            return (rear == -1);
        }

        public boolean isFull() {
            return (rear == size - 1);
        }
        public void add(int data){
            if(isFull()){
                return;
            }
            // rear++;
            // arr[rear]=data;
        // OR
            arr[++rear]=data;
        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[0];
        }

        public int remove(){ // both are the return type int & void.
            if(isEmpty()){
                return -1;
            }
            int frant=arr[0];
            for(int i=0;i<size-1;i++){
                arr[i]=arr[i++];
            }
            rear--;
            return frant;
        }
    }
    public static void main(String[] args) {
        Queue obj= new Queue (3);
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);


        System.out.println(obj.isEmpty());
        System.out.println(obj.isFull());
        
        while(obj.isEmpty()==false){
            System.out.println(obj.peek());
            obj.remove();
        }
    }
}
