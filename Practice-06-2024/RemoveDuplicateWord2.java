import java.util.*;
class HelloWorld {
    public static void main(String[] args) {

        String input = "This is a test test string with duplicate words words";
        String result = removeDuplicateWords(input);

        System.out.println("Original string: " + input);
        System.out.println("String with duplicates removed: " + result);
  
    }
    
    public static String  removeDuplicateWords(String str){
        String  word[]=str.split(" ");
        Set<String> set=new LinkedHashSet<String>();
        StringBuilder sb=new StringBuilder();
        
        for(String s: word){
            
            if(!set.contains(s)){
                set.add(s);
                sb.append(s+" ");
            }
            
        }
        
        return sb.toString();
    }
}

// Original string: This is a test test string with duplicate words words
// String with duplicates removed: This is a test string with duplicate words 
