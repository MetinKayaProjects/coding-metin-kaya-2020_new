package collections;

import java.util.*;




//DIKKAT CALISMIYOR. NEDEN?





public class CountWordsMap {
    public static void main(String[] args) {
        countWord("Java is fun. I like to write java code");
    }

    public static void countWord(String str) {
        String[] strArr = str.split(" ");
        System.out.println("strArr = " + Arrays.toString(strArr));

        Map<String, Integer> myMap = new HashMap<String, Integer>();
        for (int i = 0; i < strArr.length; i++) {
            if (!myMap.containsKey(strArr[i])) {
                myMap.put(strArr[i], 0);
            } else
                myMap.put(strArr[i], myMap.get(strArr[i]) + 1);

        }
        System.out.println("myMap = " + myMap);
        System.out.println("myMap.entrySet() = " + myMap.entrySet());

    }
}
