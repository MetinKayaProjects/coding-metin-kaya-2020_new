package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class SortEachPart2_Queue {

    public static void main(String[] args) {
        String s = sortEach("DC501GCCCA098911");  // --- > CD051ACCGC011998
        System.out.println(s);

        // DC 501 GCCCA 0989111   -- > CD 051 ACCGC 011998
    }


    public static String sortEach(String str) {

        String word = "";
        Queue<String> q = new PriorityQueue<String>();

        for(int i=0; i < str.length(); i++) {

            boolean reset = false;
            q.add("" + str.charAt(i));

            if(Character.isLetter(str.charAt(i))) {
                if(i == str.length() -1 ||!Character.isLetter(str.charAt(i+1))) {
                    reset = true;
                }
            } else {
                if(i == str.length() -1 || !Character.isDigit(str.charAt(i+1))) {
                    reset = true;
                }
            }

            if(reset) {
                word += q.toString().replace("[","").replace("]","").replace(", ","");
                q.clear();
            }


        }

        return word;
    }

}
