package stringsAndLoops;

import java.util.Arrays;

/*
    Task 4: (from Day 2)
    Create a method that will accept a number (int)
    and print that many Fibonacci numbers
        Exp:    fibonacci(9);

                0    1    1    2    3    5    8    13    21
                          a +  b =  temp
                               a  + b =  temp
                                    a  + b = temp
     */
public class FibonacciArray {
    public static void main(String[] args) {

        fibonacci2(9);
    }

    public static void fibonacci2(int limit) {
        int a = 0;
        int b = 1;
        int[] fn = new int[limit];
        fn[0] = 0;
        fn[1] = 1;

        for (int i = 2; i < limit; i++) {
            fn[i] = fn[i - 2] + fn[i - 1];
        }
        System.out.println("finacci: " + Arrays.toString(fn));

    }
}
