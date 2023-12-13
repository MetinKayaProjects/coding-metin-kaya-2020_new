package practice;

public class FruitCounter {
    public static void main(String[] args) {

        String[] fruitBasket = {"Apple", "Orange", "Banana", "Apple", "Grapes", "Apple", "Orange"};
        String countingFruit = "Apple";

        int fruitCount = countFruit(fruitBasket, countingFruit);
//        int fruitCount = countFruit(fruitBasket, "apple");
        System.out.println("The count of " + countingFruit + " in the basket is: " + fruitCount);

    }

    public static int countFruit(String[] fruits, String countingFruit) {

        int count = 0;
        for (String fruit : fruits) {
            if (fruit.equalsIgnoreCase(countingFruit)) {
                count += 1;
            }
        }
        return count;
    }
}
