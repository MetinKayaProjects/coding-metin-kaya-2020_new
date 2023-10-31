package codingbat.warmup1;
/*
Given 2 int values, return true if one is negative and one is positive.
Except if the parameter "negative" is true, then return true only if both are negative.


posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true
 */
public class PosNegative {
    public static void main(String[] args) {
        System.out.println("posNeg(1, -1, false) = " + posNeg(1, -1, false));// → true
        System.out.println("posNeg(-1, 1, false) = " + posNeg(-1, 1, false));// → true
        System.out.println("posNeg(-4, -5, true) = " + posNeg(-4, -5, true));// → true
    }
    public static boolean posNeg(int a, int b, boolean negative) {

        if (!negative && (a >= 0 && b < 0 || b >= 0 && a < 0)){
            return true;
        }
        return negative && (a < 0 && b < 0);

    }
}
