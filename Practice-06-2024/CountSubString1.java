import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
     
         String str = "ababcabcababc";
         String subStr = "abc";
         int count = countOccurrences(str, subStr);
         System.out.println("The substring \"" + subStr + "\" appears " + count + " times in the string \"" + str + "\".");
    }
    
    public static int countOccurrences(String str, String subStr){
        
        int count=0;
        int index=0;
        
        while((index=str.indexOf(subStr, index))!=-1){
            count++;
            index+=subStr.length();
        }
        
        return count;
    }
    
}

// The substring "abc" appears 3 times in the string "ababcabcababc".
