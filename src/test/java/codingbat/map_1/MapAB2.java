package codingbat.map_1;

import java.util.HashMap;
import java.util.Map;

/*
Modify and return the given map as follows:
if the keys "a" and "b" are both in the map and have equal values, remove them both.


mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
*/
public class MapAB2 {
public static void main(String[] args) {
    Map<String, String> map1 = new HashMap<>(Map.of("a", "aaa", "b", "aaa", "c", "cake"));
    Map<String, String> map2 = new HashMap<>(Map.of("a", "aaa", "b", "bbb"));
    Map<String, String> map3 = new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "aaa"));

    System.out.println(mapAB2(map1));
    System.out.println(mapAB2(map2));
    System.out.println(mapAB2(map3));
}

private static Map<String, String> mapAB2(Map<String, String> map) {
    if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))){
        map.remove("a");
        map.remove("b");
    }
    return map;
}
}
