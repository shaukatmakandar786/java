import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
     
        int arr[]={1,2,3,1,4,2};
        
        int count;
        
        for(int i=0;i<=arr.length;i++){
            
            count=1;
            for(int j=1+i; j<=arr.length-1; j++){
                
                if(arr[i]==arr[j]){
                    count++;
                    break;
                }
            }
            if(count==1){
                System.out.println("First Non Repeating number is : : "+arr[i]);
                break;
            }
        }
    }
    
}

// First Non Repeating number is : : 3
