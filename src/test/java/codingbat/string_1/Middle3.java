package codingbat.string_1;
/*
Given a string of odd length, return the string length 3 from its middle,
so "Candy" yields "and". The string length will be at least 3.


middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"
 */
public class Middle3 {
    public static void main(String[] args) {
        System.out.println(middleThree("Candy"));// → "and"
        System.out.println(middleThree("and"));// → "and"
        System.out.println(middleThree("solving"));// → "lvi"
    }
    public static String middleThree(String str){

        return  str.substring(str.length()/2-1, str.length()/2+2);
    }
}
