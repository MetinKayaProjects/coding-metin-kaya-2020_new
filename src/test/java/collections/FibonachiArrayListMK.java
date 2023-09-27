package collections;

import java.util.ArrayList;
import java.util.List;

public class FibonachiArrayListMK {

    public static void main(String[] args) {

        //fibonachi = 0, 1, 1, 2, 3, 5, 8, 13
        //fibonachi = 0, 1, 2, 3, 4, 5, 6, 7

        fibonachiGenerator(8);
    }
    public static void fibonachiGenerator(int num){
        List<Integer> fibonachiList = new ArrayList<>();
        fibonachiList.add(0, 0);
        fibonachiList.add(1, 1);
        for (int i = 2; i < num; i++){
            fibonachiList.add(i, (fibonachiList.get(i-2) + fibonachiList.get(i-1)));
        }
        System.out.println("fibonachiList = " + fibonachiList);
    }
}
