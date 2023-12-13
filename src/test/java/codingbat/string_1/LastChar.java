package codingbat.string_1;
/*
Given 2 strings, a and b,
return a new string made of the first char of a and the last char of b,
so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.


lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"
 */
public class LastChar {
    public static void main(String[] args) {
        System.out.println(lastChars("last", "chars"));// → "ls"
        System.out.println(lastChars("yo", "java"));// → "ya"
        System.out.println(lastChars("hi", ""));//→ "h@"
        System.out.println(lastChars("h", "class"));//→ "hs"
        System.out.println(lastChars("", "class"));//→ "@s"
        System.out.println(lastChars("hi", ""));//→ "h@"
        System.out.println(lastChars("h", "c"));//→ "hc"
        System.out.println(lastChars("", ""));//→ "@@"
    }
    public static String lastChars(String a, String b){
       String newStr = "";
        if (a.length()<=0 && b.length()> 0){
           newStr = "@"+b.charAt(b.length()-1);
        } else if (a.length() > 0 && b.length() <= 0) {
            newStr = a.charAt(0) + "@";
        } else if (a.length() <= 0 && b.length() <= 0) {
            newStr = "@@";
        } else {
            newStr = ""+ a.charAt(0) + b.charAt(b.length()-1);
        }
        return newStr;
    }
}
