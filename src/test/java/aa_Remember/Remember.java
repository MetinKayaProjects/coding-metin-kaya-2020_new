package aa_Remember;

import java.util.*;

public class Remember {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a ne value: ");
        int number = scan.nextInt();
        System.out.println("Enter a name: ");
        String str = scan.next();
//        String str2 = scan.nextLine();


        Random random = new Random();
        int guess2 = random.nextInt();
        int guess = random.nextInt(101);

        String strNum = "12";
        int num = Integer.parseInt(strNum);
        Double numD = Double.parseDouble(strNum);

        int number1 = 12;
        String strStr = String.valueOf(number1);

        String s = "java";
        char[] ch = s.toCharArray();
        System.out.println("char = " + Arrays.toString(ch));

//ARRAY Decleration

        int[] list1 = new int[4];
        list1[0] = 11;
        list1[1] = 2;
        list1[2] = 49;
        list1[3] = 5;

        int[] list2 = {76, 3, 45, 4};
        int[] list3 = new int[]{25, 4, 1, 99, 8};

        //Arrays.sort(arr)

        Arrays.sort(list1);
        System.out.println("Arrays.toString(list1) = " + Arrays.toString(list1));

        Arrays.sort(list2);
        System.out.println("Arrays.toString(list2) = " + Arrays.toString(list2));

        Arrays.sort(list3);
        System.out.println("Arrays.toString(list3) = " + Arrays.toString(list3));

//List Decleration
        ArrayList<Integer> myList = new ArrayList<Integer>();

        ArrayList<String> myList2 = new ArrayList<String>(Arrays.asList("a", "B", "Ali", "Ceyhan"));

//  Collections.sort(myList2)
        Collections.sort(myList2);


    }
}
