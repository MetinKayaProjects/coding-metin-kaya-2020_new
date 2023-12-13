package stringsAndLoops;
/*
       Task 2:
       Create a method that will accept a number and check if the number is an Armstrong number.
       If the number is an Armstrong number return true otherwise return false.
                153 > 1^3 + 5^3 + 3^3 == 153
                1^3 = 1 * 1 * 1 = 1
                5^3 = 5 * 5 * 5 = 125
                3^3 = 3 * 3 * 3 = 27        1+125+27=153
        */
public class Amstrong {
    public static void main(String[] args) {

        System.out.println("This num isAmstrong? " + isAmstrong(153));


    }
    public static boolean isAmstrong(int num){
        String number = String.valueOf(num);
        int power = number.length();
        int sum=0;

        for (int i=0; i<number.length(); i++){

               sum += Math.pow(Integer.parseInt(""+ number.charAt(i)),power);
//               sum += power(Integer.parseInt(""+number.charAt(i)), power);

        }

        return sum == num;
    }
//    static int power(int num, int length){
//        int pow = 1;
//        for (int i = 0; i < length; i++) {//153
//            pow = pow * num;
//        }
////        System.out.println("pow = " + pow);
//        return pow;
//    }
}
