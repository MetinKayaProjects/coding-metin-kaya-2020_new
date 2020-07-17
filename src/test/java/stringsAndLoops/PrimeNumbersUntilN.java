package stringsAndLoops;

/*
       Task 1:
       Create a method that will accept a number and print
       all the prime number from 2 to that given number

        */
public class PrimeNumbersUntilN {
    public static void main(String[] args) {

        allPrimeNumbers(100);
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void allPrimeNumbers(int number) {
        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
