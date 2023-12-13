package codingbat.logic_2;

/*
Given 3 int values, a b c, return their sum.
However, if one of the values is the same as another of the values, it does not count towards the sum.

loneSum(1, 2, 3) → 6
loneSum(3, 2, 3) → 2
loneSum(3, 3, 3) → 0
 */
public class IoneSum {
    public static void main(String[] args) {
        System.out.println("********** true results: \n");
        System.out.println(loneSum(1, 2, 3));
        System.out.println(loneSum(3, 2, 3));
        System.out.println(loneSum(3, 3, 3));
    }

    public static int loneSum(int a, int b, int c) {

//        if(a==b && b==c)
//            return 0;
//        else if (a==c)
//            return b;
//        else if (b==c)
//            return a;
//        else if(a==b)
//            return c;
//        else
//            return a+b+c;
        return (a == b && b == c) ? 0 : (a == b) ? c : (a == c) ? b : (b == c) ? a : a + b + c;
    }
}
