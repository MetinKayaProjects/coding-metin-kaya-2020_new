package codingbat.map_1;

import java.util.HashMap;
import java.util.Map;

public class MapBully {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>(Map.of("a", "candy", "b", "dirt"));
        Map<String, String> map2 = new HashMap<>(Map.of("a", "candy"));
        Map<String, String> map3 = new HashMap<>(Map.of("a", "candy", "b", "carrot", "c", "meh"));
        Map<String, String> map4 = new HashMap<>(Map.of("b", "carrot"));
        Map<String, String> map5 = new HashMap<>(Map.of("c", "meh"));

//        mapBully({"a": "candy", "b": "dirt"}) //→ {"a": "", "b": "candy"}
//        mapBully({"a", "candy"}) //→ {"a": "", "b": "candy"}
//        mapBully({"a": "candy", "b": "carrot", "c": "meh"}) //→ {"a": "", "b": "candy", "c": "meh"}

        System.out.println(mapBully(map1)); //→ {"a": "", "b": "candy"}
        System.out.println(mapBully(map2)); //→ {"a": "", "b": "candy"}
        System.out.println(mapBully(map3)); //→ {"a": "", "b": "candy", "c": "meh"}
        System.out.println(mapBully(map4)); //→ {"b": "carrot"}
        System.out.println(mapBully(map5)); //→ {"c": "meh"}
    }

    public static Map<String, String> mapBully(Map<String, String> map) {
//        System.out.println(map.keySet());
//        String temp = map.get("a");
//        System.out.println("temp = " + temp);
//        map.put("a", "");
//        map.put("b", temp);
        if (!map.containsKey("a") && map.containsKey("b")) {
            return map;
        }
        if (map.containsKey("a") && !map.containsKey("b")) {
            String temp = map.get("a");
//            System.out.println("temp = " + temp);
            map.put("a", "");
            map.put("b", temp);
            return map;
        }
        if (map.containsKey("a") && map.containsKey("b")) {
            String temp = map.get("a");
//            System.out.println("temp = " + temp);
            map.put("a", "");
            map.put("b", temp);

            return map;
        }


        return map;
    }

}
