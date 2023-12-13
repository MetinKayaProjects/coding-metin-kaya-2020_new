package codingbat.string_1;
/*
Given a string, if the first or last chars are 'x',
return the string without those 'x' chars, and otherwise return the string unchanged.

withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
 */
public class WithoutX {
    public static void main(String[] args) {
        System.out.println(withoutX("xHix"));// → "Hi"
        System.out.println(withoutX("xHi"));// → "Hi"
        System.out.println(withoutX("Hxix"));// → "Hxi"
        System.out.println(withoutX("x"));// → ""
        System.out.println(withoutX(""));// → ""
        System.out.println(withoutX("Hxixa"));// → "Hxixa"

    }
    public static String withoutX(String str){

        String strNew = "";
        if (str.length()>0) {
           if (str.equalsIgnoreCase("x")){
               strNew = "";
           }else if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') {
                strNew = str.substring(1, str.length() - 1);
            } else if (str.charAt(0) == 'x') {
                strNew = str.substring(1);
            } else if (str.charAt(str.length() - 1) == 'x') {
                strNew = str.substring(0, str.length() - 1);
            } else {
                strNew = str;
            }
        }else {
            strNew = str;
        }
        return strNew;
    }
}
