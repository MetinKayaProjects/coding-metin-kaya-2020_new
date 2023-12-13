package codingbat.string_2;
/*
Returns true if for every '*' (star) in the string,
if there are chars both immediately before and after the star, they are the same.


sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true
 */
public class SameStarChar {
    public static void main(String[] args) {
        System.out.println(sameStarChar("xy*yzz"));
        System.out.println(sameStarChar("xy*zzz"));
        System.out.println(sameStarChar("*xa*az"));

    }
    public static boolean sameStarChar(String str) {

        boolean result = true;
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (Character.toString(str.charAt(i - 1)).equals(Character.toString(str.charAt(i + 1)))) {
                    result = true;
                } else {
                    result = false;
                }
            }
        }

            return result;
        }
}
