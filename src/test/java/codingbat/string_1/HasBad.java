package codingbat.string_1;
/*
Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
such as with "badxxx" or "xbadxx" but not "xxbadxx".
The string may be any length, including 0. Note: use .equals() to compare 2 strings.


hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
 */
public class HasBad {
    public static void main(String[] args) {
        System.out.println(hasBad("badxx"));// → true
        System.out.println(hasBad("xbadxx"));// → true
        System.out.println(hasBad("xxbadxx"));// → false
        System.out.println(hasBad("bad"));// → true
        System.out.println(hasBad(""));// → false
        System.out.println(hasBad("ba"));// → false
        System.out.println(hasBad("xba"));// → false

    }
    public static boolean hasBad(String str){
//        if (str.length() > 3 && (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad"))|| (str.equals("bad"))){
//
//            return true;
//        }

        return  str.length() > 3 && (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad"))|| (str.equals("bad"));
    }
}
