package codingbat.array_1;

import java.util.Arrays;

/*
Start with 2 int arrays, a and b, each length 2.
Consider the sum of the values in each array.
Return the array which has the largest sum. In event of a tie, return a.


biggerTwo([1, 2], [3, 4]) → [3, 4]
biggerTwo([3, 4], [1, 2]) → [3, 4]
biggerTwo([1, 1], [1, 2]) → [1, 2]
 */
public class BiggerTwo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(biggerTwo(new int[]{1, 2}, new int[]{3, 4})));
        System.out.println(Arrays.toString(biggerTwo(new int[]{3, 4}, new int[]{1, 2})));
        System.out.println(Arrays.toString(biggerTwo(new int[]{1, 1}, new int[]{1, 2})));
    }

    public static int[] biggerTwo(int[] a, int[] b) {

//        int sumLeft = 0;
//        int sumRight = 0;

        int sumLeft = a[0] + a[1];
        int sumRight = b[0] + b[1];

//        if (sumLeft > sumRight){
//            return a;
//        }else if( sumLeft == sumRight) {
//            return a;
//        }else {
//            return b;
//        }
        return sumLeft > sumRight ? a : (sumLeft == sumRight) ? a :  b;
    }
}
