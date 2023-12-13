
package codingbat.map_2;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of strings, return a Map<String, Boolean>
where each different string is a key and its value is true if that string appears 2 or more times in the array.


wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
 */
public class WordMultiple {
    public static void main(String[] args) {
        String[] strArr1 = {"a", "b", "a", "c", "b"};
        String[] strArr2 = {"c", "b", "a"};
        String[] strArr3 = {"c", "c", "c", "c"};


        System.out.println(wordMultiple(strArr1));
        System.out.println(wordMultiple(strArr2));
        System.out.println(wordMultiple(strArr3));
    }

    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Boolean> map2 = new HashMap<>();

        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
            if (map.get(s) >= 2 ) {
                map2.put(s, true);
            }else {
                map2.put(s, false);
            }
        }
        return map2;
    }
}

