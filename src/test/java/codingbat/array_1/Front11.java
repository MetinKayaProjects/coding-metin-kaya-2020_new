package codingbat.array_1;

import java.util.Arrays;

/*
Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.


front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]
 */
public class Front11 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(front11(new int[]{1, 2, 3}, new int[]{7, 9, 8})));//→ [1, 7]
        System.out.println(Arrays.toString(front11(new int[]{1}, new int[]{2})));//→ [1, 2]
        System.out.println(Arrays.toString(front11(new int[]{}, new int[]{})));//→ []
        System.out.println(Arrays.toString(front11(new int[]{1, 7}, new int[]{})));//→ [1]

    }

    private static int[] front11(int[] a, int[] b) {
        int size;
        if (a.length == 0 && b.length==0){
            size = 0;
        }else if (a.length == 0 || b.length==0){
            size = 1;
        }else {
            size = 2;
        }
        int[] newArr = new int[size];

        if (a.length == 0 && b.length == 0){
            newArr = a;
        }else if (a.length == 0 && b.length != 0){
            newArr[0] = b[0];
        } else if (a.length != 0 && b.length == 0) {
            newArr[0] = a[0];
        }else{
            newArr[0] = a[0];
            newArr[1] = b[0];
        }
        return newArr;
    }
}
