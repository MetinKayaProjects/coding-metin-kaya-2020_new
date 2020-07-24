package stringsAndLoops;

public class Factorial {
    public static void main(String[] args) {
        factorial(3); // 6
        factorial(4); // 24
        factorial(5); // 120
    }
    static void factorial(int num){
        int sum = 1;
        while (num > 1){  // it should be larger than 1, since in the method
            sum = sum * num * (num-1);  //we imlement num*(num-1) -- > num-1=0 olmamali
            num -= 2;
//            System.out.println("num = " + num);
//            System.out.println("sum = " + sum);
        }
        System.out.println("factorial = " + sum);

    }
}
