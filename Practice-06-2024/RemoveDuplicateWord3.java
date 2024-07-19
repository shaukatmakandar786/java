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
        String result[]=new String[word.length];
        boolean flag;
        int k=0;
        for(int i=0;i<=word.length-2; i++){
            
            flag=false;
            for(int j=1+i; j<=word.length-1; j++){
                
                if(word[i].equals(word[j])){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                result[k++]=word[i];
               
            }
        }
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++){
            
            sb.append(result[i]+" ");
        }
        
        return sb.toString().trim();
    }
}

// Original string: This is a test test string with duplicate words words
// String with duplicates removed: This is a test string with duplicate words
