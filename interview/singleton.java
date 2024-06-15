public class Singleton {
    
    // Step 1: Private static variable of the same class that is the only instance of the class.
    private static Singleton instance;
    
    // Step 2: Private constructor to restrict instantiation of the class from other classes.
    private Singleton() {
        // Initialization code, if any
    }
    
    // Step 3: Public static method that returns the instance of the class.
    public static Singleton getInstance() {
        if (instance == null) {
            // synchronized block to remove overhead
            synchronized (Singleton.class) {
                if (instance == null) {
                    // if instance is null, initialize
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    
    // Other methods and fields of the class
    public void showMessage() {
        System.out.println("Hello, this is a singleton class!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Get the only object available
        Singleton singleton = Singleton.getInstance();

        // Show the message
        singleton.showMessage();
    }
}


/* Key Points:
---------------
Private Constructor: Prevents the creation of the object from outside the class.
Static Method: Provides a way to get the single instance.
Lazy Initialization: The instance is created only when it is needed.
Thread Safety: Double-checked locking ensures that the instance creation is thread-safe without the performance cost of synchronized methods. */
