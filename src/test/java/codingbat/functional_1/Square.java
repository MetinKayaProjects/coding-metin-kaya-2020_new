package codingbat.functional_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a list of integers, return a list where each integer is multiplied with itself.


square([1, 2, 3]) → [1, 4, 9]
square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
square([]) → []
 */
public class Square {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3));
//        nums = Arrays.asList(1, 2, 3);
        System.out.println(doubling(Arrays.asList(1, 2, 3))); // → [1, 4, 9]
        System.out.println(doubling(Arrays.asList(6, 8, 6, 8, -1))); // → [36, 64, 36, 64, 1]
        System.out.println(doubling(new ArrayList<>(Arrays.asList()))); // → []

    }

    public static List<Integer> doubling(List<Integer> nums){
        for (int i = 0; i < nums.size(); i++) {
            nums.set(i,nums.get(i)*nums.get(i));
        }

        return nums;

//        List<Integer> nums2 = new ArrayList<>();
//        for (int i = 0; i < nums.size(); i++) {
//            nums2.add(nums.get(i) * nums.get(i));
//        }

//        return nums2;

//        nums.replaceAll((x) -> x*x);
//
//        return nums;
    }
}
