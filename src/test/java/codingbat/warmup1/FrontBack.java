package codingbat.warmup1;

/*
Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
 */
public class FrontBack {
    public static void main(String[] args) {

        System.out.println("frontBack(\"code\") = " + frontBack("code"));// → "eodc"
        System.out.println("frontBack(\"a\") = " + frontBack("a")); // → "a"
        System.out.println("frontBack(\"ab\") = " + frontBack("ab"));// → "ba"
        System.out.println("frontBack(\"\") = " + frontBack(""));// → ""
    }

    public static String frontBack(String str) {
        String strNew = "";
//        String strNew = str.substring(str.length()-1)
//                + str.substring(1,str.length()-1)
//                + str.substring(0,1);
        if(str.length() == 0) {
            strNew = "";
        }else if (str.length() == 1) {
                strNew = str;
            }else {
                strNew = str.charAt(str.length() - 1)
                        + str.substring(1, str.length() - 1)
                        + str.charAt(0);

//             strNew = str.substring(str.length()-1)
//                + str.substring(1,str.length()-1)
//                + str.substring(0,1);
            }

        return strNew;
    }

}
