package codingbat.array_1;

/*
We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.


unlucky1([1, 3, 4, 5]) → true
unlucky1([2, 1, 3, 4, 5]) → true
unlucky1([1, 1, 1]) → false
 */
public class Unlucky {
    public static void main(String[] args) {
        System.out.println(((unlucky1(new int[]{1, 3, 4, 5})))); //true
        System.out.println(((unlucky1(new int[]{2, 1, 3, 4, 5}))));//true
        System.out.println(((unlucky1(new int[]{1, 1, 1}))));//false
//        System.out.println(((unlucky1(new int[]{1, 4}))));//false
        System.out.println(((unlucky1(new int[]{1, 1, 1, 3, 1}))));//false
//        System.out.println(((unlucky1(new int[]{1, 1, 3}))));//true
//        System.out.println(((unlucky1(new int[]{1, 3, 3}))));//true
//        System.out.println(((unlucky1(new int[]{1, 3, 3}))));//true
//        System.out.println(((unlucky1(new int[]{1, 3, 3, 6}))));//true
//        System.out.println(((unlucky1(new int[]{1, 3}))));//true
//        System.out.println(((unlucky1(new int[]{1}))));//false
//        System.out.println(((unlucky1(new int[]{}))));//false
//        System.out.println(((unlucky1(new int[]{1, 1, 1, 1, 3}))));//true
    }

    private static boolean unlucky1(int[] nums) {

        if (nums.length <= 1) {
            return false;
        }
        else if (nums.length == 2 && nums[0] == 1 && nums[1] == 3) {
            return true;
        }
        else if (nums.length == 3 && (nums[0] == 1 && nums[1] == 3 || nums[1] == 1 && nums[2] == 3)){
            return true;
        }

        else if (nums.length > 3 && nums[0] == 1 && nums[1] == 3 || nums[1] == 1 && nums[2] == 3
        || nums[nums.length-2] == 1 && nums[nums.length-1] == 3) {
            return true;
        }
            return false;
//        int len = nums.length;
//        if (len < 2) {
//            return false; // Array does not contain an unlucky 1
//        }
//
//        // Check the first two elements
//        if (nums[0] == 1 && nums[1] == 3 || nums[1] == 1 && nums[2] == 3) {
//            return true;
//        }
//
//        // Check the last two elements
//        if (nums[len - 2] == 1 && nums[len - 1] == 3) {
//            return true;
//        }
//
//        return false;
    }
}
