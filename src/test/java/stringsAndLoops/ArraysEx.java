package stringsAndLoops;

import java.util.*;

public class ArraysEx {
    public static void main(String[] args) {
        int[] nums = new int[2];
        nums[0] = 2;
        nums[1] = 3;

        int[] nums2 = {12, 43, 12, 1, 3};
        Arrays.sort(nums2);

        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("nums2 = " + Arrays.toString(nums2));

        Arrays.sort(nums2);
        System.out.println("sorted nums2: " + Arrays.toString(nums2));


        String[] myList = new String[3];
        myList[0] = "Bursa";
        myList[1] = "Izmir";
        myList[2] = "test";

        System.out.println("myList = " + Arrays.toString(myList));//myList = [Bursa, Izmir, test]
        System.out.println(myList[0]);  //Bursa
    }
}
