package codingbat.string_1;
/*
Given a string of any length, return a new string where the last 2 chars,
if present, are swapped, so "coding" yields "codign".

lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
 */
public class Last2 {
    public static void main(String[] args) {
        System.out.println(lastTwo("coding"));// → "codign"
        System.out.println(lastTwo("cat"));// → "cta"
        System.out.println(lastTwo("a"));// → "a"
        System.out.println(lastTwo(""));// → ""
        System.out.println(lastTwo("ab"));// → "ba"
    }
    public static String lastTwo(String str){
//        String newStr = str.substring(str.length()-2);
//        return str.length() >=2 ? str.substring(0, str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2) : str;
        return str.length() >=2 ? str.substring(0, str.length()-2) + reversedStr(str.substring(str.length()-2)) : str;
    }
    public static String reversedStr(String str){
        String reversed = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
