package codingbat.map_2;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of non-empty strings,
return a Map<String, String> with a key for every different first character seen,
with the value of all the strings starting with that character appended together in the order they appear in the array.


firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([]) → {}
 */
public class FirstChar {
    public static void main(String[] args) {
        String[] strArr1 = {"salt", "tea", "soda", "toast"};
        String[] strArr2 = {"aa", "bb", "cc", "aAA", "cCC", "d"};
        String[] strArr3 = {};


        System.out.println(firstChar(strArr1));
        System.out.println(firstChar(strArr2));
        System.out.println(firstChar(strArr3));
    }
    public static Map<String, String> firstChar(String[] strings){
        Map<String, String> map = new HashMap<>();

        for (String s : strings) {
            if (!map.containsKey(s.charAt(0)+""))
                map.put(String.valueOf(s.charAt(0)), s);
            else
                map.put(String.valueOf(s.charAt(0)), map.get(""+s.charAt(0)) +s);
        }
        return map;
    }
}

