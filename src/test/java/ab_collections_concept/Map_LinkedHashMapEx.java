package ab_collections_concept;

import java.util.LinkedHashMap;

public class Map_LinkedHashMapEx {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();

        map.put(4, "four");
        map.put(null, "this null");
        map.put(2, "two");
        map.put(1, "one");
//       map.put(null, "this null2");   //LinkedHashMAp allows only one null key

        System.out.println(map);
        System.out.println("map.keySet() = " + map.keySet());

        System.out.println("map.get(2) = " + map.get(2));

    }
}
