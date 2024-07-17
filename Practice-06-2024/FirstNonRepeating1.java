import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
     
        int arr[]={1,2,3,1,4,2};
        
        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
        
        for(int a: arr){
            
            if(!map.containsKey(a)){
                map.put(a,1);
            }
            else{
                map.put(a, map.get(a)+1);
                
            }
        }
        
         for(Map.Entry<Integer, Integer> entry: map.entrySet()){
             
             if(entry.getValue()==1){
                 System.out.println("Frequency of "+entry.getKey()+" is "+ entry.getValue());
                 break;
             }
            
        }
    }
    
}

// Frequency of 3 is 1
