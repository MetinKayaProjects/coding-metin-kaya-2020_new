package collections;

import java.util.Arrays;

public class FibonachiARRAY_mk {
    public static void main(String[] args) {
        //fibonachi = 0, 1, 1, 2, 3, 5, 8, 13  --> nums
        //fibonachi = 0, 1, 2, 3, 4, 5, 6, 7   --> index

        System.out.println(Arrays.toString(fibonachiGenerator(8))); //[0, 1, 1, 2, 3, 5, 8, 13]
        System.out.println(Arrays.toString(fibonachiGenerator(11))); //[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55]

    }

    public static int[] fibonachiGenerator(int num){

        int[] intArr = new int[num];
        intArr[0] = 0;
        intArr[1] = 1;

        for (int i = 2; i < num; i++){
            intArr[i] = intArr[i-2] + intArr[i-1];
        }
        return intArr;

    }
}
