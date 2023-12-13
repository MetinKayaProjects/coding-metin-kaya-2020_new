package codingbat.warmup1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given three int values, a b c, return the largest.

intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
 */
public class IntMAX {
    public static void main(String[] args) {
        System.out.println(intMax(1, 2, 3));// → 3
        System.out.println(intMax(1, 3, 2));// → 3
        System.out.println(intMax(3, 2, 1));// → 3

    }

    public static int intMax(int a, int b, int c) {

        int max = Integer.MIN_VALUE;
//        int max = 0;

        List<Integer> list = new ArrayList<>(Arrays.asList(a, b, c));

//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) > max){
//                max = list.get(i);
//            }
//        }

        for (int m : list) {
            if (m > max) {
                max = m;
            }
        }
//        if (a > b){
//            max = a;
//        }else {
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }


        return max;
    }

}
