package codingbat.string_2;

/*
Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
 */
public class DoubleChar {
    public static void main(String[] args) {
        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There"));
    }

    public static String doubleChar(String str) {

        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
//            str2 += "" + str.charAt(i) + str.charAt(i);
            str2 += str.substring(i, i + 1) + str.substring(i, i + 1);
//            str2 += Character.toString(str.charAt(i)) + Character.toString(str.charAt(i));
        }
        return str2;
    }

}
