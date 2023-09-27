package functional_interface_and_lambda_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpression {

    public static void main(String[] args) {

//        evenOrAddNumberList (87);
        List<Integer> numList = new ArrayList<>();
        numList.add(3);
        numList.add(6);
        numList.add(4);
        numList.add(67);
        numList.add(86);
        numList.add(90);
        numList.add(101);
        List<Integer> oddNumLis = new ArrayList<>();
        List<Integer> evenNumLis = new ArrayList<>();


        oddNumLis = numList.stream().filter(num -> (num % 2 == 0)).collect(Collectors.toList());
        System.out.println("oddNumLis" + oddNumLis);

        evenNumLis = numList.stream().filter(num -> (num % 2 != 0)).collect(Collectors.toList());
        System.out.println("evenNumLis" + evenNumLis);

    }


    static void evenOrAddNumberList (int num){

        List<Integer> oddNums = new ArrayList<>();
        List<Integer> evenNums = new ArrayList<>();

        for (int i = 0; i<num; i++){
            if (i % 2 == 0){
                oddNums.add(i);
            }else {
                evenNums.add(i);
            }
        }

        System.out.println("oddNums = " + oddNums);
        System.out.println("evenNums = " + evenNums);
    }

    static void evenOrOddList2 (int num){}
}
