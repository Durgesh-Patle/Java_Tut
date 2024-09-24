import java.util.*;
public class Reverse_SameCopyOrder {
    public static void main(String[] args) {
        
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st.size()); // Size the Stack.
        System.out.println(st); // print the Stack.

        // Reverse the Stack.
        Stack<Integer> rt=new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }

        System.out.println(rt); // print the reverse Stcak.

        // Reverse_SameCopyOrder
        Stack<Integer> ct=new Stack<>();
        while(rt.size()>0){
            ct.push(rt.pop());
        }

        System.out.println(ct); // Orignal the same Stcak to next Stcak a copy.

    }
}
