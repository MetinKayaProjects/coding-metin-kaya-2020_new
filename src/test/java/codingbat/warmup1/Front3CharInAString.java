package codingbat.warmup1;
/*
Given a string, we'll say that the front is the first 3 chars of the string.
If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.


front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
 */
public class Front3CharInAString {
    public static void main(String[] args) {
        System.out.println("front3(\"Java\") = " + front3("Java"));
        System.out.println("front3(\"Chocolate\") = " + front3("Chocolate"));
        System.out.println("front3(\"abc\") = " + front3("abc"));
        System.out.println("front3(\"ab\") = " + front3("ab"));
        System.out.println("front3(\"a\") = " + front3("a"));
        System.out.println("front3(\"\") = " + front3(""));
    }
    public static String front3(String str) {
//        String strNew = "";
//        if (str.length()<=3){
//            strNew = str + str + str;
//        }else {
//            strNew = str.substring(0,3) + str.substring(0,3) +str.substring(0,3);
//        }
        return (str.length()<=3)?(str + str + str) : (str.substring(0,3) + str.substring(0,3) +str.substring(0,3));
    }
}
