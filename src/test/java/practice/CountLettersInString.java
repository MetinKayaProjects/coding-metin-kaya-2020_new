package practice;

import java.util.HashMap;
import java.util.Map;

public class CountLettersInString {

    public static void main(String[] args) {

        String str = "Java and JavaScript ";
        System.out.println(countLetters(str));
    }

    private static Map<Character, Integer> countLetters(String str) {

        Map<Character, Integer> letterCounter = new HashMap<>();

        str = str.replaceAll(" ", "").trim();

        for (int i = 0; i < str.length(); i++) {

            if (!letterCounter.containsKey(str.charAt(i))) {
                letterCounter.put(str.charAt(i), 1); //[j=0] [a=0] [v=0]
            } else {
                letterCounter.put(str.charAt(i), letterCounter.get(str.charAt(i)) + 1);
            }
        }
        return letterCounter;
    }
}
