package practice;

import java.util.HashMap;
import java.util.Map;

public class FruitCounterMAP {
    public static void main(String[] args) {

        String[] fruitBasket = {"Apple", "Orange", "Banana", "Apple", "Grapes", "Apple", "Orange"};
        String countingFruit = "Banana";

        int fruitCount = countFruit(fruitBasket, countingFruit);
//        int fruitCount = countFruit(fruitBasket, "apple");
        System.out.println("The count of " + countingFruit + " in the basket is: " + fruitCount);

    }

    public static int countFruit(String[] fruits, String countingFruit) {

        Map<String, Integer> mapOfFruits = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < fruits.length; i++) {
            if (!mapOfFruits.containsKey(fruits[i])) {
                mapOfFruits.put(fruits[i], 1);
            } else {
                mapOfFruits.put(fruits[i], mapOfFruits.get(fruits[i]) + 1);
            }
        }
        if (mapOfFruits.containsKey(countingFruit)) {
            counter = mapOfFruits.get(countingFruit);
        }
        return counter;
    }
}
