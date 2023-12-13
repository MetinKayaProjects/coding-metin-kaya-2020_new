package codingbat.warmup1;
/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.

loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
 */
public class LoneTeen {
    public static void main(String[] args) {
        System.out.println("loneTeen(13, 99) = " + loneTeen(13, 99)); //true
        System.out.println("loneTeen(21, 19) = " + loneTeen(21, 19)); //true
        System.out.println("loneTeen(13, 13) = " + loneTeen(13, 13)); //false
        System.out.println("loneTeen(99, 99) = " + loneTeen(99, 99)); //false
        System.out.println("loneTeen(16, 17) = " + loneTeen(16, 17)); //false
    }
//    boolean aTeen = (a >= 13 && a <= 19);
//    boolean bTeen = (b >= 13 && b <= 19);
//
//  return (aTeen && !bTeen) || (!aTeen && bTeen);
    public static boolean loneTeen(int a, int b){
//        return ((a >= 13 && a <= 19) && !(b >= 13 && b <= 19)) || (!(a >= 13 && a <= 19) && (b >= 13 && b <= 19));
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        return (aTeen && !bTeen) || (!aTeen && bTeen);



    }
}
