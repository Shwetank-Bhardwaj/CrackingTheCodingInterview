package com.shwetank;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeMap;

public class TravelingIsFun {

    public static void main(String[] args) {
        Hashtable map = new Hashtable();
        map.put("one","1st");
        map.put("second",new Integer(2));
        map.put("third","3rd");
        map.put("third","III");
        Set set = map.entrySet();
        System.out.println(set);
    }

}
