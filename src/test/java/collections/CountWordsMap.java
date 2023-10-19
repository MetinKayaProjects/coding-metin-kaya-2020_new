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
        System.out.println("strArr.length = " + strArr.length);

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
//       System.out.println("myMap.entrySet() = " + myMap.keySet());

        //BY LAMBDA
//        myMap.forEach((word, count) -> {
//            System.out.print(word + ": " + count + ";   ");
//        });
//
        System.out.println("myMap.keySet() = " + myMap.keySet());

        int total = 0;
        for (String key : myMap.keySet()) {
//            System.out.println("Key: " + key);
//            System.out.println("Value: " + myMap.get(key));
//            System.out.println();
           total += myMap.get(key);
        }
        System.out.println("total = " + total);
        Boolean verify = (total == strArr.length) ? true : false;
//
        System.out.println("verify = " + verify);
        System.out.println("myMap.size() = " + myMap.size());
    }
}
