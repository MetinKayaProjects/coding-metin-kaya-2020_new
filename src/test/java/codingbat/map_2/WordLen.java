package codingbat.map_2;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of strings,
return a Map<String, Integer> containing a key for every different string in the array,
and the value is that string's length.


wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
 */
public class WordLen {
    public static void main(String[] args) {
        String[] strArr1 = {"a", "bb", "a", "bb"};
        String[] strArr2 = {"this", "and", "that", "and"};
        String[] strArr3 = {"code", "code", "code", "bug"};


        System.out.println(wordLen(strArr1));
        System.out.println(wordLen(strArr2));
        System.out.println(wordLen(strArr3));
    }
    public static Map<String, Integer> wordLen(String[] strings){
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, s.length());
        }
        return map;
    }
}

