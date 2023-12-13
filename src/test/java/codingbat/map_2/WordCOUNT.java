package codingbat.map_2;

import java.util.HashMap;
import java.util.Map;
/*
The classic word-count algorithm:
given an array of strings, return a Map<String, Integer> with a key for each different string,
with the value the number of times that string appears in the array.


wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}
 */
public class WordCOUNT {
    public static void main(String[] args) {
        String[] strArr1 = {"a", "b", "a", "c", "b"};
        String[] strArr2 = {"c", "b", "a"};
        String[] strArr3 = {"c", "c", "c", "c"};


        System.out.println(wordCount(strArr1));
        System.out.println(wordCount(strArr2));
        System.out.println(wordCount(strArr3));
    }
    public static Map<String, Integer> wordCount(String[] strings){
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s)+1);
            }
//            int count = map.getOrDefault(s,0);
//            map.put(s, count+1);
        }
        return map;
    }
}

