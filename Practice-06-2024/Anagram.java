import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
     
        isAnagram("keep","Peek");
        isAnagram("Mother In Law", "Hitler Woman");
        isAnagram("abc","pqr");

    }
    public static void isAnagram(String str1, String str2){
        
        int len1=str1.length();
        int len2=str2.length();
        boolean flag=false;
        
        if(len1!=len2){
            flag=true;
        }
        
        char c1[]=str1.toLowerCase().toCharArray();
        char c2[]=str2.toLowerCase().toCharArray();
        
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        flag=Arrays.equals(c1, c2);
           
        if(flag){
            System.out.println("Given Strings are Anagram ");
           
        }
        else{
             System.out.println("Given Strings are not Anagram ");
        }
    }
    
}


// Given Strings are Anagram 
// Given Strings are not Anagram 
// Given Strings are not Anagram 
