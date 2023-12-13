package codingbat.warmup2;

/*
Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
 */
public class CountXX {
    public static void main(String[] args) {
        System.out.println(countXX("abcxx"));// → 1
        System.out.println(countXX("xxx"));// → 2
        System.out.println(countXX("xxxx"));// → 3
        System.out.println(countXX("abc"));// →0
        System.out.println(countXX("a"));// →0
        System.out.println(countXX("x"));// →0
        System.out.println(countXX("xx"));// →1
    }

    public static int countXX(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                counter++;
            }
        }
        return counter > 0 ? counter - 1 : 0;
    }
}
