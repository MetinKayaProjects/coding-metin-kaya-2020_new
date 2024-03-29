package codingbat.warmup1;
/*
Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.


makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true
 */
public class Makes10 {
    public static void main(String[] args) {
        System.out.println("makes10(9, 10) = " + makes10(9, 10));// → true
        System.out.println("makes10(9, 9) = " + makes10(9, 9));//→ false
        System.out.println("makes10(1, 9) = " + makes10(1, 9));// → true
    }
    public static boolean makes10(int a, int b) {

        return a == 10 || b == 10 || (a + b == 10);
    }
}
