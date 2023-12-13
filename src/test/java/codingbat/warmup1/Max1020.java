package codingbat.warmup1;
/*
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
or return 0 if neither is in that range.


max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
 */
public class Max1020 {
    public static void main(String[] args) {
        System.out.println(max1020(11, 19));// → 19
        System.out.println(max1020(19, 11));// → 19
        System.out.println(max1020(11, 9));// → 11
        System.out.println(max1020(45, 5));// → 0
        System.out.println(max1020(45, 11));// → 11
        System.out.println(max1020(10, 21));// → 10
    }
//    public static int max1020(int a, int b){
//        if (a > b){
//            if(a >= 10 && a <=20){
//                return a;
//            } else if (b >= 10 && b <=20) {
//                return b;
//            }else
//                return 0;
//        }
//        if (b > a){
//            if(b >= 10 && b <=20){
//                return b;
//            }else if (a >= 10 && a <=20) {
//                return a;
//            }else
//                return 0;
//        }
//        return 0;
//    }

    public static int max1020(int a, int b){
        // First make it so the bigger value is in a
        if (b > a) {
//            int temp = a;
//            a = b;
//            b = temp;
            a += b - (b=a);
        }

        // Knowing a is bigger, just check a first
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }
}
