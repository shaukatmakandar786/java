package com.company.customeannotation;


public class Student2 {

    String sid;
    String sname;
    String addr;

    public Student1(String sid,String sname,String addr)
    {
        this.sid=sid;
        this.sname=sname;
        this.addr=addr;
    }
    @Cource2(cid="C-333",cname="JAVA",ccost = 30000)
    public void getStudentDetails()
    {
        System.out.println("Student Details");
        System.out.println("________________");
        System.out.println("Student Id    :"+sid);
        System.out.println("Student Name  :"+sname);
        System.out.println("Student Name  :"+addr);

    }
}
