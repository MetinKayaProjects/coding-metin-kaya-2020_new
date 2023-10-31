package codingbat.warmup1;
/*
We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.


parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false
 */
public class ParrotTrouble {
    public static void main(String[] args) {
        System.out.println("parrotTrouble(true, 6) = " + parrotTrouble(true, 6));// → true
        System.out.println("parrotTrouble(true, 7) = " + parrotTrouble(true, 7));// → false
        System.out.println("parrotTrouble(false, 6) = " + parrotTrouble(false, 6));// → false
        System.out.println("parrotTrouble(true, 23) = " + parrotTrouble(true, 23));// → true
    }
    public static boolean parrotTrouble(boolean talking, int hour) {


            if (talking && (hour > 0 && hour < 7 || hour > 20 && hour <= 23)) {
                return true;
            }

        return false;
    }
}
