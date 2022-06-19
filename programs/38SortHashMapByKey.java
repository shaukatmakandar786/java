package com.howtodoinjava.demo.jsonsimple;

import java.util.HashMap;
import java.util.TreeMap;

public class Demo {

    public static void main(String[] args) {

        HashMap<Integer,String> hm=new HashMap<Integer, String>();
        hm.put(101,"shaukat");
        hm.put(103,"wasim");
        hm.put(105,"azim");
        hm.put(200,"zakir");
        hm.put(3,"nisar");
        hm.put(104,"wajid");
        hm.put(102,"asif");

        System.out.println("Display before sorting");
        System.out.println(hm);

        TreeMap<Integer,String> hm1=new TreeMap<Integer, String>(hm);
        System.out.println("Display aftre sorting");
        System.out.println(hm1);

    }

}
