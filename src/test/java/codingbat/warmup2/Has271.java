package codingbat.warmup2;

/*
Given an array of ints, return true if it contains a 2, 7, 1 pattern:
a value, followed by the value plus 5, followed by the value minus 1.
Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.


has271([1, 2, 7, 1]) → true  ---> 2 + 5 = 7  and 2 -1 = 1  TRUE
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true
has271([2, 7, 3]) → true     ---> 2 + 5 = 7 and 2-3 = |-1| = 1 TRUE
 */
public class Has271 {
    public static void main(String[] args) {
        System.out.println(has271(new int[]{1, 2, 7, 1})); // → true
        System.out.println(has271(new int[]{1, 2, 8, 1})); // → false
        System.out.println(has271(new int[]{2, 7, 1}));    // → true
        System.out.println(has271(new int[]{2, 7, 3}));    // → true
    }

    public static boolean has271(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {

            if (nums[i + 1] == nums[i] + 5 && Math.abs(nums[i]-1 - nums[i + 2]) <= 2) {
                return true;
            }


        }

        return false;
    }
}
