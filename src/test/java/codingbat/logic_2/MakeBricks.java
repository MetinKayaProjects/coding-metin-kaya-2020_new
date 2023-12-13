package codingbat.logic_2;

/*
We want to make a row of bricks that is goal inches long.
We have a number of small bricks (1 inch each) and big bricks (5 inches each).
Return true if it is possible to make the goal by choosing from the given bricks.
This is a little harder than it looks and can be done without any loops.
See also: Introduction to MakeBricks


makeBricks(3, 1, 8) → true
makeBricks(3, 2, 10) → true
makeBricks(3, 2, 8) → true
makeBricks(1000000, 1000, 1000100) → true

makeBricks(3, 1, 9) → false
makeBricks(3, 2, 9) → false
makeBricks(1, 4, 12) → false
makeBricks(2, 1000000, 100003) → false
makeBricks(3, 2, 9) → false
makeBricks(1, 4, 12) → false
makeBricks(2, 1000000, 100003) → false
 */
public class MakeBricks {
    public static void main(String[] args) {
        System.out.println("********** true results: \n");
        System.out.println(makeBricks(3, 1, 8));
        System.out.println(makeBricks(3, 2, 10));

        System.out.println(makeBricks(3, 2, 8)); //3*1 + 1*5 = 8

        System.out.println(makeBricks(8, 1, 8)); //3*1 + 1*5 = 8
        System.out.println(makeBricks(20, 0, 19));

        System.out.println("********** false results: \n");
//        System.out.println(makeBricks(3, 1, 9));
//        System.out.println(makeBricks(3, 2, 9));
        System.out.println(makeBricks(4, 1, 12));
//        System.out.println(makeBricks(2, 1000000, 100003));
    }

    public static boolean makeBricks(int small, int big, int goal) {

        return big * 5 + small >= goal && small >= goal % 5;
    }
}
