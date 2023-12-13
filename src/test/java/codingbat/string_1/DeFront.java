package codingbat.string_1;

/*
Given a string, return a version without the first 2 chars.
Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.


deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
deFront("abay") → "abay"
deFront("xbay") → "bay"
 */
public class DeFront {
    public static void main(String[] args) {
        System.out.println(deFront("Hello"));// → "llo"
        System.out.println(deFront("java"));// → "va"
        System.out.println(deFront("away"));// → "aay"
        System.out.println(deFront("abay"));// → "abay"
        System.out.println(deFront("xbay"));// → "bay"
        System.out.println(deFront("xb"));// → "b"
        System.out.println(deFront("a"));// → "a"
        System.out.println(deFront("ab"));// → "ab"
        System.out.println(deFront(""));// → ""
    }

    public static String deFront(String str) {
        String strNew = "";
        if (str.length() >= 2) {
            if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
                strNew = str;
            } else if (str.charAt(0) == 'a' && str.charAt(1) != 'b') {
                strNew = ""+ str.charAt(0) + str.substring(2);
            }else if (str.charAt(0) != 'a' && str.charAt(1) == 'b') {
                strNew = str.substring(1);
            }else {
                strNew = str.substring(2);
            }
        }else {
            strNew = str;
        }
        return strNew;
//        String strNew = "";
//
//        if (str.length() > 0 && str.charAt(0) == 'a') {
//            strNew += "a";
//        }
//
//        if (str.length() > 1 && str.charAt(1) == 'b') {
//            strNew +=  "b" ;
//        }
////        for (int i = 2; i < str.length(); i++) {
////            strNew += str.charAt(i);
////        }
//        if (str.length()>2){
//        strNew += str.substring(2);}
//
//
//        return strNew;
    }

}
