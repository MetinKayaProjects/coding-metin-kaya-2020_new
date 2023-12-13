package codingbat.warmup2;
/*
Given a string and a non-negative int n,
we'll say that the front of the string is the first 3 chars,
or whatever is there if the string is less than length 3.
Return n copies of the front;

frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
 */
public class FrontTimes {
    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2));// → "ChoCho"
        System.out.println(frontTimes("Chocolate", 3));// → "ChoChoCho"
        System.out.println(frontTimes("Abc", 3));// → "AbcAbcAbc"
        System.out.println(frontTimes("Ab", 4));// → "AbAbAbAb"
        System.out.println(frontTimes("A", 2));// → "AA"
        System.out.println(frontTimes("", 2));// → ""
        System.out.println(frontTimes("Chocolate", 0));// → ""
    }
    public static String frontTimes(String str, int n){
        String strNew = "";

        for (int i = 0; i < n; i++) {
            if (str.length() < 3){
                strNew += str;
            } else {
                strNew += str.substring(0,3);
            }
        }
        return strNew;
    }
}
