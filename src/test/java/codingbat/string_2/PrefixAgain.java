package codingbat.string_2;

/*
Given a string,
consider the prefix string made of the first N chars of the string.
Does that prefix string appear somewhere else in the string?
Assume that the string is not empty and that N is in the range 1..str.length().

prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false
 */
public class PrefixAgain {
    public static void main(String[] args) {

        System.out.println(prefixAgain("abXYabc", 1));
        System.out.println(prefixAgain("abXYabc", 2));
        System.out.println(prefixAgain("abXYabc", 3));
        System.out.println(prefixAgain("aa", 1)); //true
        System.out.println(prefixAgain("ba", 1)); //false
    }

    public static boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        System.out.println(prefix);
        if (str.length() == 2 && str.charAt(0) == str.charAt(1)){
            return true;
        } else if (str.length() == 2 && str.charAt(0) != str.charAt(1)) {
            return false;
        }
        for (int i = prefix.length(); i < str.length() - n; i++) {
            if (str.substring(i, i + n ).equals(prefix)){
                return  true;
            }
        }
        return false;
    }
}
