package codingbat.logic_2;

/*
Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.


luckySum(1, 2, 3) → 6
luckySum(1, 2, 13) → 3
luckySum(1, 13, 3) → 1
luckySum(13, 2, 3) → 0
 */
public class LuckySum {
    public static void main(String[] args) {
        System.out.println("********** true results: \n");
        System.out.println(luckySum(1, 2, 3));
        System.out.println(luckySum(1, 2, 13));
        System.out.println(luckySum(1, 13, 3));
        System.out.println(luckySum(13, 2, 3));
    }

    public static int luckySum(int a, int b, int c) {

        return (a == 13) ? 0 : (b == 13) ? a : (c == 13) ? (a + b) : (a + b + c);
    }
}
