package codingbat.string_1;
/*
Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.


seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
 */
public class SeeColor {
    public static void main(String[] args) {
        System.out.println(seeColor("redxx"));// → "red"
        System.out.println(seeColor("xxred"));// → ""
        System.out.println(seeColor("blueTimes"));// → "blue"
    }
    public static String seeColor(String str){

        return str.startsWith("red")
                ? "red"
                :  str.startsWith("blue")
                ? "blue"
                :  "";

    }
}
