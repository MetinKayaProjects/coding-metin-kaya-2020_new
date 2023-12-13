package codingbat.logic_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given 3 int values, a b c, return their sum.
However, if any of the values is a teen -- in the range 13..19 inclusive --
then that value counts as 0, except 15 and 16 do not count as a teens.
Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule.
In this way, you avoid repeating the teen code 3 times (i.e. "decomposition").
Define the helper below and at the same indent level as the main noTeenSum().


noTeenSum(1, 2, 3) → 6
noTeenSum(2, 13, 1) → 3
noTeenSum(2, 1, 14) → 3
 */
public class NoTeenSum {
    public static void main(String[] args) {
        System.out.println(noTeenSum(1, 2, 3));
        System.out.println(noTeenSum(2, 13, 1));
        System.out.println(noTeenSum(2, 1, 14));
        System.out.println(noTeenSum(14, 1, 3));
        System.out.println(noTeenSum(14, 13, 3));
        System.out.println(noTeenSum(13, 2, 17));
        System.out.println(noTeenSum(15, 2, 17));
        System.out.println(noTeenSum(15, 16, 17));
        System.out.println(noTeenSum(13, 14, 17));
    }

    public static int noTeenSum(int a, int b, int c) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(13,14,17,18,19));

        return nums.contains(a)&& nums.contains(b)&& nums.contains(c)
                ? 0
                :(nums.contains(a)&& nums.contains(b))
                ? c
                : (nums.contains(b)&&nums.contains(c))
                ? a
                : nums.contains(a)&&nums.contains(c)
                ? b
                : nums.contains(a)
                ? b+c
                : nums.contains(b)
                ? a+c
                : nums.contains(c)
                ? a+b
                : a+b+c;
    }
}
