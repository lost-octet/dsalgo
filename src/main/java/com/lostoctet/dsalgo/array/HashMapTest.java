package com.lostoctet.dsalgo.array;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        Map<Boolean, String> bool = new HashMap<>();
        //Assigning a map using <key, value> pair
        hm.put(12, 120);
        hm.put(4, 40);
        hm.put(6, 60);
        hm.put(21, 210);
        hm.put(7, 70);

        bool.put(true, "Yes");
        bool.put(false, "No");
        //Get the value at a key
        System.out.println("Value of a Key in Map1: " + hm.get(12));
        //Navigating through all the elements of a Map
        for(Map.Entry<Integer, Integer> me: hm.entrySet())
            //Getting Key and Value corresponding to each entry
            System.out.println(me.getKey() + ":" + me.getValue());
        //Check the availability of a Key and a Value in the map
        System.out.println("Does it contain the key 21? " + bool.get(hm.containsKey(21)) + " \nDoes it contain the Values 2190? " + bool.get(hm.containsValue(2190)));

        //Printing the hashcode
        System.out.println("HashMap is: " + hm);
        System.out.println("hashcode of Map is: " + hm.hashCode());
        //Printing Only Values of the Map
        System.out.println("Collection of Values are: " + hm.values());

    }
}
