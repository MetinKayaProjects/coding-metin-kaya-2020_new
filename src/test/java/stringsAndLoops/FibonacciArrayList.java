package stringsAndLoops;

import java.util.ArrayList;
import java.util.List;

public class FibonacciArrayList {

    public static void main(String[] args) {
        fibonacciArrayList(8);
    }
    static void fibonacciArrayList(int limit){
        List<Integer> fibNums = new ArrayList<>();
        fibNums.add(0,0);
        fibNums.add(1,1);

        for (int i = 2; i < limit; i++){
            fibNums.add(i, fibNums.get(i-2)+fibNums.get(i-1));

        }
        System.out.println("fibNums = " + fibNums);
    }
}
