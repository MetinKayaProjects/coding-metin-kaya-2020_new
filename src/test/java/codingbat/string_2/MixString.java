package codingbat.string_2;
/*
Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.


mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
 */
public class MixString {
    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));
        System.out.println(mixString("xxx", "X")); //xXxx
        System.out.println(mixString("ax", "b")); //abx
        System.out.println(mixString("Long", "So")); //LSoong

    }
    public static String mixString(String a, String b){
        String str = "";
        if (a.length() < b.length()){
            for (int i = 0; i < a.length(); i++) {
                str += ""+ a.charAt(i) + b.charAt(i);
            }
            str = str + b.substring(a.length());
        } else if (b.length() < a.length()) {
            for (int i = 0; i < b.length(); i++) {
                str += "" + a.charAt(i) + b.charAt(i);
            }
            str = str + a.substring(b.length());
        }else{
            for (int i = 0; i < b.length(); i++) {
                str += "" + a.charAt(i) + b.charAt(i);
            }
        }
        return str;
    }
}
