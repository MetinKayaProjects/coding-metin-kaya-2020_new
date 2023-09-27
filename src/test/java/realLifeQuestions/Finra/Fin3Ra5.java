package realLifeQuestions.Finra;



/*
There is a number of arrays, if number is divided with 3 and 5 then print FINRA,
if divided by 3 then FIN and divided by 5 then RA else print the number as is
 */
public class Fin3Ra5 {
    public static void main(String[] args) {

        finra(30);
        System.out.println("-----***************-----------");
        finra2(30);

    }

    public static void finra(int num) {

        for (int i = 1; i <= num; i++) {
            String print = "";
            if (i % 3 == 0)    print = "FIN";
//            if (i % 5 == 0)    print += "RA";
            if (i % 5 == 0)    print = "RA";

            if (i % 3 ==0 && i % 5==0) print= "FINRA";

            if (print.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(print);
            }
        }
    }

    private static void finra2(int num) {
        String str="";
        for (int i = 1; i <= num; i++){
            str = (i % 3 == 0 && i % 5 == 0) ? "FINRA"
                    : (i % 3 == 0) ? "FIN"
                    : (i % 5 == 0) ? "RA"
                    : String.valueOf(i) ;
            System.out.println(str);
        }

    }

}
