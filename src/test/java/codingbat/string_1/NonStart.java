package codingbat.string_1;
/*
Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.


nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
 */
public class NonStart {
    public static void main(String[] args) {
        System.out.println(nonStart("Hello", "There"));// → "ellohere"
        System.out.println(nonStart("H", "T"));// → ""
    }
    public static String nonStart(String a, String b){
        return a.substring(1).concat(b.substring(1));
    }
}
