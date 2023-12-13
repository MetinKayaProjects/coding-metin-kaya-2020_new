package aa_Remember;

import java.util.Arrays;

public class ArrayDeclerations {
    public static void main(String[] args) {
        //ARRAY Decleration
        //

        int[] list1 = new int[4];
        list1[0] = 11;
        list1[1] = 2;
        list1[2] = 49;
        list1[3] = 5;

        int[] list2 = {76, 3, 45, 4};
        int[] list3 = new int[]{25, 4, 1, 99, 8};

       int n= list1.length;

        System.out.println("list1 = " + Arrays.toString(list1));
        System.out.println("list2 = " + Arrays.toString(list2));
        System.out.println("list3 = " + Arrays.toString(list3));
    }
}
