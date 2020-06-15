package collections;

import java.util.HashMap;
import java.util.Map;

/*
   Task-5 -Saim
   Create a method that will accept a String
   and be print how many times each characters
   is found in the String
    */
public class CountLettersMaps {
    public static void main(String[] args) {
        countLetters("apples");

    }

    public static void countLetters(String str) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 0);
            }
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
        }

        System.out.println(map); //{p=2, a=1, s=1, e=1, l=1}

       // System.out.println(map.keySet());//sadece key'leri yazdirir    //[p, a, s, e, l]
        System.out.println(map.entrySet()); //[p=2, a=1, s=1, e=1, l=1]

        System.out.println("or");

        for (Character key : map.keySet()) {
            System.out.println("Key: " + key);
            System.out.println("Value: " + map.get(key));
            System.out.println();
        }
    }
}
