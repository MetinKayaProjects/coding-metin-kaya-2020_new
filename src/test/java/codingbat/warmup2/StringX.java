package codingbat.warmup2;
/*
Given a string, return a version where all the "x" have been removed.
Except an "x" at the very start or end should not be removed.


stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
 */
public class StringX {
    public static void main(String[] args) {
        System.out.println(stringX("xxHxix"));// → "xHix"
        System.out.println(stringX("xxHxia"));// → "xHia"
        System.out.println(stringX("abxxxcd"));// → "abcd"
        System.out.println(stringX("abxxxcdx"));// → "abcdx"
        System.out.println(stringX("xabxxxcdx"));// → "xabcdx"
    }
    public static String stringX(String str){
        String strNew = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 ){
                strNew += ""+ str.charAt(0);
            } else if (i == str.length()-1) {
                strNew += "" + str.charAt(str.length()-1);
            } else if (str.charAt(i) != 'x') {
                strNew += "" + str.charAt(i);
            }
        }
        return strNew;
//        String strNew ="";
//
//        for (int i = 1; i < str.length()-1; i++) {
//            if (str.charAt(i) != 'x')
//                strNew += str.charAt(i);
//        }
//        strNew = str.charAt(0)+ strNew+str.charAt(str.length()-1);
//
//        return strNew;
    }
}

