package practice;

import java.util.HashMap;
import java.util.Map;

public class CountLettersInString {

    public static void main(String[] args) {

        String str = "Java and JavaScript ";
        System.out.println(countLetters(str));
    }

    private static Map<Character, Integer> countLetters(String str) {

        Map<Character, Integer> letterCounter = new HashMap<>();  //I create a MAP

        str = str.replaceAll(" ", "").trim();  //I remove the spaces in the String value

        for (int i = 0; i < str.length(); i++) {                //in the for loop I count each letter

            if (!letterCounter.containsKey(str.charAt(i))) {
                letterCounter.put(str.charAt(i), 1);
            } else {
                letterCounter.put(str.charAt(i), letterCounter.get(str.charAt(i)) + 1);
            }
        }
        return letterCounter;
    }
}
