package codingbat;

public class swapAandB {
    public static void main(String[] args) {

        int a = 3;
        int b = 7;

//        a = a + b;  // a = a + (a - b);
//        b = a - b;
//        a = a - b;
//        System.out.println("a: " + a + "\nb: " + b);


        int b1 = b;
        int a1 = a;

        a = b1;
        b = a1;
        System.out.println("a: " + a + "\nb: " + b);

//        int temp;
//        temp = a;
//        a = b;
//        b = temp;
//        System.out.println("a: " + a + "\nb: " + b);

        int k = 8;
        int m = 9;

        k += m - (m = k);
        System.out.println("k: " + k + "\nm: " + m);

    }
}
