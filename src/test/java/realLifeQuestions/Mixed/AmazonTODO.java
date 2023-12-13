package realLifeQuestions.Mixed;

import java.util.Arrays;
/*
[1, 0, 0, 0, 0, 1, 0, 0]  index -1 ve lastindex+1'de 0 var.
bir indexin sol ve sagindaki index ayniysa yeni iteration'da 0, fakliysa 1 return edecek.
cellCompete(int[] states, int days)
EXp:
input:  0[1, 0, 0, 0, 0, 1, 0, 0]0
output:  [0, 1, 0, 0, 1, 0, 1, 0]

input :   [1, 1, 1, 0, 1, 1, 1, 1]    //bende ikinci iterasyon hata veriyor
output    [0, 0, 0, 0, 0, 1, 1, 0]
 */
public class AmazonTODO {
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public static int[] cellCompete(int[] states, int days) {
        int[] states2 = new int[states.length];
        // WRITE YOUR CODE HERE
        System.out.println("statesI = " + Arrays.toString(states));
//        int first = 0;
//        int last = 0;
//
        for (int s = 0; s < days; s++) {
            System.out.println("statesX = " + Arrays.toString(states));
            for (int i = 1; i < states.length - 1; i++) {
                if (states[1] == 0) {
                    states2[0] = 0;
                } else {
                    states2[0] = 1;
                }
                if (states[states.length - 2] == 0) {
                    states2[states.length - 1] = 0;
                } else {
                    states2[states.length - 1] = 1;
                }
                if (states[i - 1] == states[i + 1]) {
                    states2[i] = 0;
                } else {
                    states2[i] = 1;
                }
            }
            states = states2;
        }
        //    System.out.println("states = " + Arrays.toString(states));
            System.out.println("states2: " + Arrays.toString(states2));
        return states2;
    }
    // METHOD SIGNATURE ENDS

    public static void main(String[] args) {
//        int[] states = {1, 0, 0, 0, 0, 1, 0, 0};
//        int days = 1;
//        System.out.println("states1It: " + Arrays.toString(cellCompete(states, days)));

        int[] statesTest = {1, 1, 1, 0, 1, 1, 1, 1};
        int daysTest = 2;
        System.out.println("statesFinal: " + Arrays.toString(cellCompete(statesTest, daysTest)));
    }
}
