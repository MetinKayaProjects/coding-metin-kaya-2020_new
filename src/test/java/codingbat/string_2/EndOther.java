package codingbat.string_2;

/*
Given two strings, return true if either of the strings appears at the very end of the other string,
ignoring upper/lower case differences
(in other words, the computation should not be "case sensitive").
Note: str.toLowerCase() returns the lowercase version of a string.

endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
endOther("Hiabcx", "bc") → false
endOther("ab", "ab12") → false
 */
public class EndOther {
    public static void main(String[] args) {
        System.out.println(endOther("Hiabc", "abc"));
        System.out.println(endOther("AbC", "HiaBc"));
        System.out.println(endOther("abc", "abXabc"));
        System.out.println(endOther("Hiabcx", "bc"));
        System.out.println(endOther("ab", "ab12"));
    }

    public static boolean endOther(String a, String b) {
        return (a.length() >= b.length())
                ?(a.toLowerCase().substring(a.length() - b.length()).contains(b.toLowerCase()))
                :(b.toLowerCase().substring(b.length() - a.length()).contains(a.toLowerCase()));
    }

}
