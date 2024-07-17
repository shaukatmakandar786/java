import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Server Started...!");
        
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 4, 1, 2, 1};
        
        HashMap<Integer, Integer> freqMap=new HashMap<Integer, Integer>();
        
        for(int a: array){
            if(!freqMap.containsKey(a)){
                freqMap.put(a,1);
            }else{
                freqMap.put(a, freqMap.get(a)+1);
            }
        }
        
        for(Map.Entry<Integer, Integer> entry: freqMap.entrySet()){
            System.out.println("Frequency of "+entry.getKey()+" is "+ entry.getValue());
        }
    }
}

// Server Started...!
// Frequency of 1 is 4
// Frequency of 2 is 3
// Frequency of 3 is 2
// Frequency of 4 is 2
// Frequency of 5 is 1
