package interviewQuestions.Apple;

/*
Write a code to validate the password using the following rules:
    - Must contain at least one digit
    - Must contain at least one of the following characters (@, #, $)
    - The length should be between 6 to 20 characters
    - return true else return false.
    - Alternatively: do return 1 else return -1
 */
public class Apple_PasswordValidation {
    public static void main(String[] args) {
        System.out.println(isValidPassword("Aa?G6jdsaja"));  //false
        System.out.println(isValidPassword("AabcD12@"));     //true
        System.out.println(isValidPassword("Aa2@"));    // false since length < 6
        System.out.println(isValidPassword("AabcD12@Aa?G6jdsaja"));  //true
        System.out.println(isValidPassword("AabcD12@Aa?G6jdsajaabcD12@Aa?G6jdsa")); //false since length > 20


    }

    public static boolean isValidPassword(String password) {
        boolean digit = password.matches(".*[0-9].*");
        boolean chars = password.matches(".*[@, #, $].*");
        boolean length = password.length() >= 6 && password.length() <= 20;

        boolean lowerCase = password.matches(".*[a-z].*");
        boolean upperCase = password.matches(".*[A-Z].*");

        boolean validPassword = (digit && chars && length && lowerCase && upperCase) ? true : false;
        return validPassword;
    }

}
