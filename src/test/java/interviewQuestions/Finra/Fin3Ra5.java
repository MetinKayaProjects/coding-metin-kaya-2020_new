package interviewQuestions.Finra;

/*
There is a number of arrays, if number is divided with 3 and 5 then print FINRA,
if divided by 3 then FIN and divided by 5 then RA else print the number as is
 */
public class Fin3Ra5 {
    public static void main(String[] args) {
        finra(30);
    }

    public static void finra(int num) {

        for (int i = 1; i <= num; i++) {
            String print = "";
            if (i % 3 == 0)    print = "FIN";
            if (i % 5 == 0)    print += "RA";

            if (print.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(print);
            }
        }
    }

}
