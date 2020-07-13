package stringsAndLoops;

/*
1. Password MUST be at least 8 characters
2. Password should at least contain one lowercase  case letter
3. Password should at least contain one upper letter
4. Password should at least contain a digit
5. Password should at least contain one special characters (!@.,#$?)
if all requirements above are met, the password is valid, if not all are met it is invalid
 */
public class PasswordValid1_withoutREGEX {
    public static void main(String[] args) {
        String password = "Aa?G6jdsaja";

        boolean length = password.length() >= 8;                    //1. Password MUST be at least 8 characters
        boolean lower =  password.matches(".*[a-z].*");      //2. Password should at least contain one lowercase  case letter
        boolean upper = password.matches(".*[A-Z].*");       //3. Password should at least contain one upper letter
        boolean number = password.matches(".*[0-9].*");      //4. Password should at least contain a digit
        boolean special = password.matches(".*[!@.,#$?].*"); //5. Password should at least contain one special characters

        boolean valid = length && lower && upper && number && special;

        if (valid) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Not a valid password");
        }



    }


}
