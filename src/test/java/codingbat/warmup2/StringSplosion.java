package codingbat.warmup2;

/*
Given a non-empty string like "Code" return a string like "CCoCodCode".

stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
 */
public class StringSplosion {
    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));// → "CCoCodCode"
        System.out.println(stringSplosion("abc"));// → "aababc"
        System.out.println(stringSplosion("ab"));// → "aab"
        System.out.println(stringSplosion("a"));// → "aa"

//        String str1= "a";
//        System.out.println("01 = " + str1.substring(0,1));; //a
//        System.out.println("00 = " + str1.substring(0,0));; //""
    }

    public static String stringSplosion(String str) {
        String strNew = "";
        for (int i = 0; i < str.length(); i++) {
            strNew += str.substring(0, i);
        }
        strNew += str;

        return strNew;
    }
}
