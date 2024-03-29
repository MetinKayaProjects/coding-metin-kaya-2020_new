package codingbat.logic_2;

/*
Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
while the other is "far", differing from both other values by 2 or more.
Note: Math.abs(num) computes the absolute value of a number.


closeFar(1, 2, 10) → true
closeFar(4, 1, 3) → true
closeFar(10, 10, 8) → true
closeFar(8, 6, 9) → true

closeFar(1, 2, 3) → false
closeFar(8, 9, 10) → false

 */
public class CloseFar {
    public static void main(String[] args) {
        System.out.println(closeFar(1, 2, 10));
        System.out.println(closeFar(4, 1, 3));
        System.out.println(closeFar(10, 10, 8));
        System.out.println(closeFar(8, 6, 9));

        System.out.println(closeFar(1, 2, 3));
        System.out.println(closeFar(8, 9, 10));

    }

    public static boolean closeFar(int a, int b, int c) {

        return (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2) && Math.abs(b-c) >= 2
                || Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b-c) >= 2;

    }

}
