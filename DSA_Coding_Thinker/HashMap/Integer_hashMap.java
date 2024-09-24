import java.util.HashMap;

public class Integer_hashMap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        // Orderd Form me Store.  (uniqe) 
        map.put(5, 3);
        map.put(1, 5);
        map.put(2,4);
        map.put(3,3);
        System.out.println(map);

        // Update to Value Count.
        map.put(2, 7);
        System.out.println(map);

        System.out.println(map.get(2)); // key value.

        System.out.println(map.get(10)); // key Excist krtii he. // null(Output).

        map.remove(2); // remove the key value in the hashmap.

        System.out.println(map.get(2)); // print the key value pair.

        //  Note:- key are the different in the hashmap. but value should be same.

        System.out.println(map.size()); // size the find in the hashmap.

        System.out.println(map.containsKey(1)); // true.. hashmap ke ander key he ya nhii.


    }
}
