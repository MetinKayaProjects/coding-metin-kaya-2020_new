package codingbat.array2;

import java.util.Arrays;

/*
Return the sum of the numbers in the array, returning 0 for an empty array.
Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.


sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6
 */
public class Sum13 {
    public static void main(String[] args) {
        System.out.println("sum13(new int[]{1, 2, 2, 1}) = " + sum13(new int[]{1, 2, 2, 1}));  //  → 6
        System.out.println("sum13(new int[]{1, 1}) = " + sum13(new int[]{1, 1}));  //  → 2
        System.out.println("sum13(new int[]{1, 2, 2, 1, 13}) = " + sum13(new int[]{1, 2, 2, 1, 13}));  //  → 6
        System.out.println("sum13(new int[]{1, 2, 2, 1, 13, 1}) = " + sum13(new int[]{1, 2, 2, 1, 13, 1}));  //  → 6
        System.out.println("sum13(new int[]{1, 2, 2, 1, 13, 1, 2}) = " + sum13(new int[]{1, 2, 2, 1, 13, 1,2}));  //  → 8
    }

    public static int sum13(int[] nums){
        int sum = 0;
        int i = 0;
        while ( i < nums.length){
//            for (int i = 0; i < nums.length-2; i++) {
                if (nums[i] == 13){
                    i = i+ 2;
                }else{
                    sum += nums[i];
                    i++;
                }

//            }
        }


        return sum;

    }
}
