package collections;
import java.util.HashMap;
import java.util.Map;
public class CountDublicatesInArray {
    public static void main(String[] args) {
        int [] arr = {1, 3, 5, 1, 2, 5, 6, 7, 5, 7, 6, 10};      //1-1  5-5  6-6  7-7

        countDuplicatesNum(arr);
//        int countDuplicates = countDuplicatesHashMap(arr);
//        System.out.println(countDuplicates);
    }

    private static void countDuplicatesNum(int[] arr) {

        for (int i = 0; i < arr.length; i++){
            int counter = 0;
            for (int j = 0; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    counter++;
                }
            }
            if (counter > 1) {
                System.out.println("number of " + arr[i] + ": " + counter);
            }
        }

    }
}
