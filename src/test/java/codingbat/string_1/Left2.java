package codingbat.string_1;
/*
Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
The string length will be at least 2.


left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"
 */
public class Left2 {
    public static void main(String[] args) {
        System.out.println(left2("Hello"));// → "lloHe"
        System.out.println(left2("java"));// → "vaja"
        System.out.println(left2("Hi"));// → "Hi"
        System.out.println(left2(""));// → ""
        System.out.println(left2("H"));// → "H"
    }
    public static String left2(String str){
        return str.length() > 2 ? str.substring(2).concat(str.substring(0,2)) : str;
    }
}
