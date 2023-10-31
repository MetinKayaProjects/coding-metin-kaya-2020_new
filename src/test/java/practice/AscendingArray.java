package practice;

import java.util.Arrays;

/*
For a = [1, 3, 5, 6, 4, 2], the output should be solution(a) = true.
The new array b will look like [1, 2, 3, 4, 5, 6], which is in strictly ascending order, so the answer is true.
a = [1, 3, 5, 6, 4, 2]
i    0  1  2  3  4  5
b = [1, 2, 3, 4, 5, 6]   return TRUE since b is ascending order
if i % 2 = 0 --> If the index is an even number, it is added from the beginning, if it is an even number, it is added from the end.

For
a = [1, 4, 5, 6, 3], the output should be solution(a) = false.
b = [1, 3, 4, 6, 5]  --> return FALSE since b is NOT ascending order

The new array b will look like [1, 3, 4, 6, 5], which is not in strictly ascending order, so the answer is false.
 */
public class AscendingArray {

    public static void main(String[] args) {

        int[] a1 = {1, 3, 5, 6, 4, 2};

        int[] a2 = {1, 4, 5, 6, 3};

        boolean result1 = solution(a1);
        boolean result2 = solution(a2);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
//    a = [1, 3, 5, 6, 4, 2]
//    i    0  1  2  3  4  5
//    b = [1, 2, 3, 4, 5, 6]   return TRUE


    public static boolean solution(int[] a) {
        int n = a.length;
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                b[i] = a[i / 2];
            } else {
                b[i] = a[n - 1 - i / 2];
            }
        }
        /*
                 i  b
                 0. b[1,0,0,0,0,0]
                 1. b[1,2,0,0,0,0]
                 2. b[1,2,3,0,0,0]
                 3. b[1,2,3,4,0,0]
                 4. b[1,2,3,4,5,0]
                 5. b[1,2,3,4,5,6]
         */
        System.out.println("Arrays.toString(b) = " + Arrays.toString(b));

        // Check if b is in strictly ascending order
        for (int i = 1; i < n; i++) {
            if (b[i] <= b[i - 1]) {
                return false;
            }
        }
        System.out.println("Arrays.toString(b) = " + Arrays.toString(b));

        return true;
    }


}



