package aa_Remember;

import java.util.Arrays;

public class ConvertPrimitives {
    public static void main(String[] args) {

// CONVERT STRING to INT or DOUBLE
        String strNum = "12";
        int num = Integer.parseInt(strNum);
        System.out.println("num = " + num);
        int num2= Integer.valueOf(strNum);
        System.out.println("num2 = " + num2);
        Double numD = Double.parseDouble(strNum);
        System.out.println("numD = " + numD);

//INT TO STRING
        int number1 = 12;
        String strStr = String.valueOf(number1);
        System.out.println("strStr = " + strStr);  //strStr = 12   bu deger String
        // int n =Integer.parseInt(strStr);

//STRING to CHAR ARRAY
        String s = "java";
        char[] ch = s.toCharArray();
        System.out.println("ch = " + Arrays.toString(ch));  //ch = [j, a, v, a]

//FLOAT to STRING
        float f=35f;
        String sF=Float.toString(f);

//STRING to FLOAT
        float f2=Float.parseFloat(sF);
        float f3 = Float.valueOf(sF);

    }
}
