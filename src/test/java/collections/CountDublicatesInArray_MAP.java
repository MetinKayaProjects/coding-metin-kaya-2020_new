package collections;

import java.util.HashMap;
import java.util.Map;

public class CountDublicatesInArray_MAP {

    public static void main(String[] args) {
        int[] array = {1, 3, 2, 1,3, 3, 2, 5, 6, 4};
        int[] arr = {1, 3, 5, 1, 2, 5, 6, 7, 5, 7, 6, 10};

        countDublicate(array);
        System.out.println("**************\n");
        countDublicate(arr);
    }

    private static void countDublicate(int[] array) {
        Map<Integer, Integer> dublicateElementMap = new HashMap<>();

        for (int num : array) {
            if (dublicateElementMap.containsKey(num)) {
                dublicateElementMap.put(num, dublicateElementMap.get(num) + 1);
            } else {
                dublicateElementMap.put(num, 1);
            }
        }
        System.out.println("dublicateElementMap = " + dublicateElementMap);

        for (int key : dublicateElementMap.keySet()) {
            int count = dublicateElementMap.get(key);
            if (count > 1){
                System.out.println("Element "+ key + " repeated "+ count + " times.");
            }
        }
    }
}
