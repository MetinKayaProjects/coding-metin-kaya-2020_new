package realLifeQuestions.Finra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* Given a list of integers 1,2,3,4,5,6,... first sort the numbers and remove all values greater than 100 */
public class RemoveNums1_Lambda {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(123,2,333,43,545,73,9,101,11));

        System.out.println("nums = " + nums);

        Collections.sort(nums);
        System.out.println("nums (sorted) = " + nums);

        //    1ST WAY: LAMBDA EXPRESSION ////////////////

        nums.removeIf(each -> each >= 100);

        System.out.println("nums after removing = " + nums);

    }

}
