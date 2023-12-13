package codingbat.string_1;

/*
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
 */
public class FirstHalf {
    public static void main(String[] args) {
        System.out.println(firstHalf("WooHoo"));// → "Woo"
        System.out.println(firstHalf("HelloThere"));// → "Hello"
        System.out.println(firstHalf("abcdef"));// → "abc"
    }

    public static String firstHalf(String str) {

        return str.substring(0, str.length() / 2);
    }
}
