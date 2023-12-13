package codingbat.map_1;

import java.util.HashMap;
import java.util.Map;

/*
Modify and return the given map as follows: 
if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value. 
If the values exist and have the same length, change them both to the empty string in the map.


mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
mapAB4({"a": "aa", "b": "bb", "c": "cake"}) → {"a": "", "b": "", "c": "bbb"}
mapAB4({"a": "aa", "b": "bb"}) → {"a": "", "b": ""}
mapAB4({"a": "aa", "b": "bb"}) → {"a": "", "b": ""}
mapAB4({"a": "aaa"}) → {"a": "aaa"}
*/
public class MapAB4 {
public static void main(String[] args) {
    Map<String, String> map1 = new HashMap<>(Map.of("a", "aaa", "b", "bb", "c", "cake"));
    Map<String, String> map2 = new HashMap<>(Map.of("a", "aa", "b", "bbb", "c", "cake"));
    Map<String, String> map3 = new HashMap<>(Map.of("a", "aa", "b", "bbb"));
    Map<String, String> map4 = new HashMap<>(Map.of("a", "aa", "b", "bb", "c", "cake"));
    Map<String, String> map5 = new HashMap<>(Map.of("a", "aa", "b", "bb"));

    System.out.println(mapAB3(map1));
    System.out.println(mapAB3(map2));
    System.out.println(mapAB3(map3));
    System.out.println(mapAB3(map4));
    System.out.println(mapAB3(map5));
}

private static Map<String, String> mapAB3(Map<String, String> map) {
    if (map.containsKey("a") && map.containsKey("b")) {
        String valueA = map.get("a");
        String valueB = map.get("b");
        int lengthA = valueA.length();
        int lengthB = valueB.length();

        if (lengthA != lengthB) {
            String longerValue = (lengthA > lengthB) ? valueA : valueB;
            map.put("c", longerValue);
        } else {
            map.put("a", "");
            map.put("b", "");
        }
    }

    return map;
}
}
