package stringsAndLoops;

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
}
