package com.howtodoinjava.demo.jsonsimple;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        HashMap<Integer,String> hm=new HashMap<Integer, String>();
        hm.put(101,"shaukat");
        hm.put(103,"wasim");
        hm.put(105,"azim");
        hm.put(200,"zakir");
        hm.put(3,"aaa");
        hm.put(104,"zzz");
        hm.put(102,"asif");

        System.out.println("Display before sorting");
        System.out.println(hm);

        Set<Map.Entry<Integer, String>> entries = hm.entrySet();

        System.out.println(sortByValue(hm));

    }
    private static HashMap sortByValue(HashMap map)
    {
        LinkedList linkedList = new LinkedList(map.entrySet());

        Collections.sort(linkedList, new Comparator() {
            public int compare(Object o1, Object o2) {

                return ((Comparable)((Map.Entry)(o2)).getValue()).compareTo(((Map.Entry)(o1)).getValue());
            }
        });

        HashMap sortedHashMap=new LinkedHashMap();
        for(Object e:linkedList)
        {
            Integer key = (Integer)((Map.Entry) (e)).getKey();

            String value =(String) ((Map.Entry) (e)).getValue();
            sortedHashMap.put(key,value);
        }
        return sortedHashMap;
    }

}
