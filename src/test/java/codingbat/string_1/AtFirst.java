package codingbat.string_1;
/*
Given a string, return a string length 2 made of its first 2 chars.
If the string length is less than 2, use '@' for the missing chars.


atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"
 */
public class AtFirst {
    public static void main(String[] args) {
        System.out.println(atFirst("hello"));// → "he"
        System.out.println(atFirst("hi"));// → "hi"
        System.out.println(atFirst("h"));// → "h@"
        System.out.println(atFirst(""));// → "@@"
    }
    public static String atFirst(String str){
        if (str.length() == 1){
            str = str + '@';
        } else if (str.length() >= 2) {
            str = str.substring(0, 2);
        } else if (str.length() == 0) {
            str = "@@";
        }
        return str;
    }
}
