package codingbat.string_1;
/*
Given a string, if a length 2 substring appears at both its beginning and end,
return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.


without2("HelloHe") → "lloHe"
without2("HelloHi") → "HelloHi"
without2("Hi") → ""
 */
public class Without2 {
    public static void main(String[] args) {
        System.out.println(without2("HelloHe"));// → "lloHe"
        System.out.println(without2("Hi"));// → ""
        System.out.println(without2("HelloHi"));// → "HelloHi"
        System.out.println(without2("x"));// → "x"
    }

    private static String without2(String str) {

        return str.length() > 2 && str.substring(0, 2).equalsIgnoreCase(str.substring(str.length()-2))
                ? str.substring(2)
                : str.length() > 2 && !str.substring(0, 2).equalsIgnoreCase(str.substring(str.length()-2)) || str.length() == 1
                ? str
                : "";
    }

}
