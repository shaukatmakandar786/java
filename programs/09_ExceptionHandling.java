//Explain with example on Exception Handling?


public class ExceptionHandling {

    public static void main(String[] args) {
        int a=10;
        int b=0;

        try{
            int c=a/b;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}

// java.lang.ArithmeticException: / by zero
