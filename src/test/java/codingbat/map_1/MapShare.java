package codingbat.map_1;

import java.util.HashMap;
import java.util.Map;

/*
Modify and return the given map as follows: 
if the key "a" has a value, set the key "b" to have that same value. 
In all cases remove the key "c", leaving the rest of the map unchanged.


mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
 */
public class MapShare {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>(Map.of
                ("a", "aaa", "b", "bbb", "c", "ccc")); //→ {"a": "aaa", "b": "aaa"));
        Map<String, String> map2 = new HashMap<>(Map.of
                ("b", "xyz", "c", "ccc")); //→ {"b": "xyz"}
        Map<String, String> map3 = new HashMap<>(Map.of
                ("a", "aaa", "c", "meh", "d", "hi")); //→ {"a": "aaa", "b": "aaa", "d": "hi"}

        System.out.println(mapShare(map1));
        System.out.println(mapShare(map2));
        System.out.println(mapShare(map3));
    }

    private static Map<String, String> mapShare(Map<String, String> map) {

        if (map.containsKey("a")){
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }
}
