package interviewQuestions.Finra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* Given a list of integers 1,2,3,4,5,6,... first sort the numbers and remove all values greater than 100 */
public class RemoveNums2 {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(123,2,333,43,545,73,9,101,11));

        System.out.println("nums = " + nums);

        Collections.sort(nums);
        System.out.println("nums (sorted) = " + nums);

        //    2ND WAY: FOR LOOP     /////////////

        for (int i=0; i <nums.size(); i++){
            if (nums.get(i) >= 100){
                nums.remove(nums.get(i));
                i--;
            }
        }
        System.out.println("2. nums after removing = " + nums);

    }

}
