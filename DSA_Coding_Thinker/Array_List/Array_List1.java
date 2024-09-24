import java.util.ArrayList;
import java.util.Collections;

// import java.util.*;  // Universal Class All Class to Call.
public class Array_List1{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        // Add Elements.
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println("Array List is: "+list);

        // Get Elements.
        int elements=list.get(0);  // Through index .
        System.out.println(elements);

        // Add el in beetwen.
        list.add(1,1);
        System.out.println(list);


        // Set Elements.
        list.set(0, 5);
        System.out.println(list);


        // Delete Elements.
        list.remove(3);
        System.out.println(list);


        // Size 
        int size=list.size();
        System.out.println(size);

        // Looping Concepts.
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();


        //Sorting The List
        Collections.sort(list);
        System.out.println(list);
    }
}