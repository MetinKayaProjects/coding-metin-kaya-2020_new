package ab_collections_concept;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();

        map.put(3, "three");
        map.put(4, "four");
//        map.put(null, "this null");  //NullPointerException
        map.put(2, "two");
        map.put(1, "one");

        System.out.println(map);    //{1=one, 2=two, 3=three, 4=four}
    }
}
