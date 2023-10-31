package codingbat.warmup1;

public class TrueFalse {

    public static void main(String[] args) {

        System.out.println("sleepIn(false, false) = " + sleepIn(false, false)); //→ true
        System.out.println("sleepIn(true, false) = " + sleepIn(true, false)); //→ false
        System.out.println("sleepIn(false, true) = " + sleepIn(false, true)); //→ true
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }else if( weekday || vacation){
            return false;
        }else if( weekday || !vacation){
            return true;
        }else if( !weekday || !vacation){
            return false;
        }
        return false;
    }
}
