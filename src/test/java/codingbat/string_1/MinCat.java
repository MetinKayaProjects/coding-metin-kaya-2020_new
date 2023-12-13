package codingbat.string_1;
/*
Given two strings, append them together (known as "concatenation") and return the result.
However, if the strings are different lengths,
omit chars from the longer string so it is the same length as the shorter string.
So "Hello" and "Hi" yield "loHi". The strings may be any length.


minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
 */
public class MinCat {
    public static void main(String[] args) {
        System.out.println(minCat("Hello", "Hi"));// → "loHi"
        System.out.println(minCat("Hello", "java"));// → "ellojava"
        System.out.println(minCat("java", "Hello"));// → "javaello"
        System.out.println(minCat("java", ""));// → ""
    }

    public static String  minCat(String a, String b) {
        String newStr = "";
        int aLength= a.length();
        int bLength= b.length();
        if (aLength < bLength){
            newStr = a + b.substring(bLength-aLength);
        } else if (bLength < aLength) {
            newStr = a.substring(aLength - bLength ) + b;

        }
        return newStr;
    }
}
