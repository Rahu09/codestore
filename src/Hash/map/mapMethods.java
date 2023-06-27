package Hash.map;
import java.util.*;

public class mapMethods {
    public static void main(String[] args) {
        // Create an empty hash map by declaring object of string and integer type
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the Map using standard put() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
        map.put("rahul", 20);

        // Print size and content of the Map
        System.out.println("Size of map is:- " + map.size());

        // Printing elements in object of Map
        System.out.println(map);

        // Checking if a key is present and if present, print value
        if (map.containsKey("vishal"))
            System.out.println("value for key vishal is:- " + map.get("vishal"));

        // Checking if a value is present and if present, print value by passing random element
        if (map.containsValue(20))
            System.out.println("20 is present for some key");

        // copying a hashmap
        HashMap<String, Integer> map2 = new HashMap<>(map);
        System.out.println("Mappings of HashMap map2 are : " + map2);

        // Change Value using put method
        map2.put("sachin", 999);
        System.out.println("Mappings of HashMap map2 after changing value of sachin are : " + map2);

        // remove element with a key using remove method
        map2.remove("sachin");
        System.out.println("Mappings of HashMap map2 after deleting key-> sachin are : " + map2);

        // iteration using keyset
        System.out.println("\nUsing keySet");
        for(String key : map.keySet()){
            int value = map.get(key);
            System.out.println(key + " : " + value);
        }

        // Iterate the map using for-each loop
        //Map.Entry is a data-type
        System.out.println("\nUsing entrySet");
        for (Map.Entry mapElement : map.entrySet()) {

            String key = (String)mapElement.getKey();
            int value = (int)mapElement.getValue();

            System.out.println(key + " : " + value);
        }

        //Removes all of the mappings from map.
        map2.clear();
        System.out.println(map2);

        //putting all values of map in map2
        map2.putAll(map);
        System.out.println(map2);
    }
}
