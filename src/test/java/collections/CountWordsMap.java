package collections;

import java.util.*;




//DIKKAT CALISMIYOR. NEDEN?


public class CountWordsMap {
    public static void main(String[] args) {

        countWord("Java is fun, fun, fun. I like to write Java code");
    }

    public static void countWord(String str) {
        str = str.replace(".", "").replace(",","");
        String[] strArr = str.split(" ");
        System.out.println("strArr = " + Arrays.toString(strArr));

        Map<String, Integer> myMap = new HashMap<String, Integer>();
        for (int i = 0; i < strArr.length; i++) {
            if (!myMap.containsKey(strArr[i])) {
                myMap.put(strArr[i], 0);
            }
                myMap.put(strArr[i], myMap.get(strArr[i]) + 1);

        }
        System.out.println("myMap = " + myMap);
        //BY ENTRYSET() METHOD
//       System.out.println("myMap.entrySet() = " + myMap.entrySet());

        //BY LAMBDA
//        myMap.forEach((word, count) -> {
//            System.out.print(word + ": " + count + ";   ");
//        });

    }
}
