package com.howtodoinjava.demo.jsonsimple;

import java.util.*;

class Employee
{
    int eid;
    String name;

    Employee(int a,String b)
    {
        eid=a;
        name=b;
    }

    public String toString()
    {
        return("Emp Id="+eid+"  "+"Emp Name="+name);
    }
}
class MyComparator implements Comparator<Employee>
{

    public int compare(Employee o1, Employee o2) {

       if(o1.name.compareTo(o2.name)==-1)
       {
           return 1;
       }
       else {
           return -1;
       }



    }
}

class CollectionExample8
{
    public static void main(String args[])
    {
        ArrayList t=new ArrayList();
        t.add(new Employee(104,"AAAA"));
        t.add(new Employee(103,"BBBB"));
        t.add(new Employee(101,"DDDD"));
        t.add(new Employee(102,"CCCC"));
        System.out.println("display before sorting");
        System.out.println(t);
        Collections.sort(t,new MyComparator());
        System.out.println("display after sorting");
        System.out.println(t);



    }
}
