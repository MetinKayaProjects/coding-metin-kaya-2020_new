package codingbat.warmup1;

/*
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.


diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
 */
public class Diff21 {
    public static void main(String[] args) {

        System.out.println("diff21(19) = " + diff21(19));// → 2
        System.out.println("diff21(10) = " + diff21(10));// → 11
        System.out.println("diff21(21) = " + diff21(21));// → 0
        System.out.println("diff21(25) = " + diff21(25));// → 8
    }

    public static int diff21(int n) {
        int diff = 0;
        if (n <= 21) {
            diff = 21 - n;
        } else {
            diff = 2 * (n - 21);
        }
        return diff;
    }
}
