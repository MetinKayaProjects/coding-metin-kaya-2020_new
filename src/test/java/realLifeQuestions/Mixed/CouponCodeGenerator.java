package realLifeQuestions.Mixed;

import java.security.SecureRandom;
import java.util.Random;

public class CouponCodeGenerator {
    // Define the characters to use in the coupon code
//    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    static String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    // Define the length of the coupon code
//    private static final int CODE_LENGTH = 15;
    static int CODE_LENGTH = 15;

    public static void main(String[] args) {
        String couponCode = generateCouponCode();
        System.out.println("Coupon Code: " + couponCode + " for "+ couponCode.length() + " lenght characters");

        String couponcode2 = generateCouponCode2(18);
        System.out.println("Coupon Code: " + couponcode2 + " for "+ couponcode2.length() + " lenght characters");


    }

    public static String generateCouponCode() {
//        Random random = new SecureRandom(); // You can also use a regular Random object
        Random random = new Random();

        StringBuilder codeBuilder = new StringBuilder(CODE_LENGTH);
        for (int i = 0; i < CODE_LENGTH; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            codeBuilder.append(randomChar);
        }

        return codeBuilder.toString();
    }

    public static String generateCouponCode2( int couponCodeLenght){

        Random random = new Random();
        String codeBuilder="";

        for (int i = 0; i < couponCodeLenght; i++) {
             codeBuilder += CHARACTERS.charAt(random.nextInt(CHARACTERS.length()));


        }


        return codeBuilder;
    }
}
