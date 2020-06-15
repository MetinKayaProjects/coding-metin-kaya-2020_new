package stringsAndLoops;

import java.util.Arrays;

public class ArraysSORT_Method {
    public static void main(String[] args) {
        int[] nums = new int[2];
        nums[0] = 12;
        nums[1] = 3;
        System.out.println("nums = " + Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println("SortedNums = " + Arrays.toString(nums));

//************************

        int[] nums2 = {12, 43, 12, 1, 3};
        System.out.println("nums2 = " + Arrays.toString(nums2));

        Arrays.sort(nums2);
        System.out.println("sorted nums2: " + Arrays.toString(nums2));

    }

}
