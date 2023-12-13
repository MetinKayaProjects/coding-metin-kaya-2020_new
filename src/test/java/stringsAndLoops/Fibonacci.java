package stringsAndLoops;

import java.util.ArrayList;
import java.util.List;

/*
   Task 4: (from Day 2)
   Create a method that will accept a that will accept
   a number (int) and print that many Fibonacci numbers
       Exp:    fibonacci(9);

               0    1    1    2    3    5    8    13    21
                         a +  b =  sum
                              a  + b =  sum
                                   a  + b = sum
    */
public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(9);
        System.out.println("\nfibonacci2(9) = " + fibonacci2(9));
        System.out.println("\nfibonacci3(9) = " + fibonacci3(9));


    }

    public static void fibonacci(int num) {

        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);

        int sum = 0;

        for (int i = 2; i < num; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(" " + sum);
        }

    }

    public static List<Integer> fibonacci2(int target){
        int a = 0;
        int b = 1;
        int sum = 0;
        List<Integer> fibNums = new ArrayList<>();
        fibNums.add(0, 0);
        fibNums.add(1, 1);
        for (int i = 2; i < target; i++) {
            sum = a +b;
            a =b;
            b = sum;
            fibNums.add(i, sum);
        }

        return fibNums;
    }

    public static List<Integer> fibonacci3(int target){
        int a = 0;
        int b = 1;
        int sum = 0;
        List<Integer> fibNums = new ArrayList<>();
        fibNums.add(0, 0);
        fibNums.add(1, 1);
        for (int i = 2; i < target; i++) {
            sum = a +b;
            a =b;
            b = sum;
            fibNums.add(sum);
        }

        return fibNums;
    }
}
