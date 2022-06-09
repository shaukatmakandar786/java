//write a program to implement custom exception with calling function

import java.util.Scanner;

class InvalidAge extends RuntimeException
{
    public InvalidAge(String message) {
        super(message);
    }
}
public class CustomeExceptionWithCallingFunction {

    public static void checkAge(int age)
    {
        if(age<18)

            throw new InvalidAge("You are not eligible for vote");

        else
            System.out.println("You are eligible for vote");

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age");
        int age=sc.nextInt();
        checkAge(age);
    }
}
