// package Stack;

import java.util.Stack;

public class PushAtBottum {
    public static void pushBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushBottom(data,s);
        s.push(top);
    }
// userDefine isEmpty.
    // public boolean isEmpty(Stack<Integer> s){ 
    //     return s.size()==0;
    // }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
       
        pushBottom(8, s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
