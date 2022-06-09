import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//write a program to implement   throw and throws keyword
class InvalidAgeException extends RuntimeException{

    public InvalidAgeException(String msg) {
        super(msg);
    }
}
public class ThrowAndThrowsExample {
    public static void main(String[] args)throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter your age");
        int age = Integer.parseInt(br.readLine());
        if(age>=18)
        {
            System.out.println("You are eligible for vote");
        }
        else {
            throw new InvalidAgeException("Yor are not eligible for vote");
        }


    }
}
