package com.company.customeannotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
public class Test1 {

   
    public static void main(String[] args) {

        Student2 s=new Student2("S-111","shaukat","pune");
        s.getStudentDetails();
        Class c=s.getClass();
        Method m=c.getMethod("getStudentDetails")
        Annotation ann=m.getAnnotation(Cource1.class);
        Cource2 crs=(Cource2) ann;
        System.out.println("Student Cource Details");
        System.out.println("_______________________");
        System.out.println("Cource id     :"+crs.cid());
        System.out.println("Cource Name   :"+crs.cname());
        System.out.println("Cource Cost   :"+crs.ccost());
    }
}
