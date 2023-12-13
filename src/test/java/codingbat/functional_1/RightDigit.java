package codingbat.functional_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)


rightDigit([1, 22, 93]) → [1, 2, 3]
rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
rightDigit([10, 0]) → [0, 0]
 */
public class RightDigit {
    public static void main(String[] args) {

        System.out.println(rightDigit(Arrays.asList(1, 22, 93)));
        System.out.println(rightDigit(Arrays.asList(16, 8, 886, 8, 1)));
        System.out.println(rightDigit(new ArrayList<>(Arrays.asList(10, 0))));

    }

    public static List<Integer> rightDigit(List<Integer> nums){
//        for (int i = 0; i < nums.size(); i++) {
//            nums.set(i,nums.get(i) % 10);
//        }
//
//        return nums;

//        List<Integer> nums2 = new ArrayList<>();
//        for (int i = 0; i < nums2.size(); i++) {
//            nums2.add(nums.get(i) % 10);
//        }

//        return strings2;

        nums.replaceAll((x) -> x % 10);

        return nums;
    }
}
