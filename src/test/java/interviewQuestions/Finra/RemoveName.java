package interviewQuestions.Finra;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given a list of people’s
names “Ahmed”,”John”,”Eric” ,
write a  java operation to remove all the names named “Ahmed”
 */
public class RemoveName {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "John", "Ali"));

        System.out.println("names = " + names);

        names.removeIf(each -> each.equalsIgnoreCase("Ahmed"));
        System.out.println("1st way: ");
        System.out.println("names After removing = " + names);


        // 2 ND METHOD: ///////////////////////////
        System.out.println("2nd way: ");

        for (int i=0; i < names.size(); i++) {
            if (names.get(i).equalsIgnoreCase("John"))
                names.remove(names.get(i));
        }
        System.out.println("2nd way names after removing  = " + names);


    }
}
