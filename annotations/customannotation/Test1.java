package com.company.customeannotation;

import java.lang.annotation.Annotation;
public class Test1 {

   
    public static void main(String[] args) {

        Student1 s=new Student1("S-111","shaukat","pune");
        s.getStudentDetails();
        Class c=s.getClass();
        Annotation ann=c.getAnnotation(Cource1.class);
        Cource1 crs=(Cource1) ann;
        System.out.println("Student Cource Details");
        System.out.println("_______________________");
        System.out.println("Cource id     :"+crs.cid());
        System.out.println("Cource Name   :"+crs.cname());
        System.out.println("Cource Cost   :"+crs.ccost());
    }
}
