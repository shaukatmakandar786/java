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
