package codingbat.warmup1;

/*
Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.


notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"
 */
public class NotString {
    public static void main(String[] args) {
        System.out.println("notString(\"candy\") = " + notString("candy"));// → "not candy"
        System.out.println("notString(\"x\") = " + notString("x"));// → "not x"
        System.out.println("notString(\"not bad\") = " + notString("not bad"));// → "not bad"
        System.out.println("notString(\"not\") = " + notString("not"));// → "not"
    }

    public static String notString(String str) {
//        if (str.equals("not")) {
//            return str;
//        }else
//        if (str.length() > 3 && str.substring(0, 3).equals("not") || str.equals("not")) {
//            return str;
//        }
//        return "not ".concat(str);

        return (str.length() > 3 && str.substring(0, 3).equals("not") || str.equals("not"))? str : "not ".concat(str);
    }
}
