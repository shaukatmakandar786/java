//Java program to find area of a rectangle,circle using Interface keyword?

interface Shape1{

     double pi=3.14;
     void area();
}
class Circle implements Shape1{

    int radius;
    public Circle(int r) {
        radius=r;
    }

    @Override
    public void area(){
        System.out.println("area of circle is "+pi*radius*radius);
    }
}
public class InterfaceExample {

    public static void main(String[] args) {

        Shape1 c=new Circle(2);
        c.area();
    }
}
// area of circle is 12.56
