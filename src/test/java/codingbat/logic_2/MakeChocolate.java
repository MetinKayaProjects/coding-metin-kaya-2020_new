package codingbat.logic_2;

/*
We want make a package of goal kilos of chocolate.
We have small bars (1 kilo each) and big bars (5 kilos each).
Return the number of small bars to use, assuming we always use big bars before small bars.
Return -1 if it can't be done.


makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2
makeChocolate(6, 2, 7) → 2
 */
public class MakeChocolate {
    public static void main(String[] args) {

        System.out.println(makeChocolate(4, 1, 9));  //1*5 < 9 ==> 9 - 1*5 = 4 <= 4 ==> result 4
        System.out.println(makeChocolate(4, 1, 10)); //1*5 < 10 ==> 10 - 1*5 = 5 <= 4 NO result -1
        System.out.println(makeChocolate(4, 1, 7));  //1*5 < 7 ==> 7 - 1*5 = 2 <= 4 yes result 2

        System.out.println(makeChocolate(6, 2, 7));  //2*5 !<=7 => 7 % 5 = 2 < 6 ==> 2

    }

    public static int makeChocolate(int small, int big, int goal) {

        if (big * 5 <= goal) {
            if (goal - big * 5 <= small) return (goal - big * 5);
            if (goal - big * 5 > small) return -1;
        } else if (big * 5 > goal) {
            if (goal % 5 <= small) return goal % 5;
        }
        return -1;

    }
}
