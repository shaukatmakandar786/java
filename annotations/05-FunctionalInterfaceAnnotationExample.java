//Java Functional Interfaces:
// An Interface that contains exactly one abstract method is known as functional interface. It can have any number of default, 
// static methods but can contain only one abstract method. It can also declare methods of object class.

// Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces. It is a new feature in Java8, 
// which helps to achieve functional programming approach.  

package com.company;

@FunctionalInterface
interface Account
{
    void getAccount();
    //void getBankDetail();

}
public class FunctionalInterfaceAnnotationExample {
    public static void main(String[] args) {

    }
}
