package codingbat.warmup2;

/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
 */
public class DoubleX {
    public static void main(String[] args) {
        System.out.println(doubleX("axxbb"));// → true
        System.out.println(doubleX("axaxax"));// → false
        System.out.println(doubleX("x"));// → false
        System.out.println(doubleX("aaa"));// → false
        System.out.println(doubleX("xaxxx"));// → false
        System.out.println(doubleX("xaxx"));// → false
        System.out.println(doubleX("aaaxx"));// → true
        System.out.println(doubleX("aaaxxaaxxx"));// → true
        System.out.println(doubleX("aaaxaaxxx"));// → false
    }

    public static boolean doubleX(String str) {
        int indexOfFirstX = str.indexOf("x"); // index of the first x in the String

        if (indexOfFirstX == -1) return false; // no "x" at all
//        if (indexOfFirstX == -1 || indexOfFirstX+1 >= str.length()) return false; // no "x" at all and check i+1 in bounds?

//        // Is char at i+1 also an "x"?
        if (indexOfFirstX+1 >= str.length()) return false; // check i+1 in bounds?

//        return str.substring(indexOfFirstX+1, indexOfFirstX+2).equals("x");
        return str.charAt(indexOfFirstX+1)=='x';

    }
}
