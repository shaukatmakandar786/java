public final class ImmutablePerson {
    private final String name;
    private final int age;
    private final Address address; // Assuming Address is a mutable class

    // Parameterized constructor to initialize all fields
    public ImmutablePerson(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = new Address(address); // Create a defensive copy
    }

    // Getters for all fields, no setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return new Address(address); // Return a copy, not the original
    }
}

// Example of a mutable class
class Address {
    private String city;
    private String state;

    // Constructor
    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    // Copy constructor
    public Address(Address address) {
        this.city = address.city;
        this.state = address.state;
    }

    // Getters and setters
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}


/*  

#Steps to Create an Immutable Class:
-------------------------------------
  1. Declare the Class as final: This prevents other classes from extending it.
  2. Make Fields private and final: Ensure that fields cannot be changed after initialization.
  3. Provide a Parameterized Constructor: Initialize all fields in the constructor.
  4. No Setter Methods: Do not provide any methods that modify fields.
  5. Return Copies for Mutable Fields: If the class contains fields that refer to mutable objects, return a copy of these objects, not the original.

*/
