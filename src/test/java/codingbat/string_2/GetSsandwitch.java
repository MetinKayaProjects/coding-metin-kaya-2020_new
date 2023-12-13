package codingbat.string_2;

/*
A sandwich is two pieces of bread with something in between.
Return the string that is between the first and
last appearance of "bread" in the given string, or
return the empty string "" if there are not two pieces of bread.


getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
 */
public class GetSsandwitch {
    public static void main(String[] args) {

        System.out.println(getSandwich("breadjambread"));
        System.out.println(getSandwich("xxbreadjambreadyy"));
        System.out.println(getSandwich("xxbreadyy"));
    }

    public static String getSandwich(String str) {
        int indexOfFirstBread = str.indexOf("bread");
        int indexOfSecondtBread = str.lastIndexOf("bread");
        if (indexOfFirstBread !=-1 && indexOfSecondtBread !=-1 && indexOfFirstBread != indexOfSecondtBread){
            return str.substring(indexOfFirstBread + 5, indexOfSecondtBread);
        }else{
            return "";
        }
    }
}
