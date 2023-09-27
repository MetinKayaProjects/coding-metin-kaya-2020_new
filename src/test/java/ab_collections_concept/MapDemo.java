package ab_collections_concept;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(10, "Alex");
        hashMap.put(40, "Ben");
        hashMap.put(20, "Veli");
        hashMap.put(30, "Dursun");
        hashMap.put(null, null);

        System.out.println("hashMap = " + hashMap);////print out randomly

        for (Integer eachKey: hashMap.keySet()) {
            System.out.println( eachKey);
        };

        for (String eachValue : hashMap.values()){
            System.out.println(eachValue);
        };
        System.out.println("------------------");
        for (Map.Entry<Integer, String> integerStringEntry : hashMap.entrySet()) {
            System.out.println(integerStringEntry);
        }

        System.out.println("------------------");

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Alex");
        linkedHashMap.put(40, "Ben");
        linkedHashMap.put(20, "Veli");
        linkedHashMap.put(30, "Dursun");
        linkedHashMap.put(null, null);

        System.out.println("linkedHashMap = " + linkedHashMap);  //print out depending on insertion order


        Map<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(10, "Alex");
        hashtable.put(40, "Ben");
        hashtable.put(25, "Lisa");
        hashtable.put(30, "Dursun");
        hashtable.put(20, "Veli");
        hashtable.put(3, "Veli");

//        hashtable.put(null, null); //Hashtable doesn't allow null key

        System.out.println("hashtable = " + hashtable);
        
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Alex");
        treeMap.put(40, "Ben");
        treeMap.put(20, "Veli");
        treeMap.put(30, "Dursun");
        treeMap.put(5, "Hasan");
//        treeMap.put(null, null);  //TreeMap doesn't allow null key

        System.out.println("treeMap = " + treeMap);  //print out sorted

        System.out.println("treeMap.size() = " + treeMap.size());

        System.out.println("-------XXXXXX-----------");

        for (Map.Entry<Integer, String> entrySetTreeMap : treeMap.entrySet()) {
//            System.out.println(entrySetTreeMap);
//            System.out.println(entrySetTreeMap.getKey());
//            System.out.println(entrySetTreeMap.getValue());
            System.out.println( entrySetTreeMap.getKey() + " --> " + entrySetTreeMap.getValue());

        }

    }


}
