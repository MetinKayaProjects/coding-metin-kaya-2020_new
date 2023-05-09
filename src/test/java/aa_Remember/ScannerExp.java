package aa_Remember;

import java.util.Scanner;

public class ScannerExp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a new number: ");
        int number = scan.nextInt();
        System.out.println("number = " + number);

        System.out.println("Enter a name: ");
        String str = scan.next();
//        String str2 = scan.nextLine();
        System.out.println("str = " + str);

    }
}
