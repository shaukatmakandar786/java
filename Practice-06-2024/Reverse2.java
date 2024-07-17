import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        String str="This is java and java is secure language";
        
        String word[]=str.split(" ");
        
        StringBuilder sb=new StringBuilder();
        for(int i=word.length-1; i>=0; i--){
            
            sb.append(word[i]+" ");
        }
        System.out.println(sb.toString().trim());
        
    }
}

// language secure is java and java is This
