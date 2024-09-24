// package HashMap;
import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        HashMap <String,Integer> map=new  HashMap<>();

        map.put("India", 120);
        map.put("China", 150);
        map.put("pakistan", 90);

        System.out.println(map);

        System.out.println(map.get("India"));

        System.out.println(map.put("India", 140));
        System.out.println(map);

        if(map.containsKey("Indonetia")){
            System.out.println("Key is Present In the map");
        }
        else{
            System.out.println("key is not present in the Array");
        }

    }
}
