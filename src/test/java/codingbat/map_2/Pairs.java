package codingbat.map_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Given an array of non-empty strings,
create and return a Map<String, String> as follows:
for each string add its first character as a key with its last character as the value.


pairs(["code", "bug"]) → {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) → {"m": "n"}
pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
 */
public class Pairs {
    public static void main(String[] args) {
        String[] strArr1 = {"code", "bug"};
        String[] strArr2 = {"man", "moon", "main"};
        String[] strArr3 = {"man", "moon", "good", "night"};


        System.out.println(pairs(strArr1));
        System.out.println(pairs(strArr2));
        System.out.println(pairs(strArr3));
    }
    public static Map<String, String> pairs(String[] strings){
        Map<String, String> map = new HashMap<>();
        for (String s : strings) {
//            map.put(Character.toString(s.charAt(0))), s);
            map.put(""+ s.charAt(0), String.valueOf(s.charAt(s.length()-1)));
        }
        return map;
    }
}

