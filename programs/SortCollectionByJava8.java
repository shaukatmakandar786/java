package com.shaukat;

import java.util.*;
import java.util.stream.Collectors;


public class Test{
    public static void main(String[] args) {

        ArrayList<String> l1=new ArrayList<String>();

        l1.add("BBBBBB");
        l1.add("CCCC");
        l1.add("AAAAAAAAAAAA");
        l1.add("DDD");
        l1.add("EEEE");
        System.out.println(l1);

        // sorting data using java 8 features with Comparable interface
        //default sorting using Comparable ASC
        System.out.println(l1.stream().sorted().collect(Collectors.toList()));

        //default sorting using Comparable DESC
        System.out.println(l1.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList()));

        //default sorting using Comparable by length of the string
        System.out.println(l1.stream().sorted((i1,i2)->Integer.valueOf(i1.length()).compareTo(Integer.valueOf(i2.length()))).collect(Collectors.toList()));




        // sorting data using java 8 features with Comparator interface

        // sorting using Comparator ASC
        Comparator<String> c=(s1,s2)->{

            int i = s1.compareTo(s2);
            if(i>0)
                return 1;
            else
                return -1;
        };
        System.out.println(l1.stream().sorted(c).collect(Collectors.toList()));

        // sorting using Comparator DESC
        Comparator<String> c1=(s1,s2)->{

            int i = s1.compareTo(s2);
            if(i<0)
                return 1;
            else
                return -1;
        };
        System.out.println(l1.stream().sorted(c1).collect(Collectors.toList()));

        // sorting using Comparator By length of the String from largest to lowest
        Comparator<String> c3=(s1,s2)->{

            int i = s1.length();
            int j = s2.length();

            if(i<j)
                return 1;
            else
                return -1;
        };
        System.out.println(l1.stream().sorted(c3).collect(Collectors.toList()));

        // sorting using Comparator By length of the String from largest to lowest
        Comparator<String> c4=(s1,s2)->{

            int i = s1.length();
            int j = s2.length();

            if(i>j)
                return 1;
            else
                return -1;
        };
        System.out.println(l1.stream().sorted(c4).collect(Collectors.toList()));


        //sorting logic for map
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(102,"BBBBBB");
        hm.put(103,"DDD");
        hm.put(101,"CCCC");

        //sorting by key ASC
        System.out.println(hm.entrySet().stream().sorted(Map.Entry.<Integer,String>comparingByKey()).collect(Collectors.toList()));

        //sorting by value
        System.out.println(hm.entrySet().stream().sorted(Map.Entry.<Integer,String>comparingByValue()).collect(Collectors.toList()));

        //sorting by key DESC
        System.out.println(hm.entrySet().stream().sorted(Map.Entry.<Integer,String>comparingByKey().reversed()).collect(Collectors.toList()));

        //sorting by value DESC
        System.out.println(hm.entrySet().stream().sorted(Map.Entry.<Integer,String>comparingByValue().reversed()).collect(Collectors.toList()));

        //sorting by value length ASC
        System.out.println(hm.entrySet().stream().sorted((s1,s2)->Integer.valueOf(s1.getValue().length()).compareTo(Integer.valueOf(s2.getValue().length()))).collect(Collectors.toList()));

        LinkedHashMap<Integer, String> collect = hm.entrySet().stream().sorted((s1, s2) -> Integer.valueOf(s2.getValue().length()).compareTo(Integer.valueOf(s1.getValue().length()))).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a1, a2) -> a1, LinkedHashMap::new));

        System.out.println(collect);
    }
}




// [BBBBBB, CCCC, AAAAAAAAAAAA, DDD, EEEE]
// [AAAAAAAAAAAA, BBBBBB, CCCC, DDD, EEEE]
// [EEEE, DDD, CCCC, BBBBBB, AAAAAAAAAAAA]
// [DDD, CCCC, EEEE, BBBBBB, AAAAAAAAAAAA]
// [AAAAAAAAAAAA, BBBBBB, CCCC, DDD, EEEE]
// [EEEE, DDD, CCCC, BBBBBB, AAAAAAAAAAAA]
// [AAAAAAAAAAAA, BBBBBB, EEEE, CCCC, DDD]
// [DDD, EEEE, CCCC, BBBBBB, AAAAAAAAAAAA]
// [101=CCCC, 102=BBBBBB, 103=DDD]
// [102=BBBBBB, 101=CCCC, 103=DDD]
// [103=DDD, 102=BBBBBB, 101=CCCC]
// [103=DDD, 101=CCCC, 102=BBBBBB]
// [103=DDD, 101=CCCC, 102=BBBBBB]
// {102=BBBBBB, 101=CCCC, 103=DDD}
