package stringsAndLoops;

public class PrimeNumber1 {
    public static void main(String[] args) {
        System.out.println(isPrime(11));  //true
        System.out.println(isPrime(15));  //false
    }
    public static boolean isPrime(int num){
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
