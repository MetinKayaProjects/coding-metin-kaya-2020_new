package interviewQuestions.Finra;

/* validate an SSN (you can also validate phonenumber, email, password)
 */
public class ValidateSSN_Regex {
    public static void main(String[] args) {

        String SSN = "111-11-1111";
        String pattern = "[0-9]{3}[-][0-9]{2}[-][0-9]{4}";
        System.out.println("Is this valid SSN? " + validate(pattern, SSN)); //true
        System.out.println("Is this valid SSN: " + validate(pattern, "111-@1-1111")); //false since it has @

        String patternEmail = "([a-zA-Z]\\w{0,100})" + "(@gmail.com|@hotmail.com)";
        System.out.println("patternEmail = " + validate(patternEmail, "metinkayav123a@gmail.com"));
    }

    public static boolean validate(String pattern, String s) {
//        if (s.matches(pattern)){
//            return true;
//        }
//        return false;
        return (s.matches(pattern)) ? true : false;
    }

}
