package codingbat.warmup2;

/*
Suppose the string "yak" is unlucky.
Given a string, return a version where all the "yak" are removed,
but the "a" can be any char. The "yak" strings will not overlap.


stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
 */
public class StringYAK {
    public static void main(String[] args) {
        System.out.println(stringYak("yakpak"));// → "pak"
        System.out.println(stringYak("pakyak"));// → "pak"
        System.out.println(stringYak("yak123ya"));// → "123ya"
    }

    public static String stringYak(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i+3).equalsIgnoreCase("yak")){
//            if (i+2 < str.length() && str.substring(i, i+3).equalsIgnoreCase("yak")){
                return str.replace("yak", "");
            }
        }
        return str;
    }
}
