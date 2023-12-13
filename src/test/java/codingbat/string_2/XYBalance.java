package codingbat.string_2;
/*
We'll say that a String is xy-balanced if for all the 'x' chars in the string,
there exists a 'y' char somewhere later in the string. So "xxy" is balanced,
but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
 */
public class XYBalance {
    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby"));
        System.out.println(xyBalance("aaxbb"));
        System.out.println(xyBalance("yaaxbb"));
        System.out.println(xyBalance("yaaxbby"));
        System.out.println(xyBalance("xaxxbbyx"));
        System.out.println(xyBalance("bbb"));
        System.out.println(xyBalance("y"));
    }
    public static boolean xyBalance(String str){

        return (str.length() == 1 && str.contains("y") || str.contains("x") && str.contains("y") && str.substring(str.indexOf('x')).contains("y")
                && !str.substring(str.lastIndexOf("y")).contains("x")
        || (!str.contains("x") && !str.contains("y")));
    }
}
