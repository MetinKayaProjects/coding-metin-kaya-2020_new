package aa_Remember;

import java.util.Arrays;

public class ArraysSortMethod {
    public static void main(String[] args) {
        //  Arrays.sort(arr)
        int[] list1 = new int[4];
        list1[0] = 11;
        list1[1] = 2;
        list1[2] = 49;
        list1[3] = 5;

        int[] list2 = {76, 3, 45, 4};
        int[] list3 = new int[]{25, 4, 1, 99, 8};

        Arrays.sort(list1);
        System.out.println("Arrays.toString(list1) = " + Arrays.toString(list1));

        Arrays.sort(list2);
        System.out.println("Arrays.toString(list2) = " + Arrays.toString(list2));

        Arrays.sort(list3);
        System.out.println("Arrays.toString(list3) = " + Arrays.toString(list3));
    }
}
