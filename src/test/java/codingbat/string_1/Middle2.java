package codingbat.string_1;
/*
Given a string of even length,
return a string made of the middle two chars, so the string "string" yields "ri".
The string length will be at least 2.


middleTwo("str ing") → "ri"  /length 3 ri l-1 2, 4
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
 */
public class Middle2 {
    public static void main(String[] args) {
        System.out.println(middleTwo("string"));// → "ri"
        System.out.println(middleTwo("code"));// → "od"
        System.out.println(middleTwo("Practice"));// → "ct"
    }
    public static String middleTwo(String str){
        return str.substring(str.length()/2 - 1, str.length()/2 + 1);
    }
}
