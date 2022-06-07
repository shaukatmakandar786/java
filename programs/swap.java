//swaping of two numbers without using third variable

import java.util.Scanner;

public class Swap {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");

        int number1=sc.nextInt();
        int number2=sc.nextInt();

        System.out.println("display numbers before swaping");

        System.out.println("number1:"+number1);
        System.out.println("number2:"+number2);

        System.out.println();
        number1=number1+number2;
        number2=number1-number2;
        number1=number1-number2;

        System.out.println("display numbers after swaping");
        System.out.println("number1:"+number1);
        System.out.println("number2:"+number2);
    }
}

// enter two numbers
// 10 20
// display numbers before swaping
// number1:10
// number2:20

// display numbers after swaping
// number1:20
// number2:10
