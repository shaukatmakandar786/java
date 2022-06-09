import java.util.Scanner;

//Java program to find area of a rectangle,circle using Abstract keyword?
abstract class Shape
{
     int len;
     int breath;

    public void accept()
    {
        System.out.println("enter length and breath");
        Scanner sc=new Scanner(System.in);
        len=sc.nextInt();
        breath=sc.nextInt();
    }
    abstract void area();
}
class Rectangle extends Shape{

    void area()
    {
        System.out.println("area of rectangle is "+len*breath);
    }
}
public class AbstractKeywordExample
{
    public static void main(String args[])
    {
        Shape r1=new Rectangle();
        r1.accept();
        r1.area();

    }
}

// area of rectangle is 8
