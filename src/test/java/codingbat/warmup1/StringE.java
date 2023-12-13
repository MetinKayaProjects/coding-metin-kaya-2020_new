package codingbat.warmup1;
/*
Return true if the given string contains between 1 and 3 'e' chars.


stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */
public class StringE {
    public static void main(String[] args) {
        System.out.println(stringE("Hello"));// → true
        System.out.println(stringE("Heelle"));// → true
        System.out.println(stringE("Heelele"));// → false
        System.out.println(stringE("H"));// → false
    }
    public static boolean stringE(String s){
        int counter=0;
        for (char c : s.toCharArray()) {
//            if (String.valueOf(c).equalsIgnoreCase("e")){
            if (c == 'e'){
                counter++;
            }
        }
        return counter >=1 && counter <= 3;
    }
}
