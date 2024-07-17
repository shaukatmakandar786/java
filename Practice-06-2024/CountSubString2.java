import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
     
         String str = "ababcabcababc";
         String subStr = "abc";
         
         int m=str.length();
         int n=subStr.length();
         int tempCount, count=1;
         for(int i=0; i<m-n; i++){
             tempCount=0;
             for(int j=0; j<n; j++){
                 
                 char p=str.charAt(i+j);
                 char q=subStr.charAt(j);
                 if(p==q){
                     tempCount++;
                 }
             }
             if(tempCount==n){
                 count++;
             }
         }
         
         System.out.println("The substring \"" + subStr + "\" appears " + count + " times in the string \"" + str + "\".");
         
    }
    
}

// The substring "abc" appears 3 times in the string "ababcabcababc".
