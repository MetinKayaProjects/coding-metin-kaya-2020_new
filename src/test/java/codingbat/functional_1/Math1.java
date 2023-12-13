package codingbat.functional_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.


math1([1, 2, 3]) → [20, 30, 40]
math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
math1([10]) → [110]
 */
public class Math1 {
    public static void main(String[] args) {

        System.out.println(math1(Arrays.asList(1, 2, 3)));
        System.out.println(math1(Arrays.asList(6, 8, 6, 8, 1)));
        System.out.println(math1(new ArrayList<>(Arrays.asList(10))));

    }

    public static List<Integer> math1(List<Integer> nums){
        for (int i = 0; i < nums.size(); i++) {
            nums.set(i,(nums.get(i)+ 1) * 10);
        }

        return nums;

//        List<Integer> strings2 = new ArrayList<>();
//        for (int i = 0; i < strings.size(); i++) {
//            strings2.add(strings.get(i) + strings.get(i)+ strings.get(i) + strings.get(i));
//        }

//        return strings2;

//        nums.replaceAll((x) -> (x +1) *10);
//
//        return nums;
    }
}
