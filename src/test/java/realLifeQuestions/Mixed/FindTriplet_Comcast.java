package realLifeQuestions.Mixed;
/*
Given an array and a value, find if there is a triplet
in array whose sum is equal to the given value.
If there is such a triplet present in array,
save them in an array and return the arrays.

    array = {12,3,4,1,6,9,8},
    find the three nums that their sum =24  -- >this is the target
   return new array [12,3,9][12,8,4]  -- > {{12,3,},{12,8,4}}
     */

public class FindTriplet_Comcast {

    //DUZENLE.... RETURN ARRAY

    // returns true if there is triplet with sum equal
    // to 'sum' present in A[]. Also, prints the triplet
    boolean find3Numbers(int A[], int arr_size, int sum)
    {
        int l, r;

        // Fix the first element as A[i]
        for (int i = 0; i < arr_size - 2; i++) {

            // Fix the second element as A[j]
            for (int j = i + 1; j < arr_size - 1; j++) {

                // Now look for the third number
                for (int k = j + 1; k < arr_size; k++) {
                    if (A[i] + A[j] + A[k] == sum) {
                        System.out.print("Triplet is " + A[i] + ", " + A[j] + ", " + A[k]);
                        return true;
                    }
                }
            }
        }

        // If we reach here, then no triplet was found
        return false;
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        FindTriplet triplet = new FindTriplet();
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        int arr_size = A.length;

        triplet.find3Numbers(A, arr_size, sum);
    }
}