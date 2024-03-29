package codingbat.warmup1;
/*
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
 */
public class MixStart {
    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks")); //→ true
        System.out.println(mixStart("pix snacks")); //→ true
        System.out.println(mixStart("piz snacks")); //→ false
        System.out.println(mixStart("9iz snacks")); //→ false
        System.out.println(mixStart("nz snacks")); //→ false
        System.out.println(mixStart("k snacks")); //→ false
    }
    public static boolean mixStart(String str){

        return str.length() >= 3 && str.substring(1, 3).equalsIgnoreCase("ix");
    }
}
