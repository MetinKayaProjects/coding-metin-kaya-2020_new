package codingbat.warmup1;

/*
Given two int values, return their sum. Unless the two values are the same, then return double their sum.


sumDouble(1, 2); //→ 3
sumDouble(3, 2); //→ 5
sumDouble(2, 2); //→ 8
 */
public class sumDouble {
    public static void main(String[] args) {
        System.out.println("sumDouble(1, 2) = " + sumDouble(1, 2)); //→ 3
        System.out.println("sumDouble(3, 2) = " + sumDouble(3, 2)); //→ 5
        System.out.println("sumDouble(2, 2) = " + sumDouble(2, 2)); //→ 8
    }

    public static int sumDouble(int a, int b) {
        int sum = 0;
        if (a == b) {
            sum = 2 * (a + b);
        } else {
            sum = a + b;
        }

        return sum;
    }
}
