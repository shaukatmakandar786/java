/*

@Override:
@Override annotation assures that the subclass method is overriding the parent class method. If it is not so, compile time error occurs.

Sometimes, we does the silly mistake such as spelling mistakes etc. So, it is better to mark @Override annotation that provides 
assurity that method is overridden.



*/
package com.company;
class DB_Driver{

    public void getDriver()
    {
        System.out.println("type1 Driver");
    }
}
class New_DB_Driver extends DB_Driver
{
    @Override
    public void getDriver()
    {
        System.out.println("type2 Driver");
    }
}
public class OverrideAnnotationExample {

    public static void main(String[] args) {

        New_DB_Driver driver=new New_DB_Driver();
        driver.getDriver();
    }
}
