package codingbat.warmup1;

/*
Given a string, return true if the string starts with "hi" and false otherwise.


startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
 */
public class StartsWithHI {
    public static void main(String[] args) {
        System.out.println("startHi(\"Hi there\") = " + startHi("Hi there"));
        System.out.println("startHi(\"HI\") = " + startHi("HI"));
        System.out.println("startHi(\"hello hi\") = " + startHi("hello hi"));
        System.out.println("startHi(\"h\") = " + startHi("h"));
        System.out.println("startHi(\"\") = " + startHi(""));
    }

    public static boolean startHi(String str) {

        return str.toLowerCase().startsWith("hi");
    }
}
