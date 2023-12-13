package codingbat.recursion_1;

/*
Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. 
Compute the result recursively (without loops).

factorial(1) → 1
factorial(2) → 2
factorial(3) → 6
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(4));
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= (n - i);
        }
        return result;

        // Base case: if n is 1, we can return the answer directly
//        if (n == 1) return 1;
//        return n * factorial(n-1);
    }
}
