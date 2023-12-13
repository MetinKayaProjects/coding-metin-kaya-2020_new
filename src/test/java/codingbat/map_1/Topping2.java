package codingbat.map_1;

import java.util.HashMap;
import java.util.Map;

/*
Given a map of food keys and their topping values,
modify and return the map as follows: if the key "ice cream" has a value,
set that as the value for the key "yogurt" also.
If the key "spinach" has a value, change that value to "nuts".


topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
 */
public class Topping2 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>(Map.of("ice cream", "cherry"));
        Map<String, String> map2 = new HashMap<>(Map.of("spinach", "dirt", "ice cream", "cherry"));
        Map<String, String> map3 = new HashMap<>(Map.of("yogurt", "salt"));

        System.out.println(topping2(map1));
        System.out.println(topping2(map2));
        System.out.println(topping2(map3));
    }

    private static Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")){
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach")){
            map.replace("spinach",map.get("spinach"), "nuts");
        }
        return map;
    }
}
