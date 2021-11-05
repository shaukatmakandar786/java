//@SuppressWarnings:
//@SuppressWarnings annotation: is used to suppress warnings issued by the compiler.

package com.company;
import java.util.*;
class Bank
{
    @SuppressWarnings("unchecked")
    public ArrayList<String> getCustomerDetails()
    {
        ArrayList a1=new ArrayList();
        a1.add("aaa");
        a1.add("bbb");
        a1.add("ccc");
        a1.add("ddd");

        return a1;
    }
}

public class SuppressAnnotationExample {

    public static void main(String[] args) {

        Bank b1=new Bank();
        ArrayList a1=b1.getCustomerDetails() ;
        System.out.println(a1);
    }
}
