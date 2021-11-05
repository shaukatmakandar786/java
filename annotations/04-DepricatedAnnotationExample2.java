package com.company;
class Employee
{
    @Deprecated
    public void gen_Salary()
    {
        System.out.println("salary is calculated by Basic,HR,TA");
    }
    public void gen_New_Salary()
    {
        System.out.println("salary is calculated by Basic,HR,TA,PF");
    }
}

public class DepricatedAnnotationExample2 {

    public static void main(String[] args) {
        Employee e=new Employee();
         e.gen_Salary();
         //e.gen_New_Salary();
    }
}
