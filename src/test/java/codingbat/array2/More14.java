package codingbat.array2;

import java.util.Arrays;

/*
Given an array of ints, return true if the number of 1's is greater than the number of 4's


more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
 */
public class More14 {
    public static void main(String[] args) {
        System.out.println("more14(new int[]{1, 4, 1}) = " + more14(new int[]{1, 4, 1}));  //  → true
        System.out.println("more14(new int[]{1, 4, 1, 4}) = " + more14(new int[]{1, 4, 1, 4}));  //  → false
        System.out.println("more14(new int[]{1, 1}) = " + more14(new int[]{1, 1}));  //  → true
    }
    public static boolean more14(int[] nums){

        return Arrays.stream(nums).filter(x -> x == 1 ).count() > Arrays.stream(nums).filter(x -> x == 4 ).count();




    }
}
