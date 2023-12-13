package codingbat.logic_2;

/*
Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.


blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19

 */
public class BlackJack {
    public static void main(String[] args) {
        System.out.println(blackjack(19, 21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(20, 19));
        System.out.println(blackjack(19, 22));
        System.out.println(blackjack(22, 19));
        System.out.println(blackjack(17, 18));
        System.out.println(blackjack(16, 12));

    }

    public static int blackjack(int a, int b) {
//        if (a == 21) return a;
//        if (b == 21) return b;
        if (a <= 21 && b > 21) return a;
        if (b <= 21 && a > 21) return b;
        if (a <= 21 && Math.abs(a - 21) < Math.abs(b - 21)) return a;
        if (a <= 21 && Math.abs(b - 21) < Math.abs(a - 21)) return b;
        else return 0;
    }
}
