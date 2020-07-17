package stringsAndLoops;

import java.util.Scanner;
/*
Armstrong Number?
A number is called an Armstrong number
if it is equal to sum of its digits each raised to the power of number of digits in it.
For example: 153, 371, 407, 9474, 54748 are some Armstrong numbers.
 */

public class AmstrongDifficult {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter number");

        int number=scan.nextInt();

        System.out.println("Please enter number of digits");

        int digit=scan.nextInt();

        int temp=number;
        int sum=0;


        do {

            int value=temp%10;
            temp/=10;
            sum+=Math.pow(value,digit);

        }while (temp>0);

        if (number==sum) {


            System.out.println("This is an Armstrong number");
        }else {


            System.out.println("This is not an Armstrong number");
        }
    }

}
