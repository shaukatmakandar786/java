//Remove duplicate element with HashSet easy way

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Started....!");
        
        int arr[]={3,2,5,6,8,4,3,7,2,6,};
        int result[]=removeDuplicateElements(arr);
        
        System.out.println("Array with duplicate elements: "+ Arrays.toString(arr));
        System.out.println("Array without duplicate elements: "+ Arrays.toString(result));
    }
    
    public static int[] removeDuplicateElements(int arr[]){
        
        Set<Integer> data=new HashSet<Integer>();
        
        for(int a: arr){
            data.add(a);
        }
        
        int result[]=new int[data.size()];
        int i=0;
        for(int res: data){
            result[i]=res;
            i++;
        }
        
        return result;
        
    }
}
