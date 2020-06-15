package stringsAndLoops;

public class PasswordValid2_REGEX {
    public static void main(String[] args) {
     /*
        1. Password MUST be at least 8 characters
        2. Password should at least contain one lowercase  case letter
        3. Password should at least contain one upper letter
        4. Password should at least contain a digit
        5. Password should at least contain one special characters (!@.,#$?)
        if all requirements above are met, the password is valid, if not all are met it is invalid
         */

        String password = "a?Gj6dsaja";

        boolean length = password.length() >= 8;
        boolean lower = false;
        boolean upper = false;
        boolean number = false;
        boolean special = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (c >= 97 && c <= 122) lower = true;
            if (c >= 65 && c <= 90) upper = true;
            if (c >= 48 && c <= 57) number = true;
            if ((c >= 33 && c <= 47) || (c >= 58 && c <= 64)
                    || (c >= 91 && c <= 96) || (c >= 123 && c <= 126)) special = true;

        }

        if (!length) {
            System.out.println("Invalid length");
        } else if (!lower) {
            System.out.println("Missing lowercase letter");
        } else if (!upper) {
            System.out.println("Missing uppercase letter");
        } else if (!number) {
            System.out.println("Missing number");
        } else if (!special) {
            System.out.println("Missing special character");
        } else {
            System.out.println("Valid password");
        }
    }
}
