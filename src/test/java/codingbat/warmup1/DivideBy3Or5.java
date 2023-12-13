package codingbat.warmup1;
/*
or35
prev  |  next  |  chance
Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod


or35(3) → true
or35(10) → true
or35(8) → false
 */
public class DivideBy3Or5 {
    public static void main(String[] args) {
        System.out.println("or35(3) = " + or35(3));
        System.out.println("or35(10) = " + or35(10));
        System.out.println("or35(8) = " + or35(8));
    }
    public static boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }
}
