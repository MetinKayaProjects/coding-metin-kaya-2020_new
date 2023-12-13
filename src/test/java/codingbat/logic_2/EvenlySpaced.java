package codingbat.logic_2;

/*
Given three ints, a b c, one of them is small, one is medium and one is large.
Return true if the three values are evenly spaced,
so the difference between small and medium is the same as the difference between medium and large.


evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false

 */
public class EvenlySpaced {
    public static void main(String[] args) {
        System.out.println(evenlySpaced(2, 4, 6));
        System.out.println(evenlySpaced(4, 6, 2));
        System.out.println(evenlySpaced(4, 6, 3));
        System.out.println(evenlySpaced(4, 4, 4));


    }

    //bac
    public static boolean evenlySpaced(int a, int b, int c) {

//        if (a < b & b < c) return Math.abs(a - b) == Math.abs(b - c); //abc
//        if (a < b & c < b) return Math.abs(a - c) == Math.abs(b - c); //acb
//        if (b < a & a < c) return Math.abs(a - b) == Math.abs(a - c); //bac
//        if (b < a & c < a) return Math.abs(c - b) == Math.abs(a - c); //bca
//        if (c < a & a < b) return Math.abs(c - a) == Math.abs(a - b); //cab
//        if (c < a & b < a) return Math.abs(c - b) == Math.abs(a - b); //cba
//        else return false;

        if (a == b && b==c) return true;
        if (a < b && b < c) return Math.abs(a - b) == Math.abs(b - c); //abc
        if (a < c && c < b) return Math.abs(a - c) == Math.abs(b - c); //acb
        if (b < a && a < c) return Math.abs(a - b) == Math.abs(a - c); //bac
        if (b < c && c < a) return Math.abs(c - b) == Math.abs(a - c); //bca
        if (c < a && a < b) return Math.abs(c - a) == Math.abs(a - b); //cab
        if (c < b && b < a) return Math.abs(c - b) == Math.abs(a - b); //cba
        else return false;

    }

}
