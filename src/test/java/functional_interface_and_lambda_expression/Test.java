package functional_interface_and_lambda_expression;

import java.util.Arrays;

public class Test  {

    public static void main(String[] args) {

//        MyInterface cube = (num) -> {System.out.println( num * num * num);};
        MyInterface<Integer> cube = num -> System.out.println( num * num * num);
        // if there is only one paramater( argument) no need parantenthesis for num
        // and no need {} for the implementation of there is only one implementation

        cube.functionExmple(10);




        MyInterface<Integer> oddOrEven = num -> {
            if (num % 2 == 0){
                System.out.println(num + " is even number");
            }else {
                System.out.println(num + " is odd number");
            }
        };

        oddOrEven.functionExmple(13);
        oddOrEven.functionExmple(20);

        System.out.println("---------------------------------------");

        MyInterface<String> strSize = str -> System.out.println("str.length() is " + str.length());

        strSize.functionExmple("Java is fun!");

        System.out.println("++++++++++++++++++++++++");

        MyInterface<String> strTest = (str) -> {
            String[] strArr = str.split(" ");
            System.out.println("strArr= " + Arrays.toString(strArr));
            System.out.println("strArr[4] = " + strArr[4]);

        };

        strTest.functionExmple("I like coding with Java");

        System.out.println("*************************");

        MyInterface<String> reversedStr = (str) -> {
            for (int i = str.length()-1; i >= 0; i--){

                System.out.print(str.charAt(i));
            }
            System.out.println();
        };



        reversedStr.functionExmple("This is Java");
    }




}
