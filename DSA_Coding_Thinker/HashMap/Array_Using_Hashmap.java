import java.util.*;

public class Array_Using_Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = { 1, 2, 3, 4, 1, 2, 3, 1, 2, 7, 6, 5, 4, 0, 1, 2 };
        // Convert into Array to Hashmap.

        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            if (map.containsKey(key)) {
                int value = map.get(key);
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
        }
        System.out.println(map);


        
        // for loop se Wrraper class ko Access ni kr skte.
        // Reverse the Hashmap
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            System.out.println(i.getKey() + " -> " + i.getValue() + ".  ");
        }
    }
}
