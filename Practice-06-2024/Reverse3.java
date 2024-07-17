import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
     
        String str="Hello, Wolrd!";
        
        String result=reverseString(str);
        
        System.out.println("Original String : "+str);
        System.out.println("Reversed String : "+result);
        
    }
    
    public static String reverseString(String s){
        
        if(s.isEmpty()){
            return s;
        }
        
        return reverseString(s.substring(1)) + s.charAt(0);
    }
}

// Original String : Hello, Wolrd!
// Reversed String : !drloW ,olleH
