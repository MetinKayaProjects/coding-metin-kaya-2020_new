package aa_Remember;

import java.util.Random;

public class RandomExp {
    public static void main(String[] args) {
        // RANDOM
        Random random = new Random();
        int guess = random.nextInt(99);
        int guess2 = random.nextInt();

        System.out.println("guess = " + guess);
        System.out.println("guess2 = " + guess2);
    }
}
