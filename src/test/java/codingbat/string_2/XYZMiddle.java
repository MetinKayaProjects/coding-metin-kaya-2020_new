package codingbat.string_2;

/*
Given a string, does "xyz" appear in the middle of the string?
To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
This problem is harder than it looks.

xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
xyzMiddle("AAAxyzBB") → true
 */
public class XYZMiddle {
    public static void main(String[] args) {
//        System.out.println(xyzMiddle("AAxyzBB"));
//        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));
//        System.out.println(xyzMiddle("AAAxyzBB"));
//        System.out.println(xyzMiddle("1x345xyz12x4")); //true
        System.out.println(xyzMiddle("xyzAxyzBxyz")); //true
    }

    public static boolean xyzMiddle(String str) {

        int len = str.length();

        if (len < 3) {
            return false;
        }

        int mid = len / 2;

        // If the string length is odd
        if (len % 2 == 1) {
            // Check if "xyz" appears in the middle
            return str.substring(mid - 1, mid + 2).equals("xyz");
        } else {
            // If the string length is even, check for "xyz" with conditions around the middle
            return str.substring(mid - 2, mid + 1).equals("xyz") || str.substring(mid - 1, mid + 2).equals("xyz");
        }
    }
}
