package ab_collections_concept;

import java.util.HashMap;

public class Map_HashMapEx {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(2, "null");
        map.put(null, "null");

        System.out.println(map);            //{null=null, 1=one, 2=null, 3=three}
        System.out.println(map.entrySet()); //[null=null, 1=one, 2=null, 3=three]
        System.out.println(map.keySet());   //[null, 1, 2, 3]
        System.out.println(map.containsKey(1));  //true
        System.out.println(map.get(1));         //one

        System.out.println(map.values());   //[null, one, null, three]

//        for (map.forEach();)

    }
}
