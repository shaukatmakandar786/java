import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Server Started...!");
        
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 4, 1, 2, 1};
        boolean visited[]=new boolean[array.length];
        
        Arrays.fill(visited, false);
        int counter;
        for(int i=0;i<=array.length-2; i++){
            counter=1;
            if(visited[i]==true)
                continue;
            for(int j=1+i; j<=array.length-1; j++){
                
                if(array[i]==array[j]){
                    visited[j]=true;
                    counter++;
                }
            }
            System.out.println("Freq of "+array[i]+" is "+counter);
            
        }
        
    }
}

// Server Started...!
// Freq of 1 is 4
// Freq of 2 is 3
// Freq of 3 is 2
// Freq of 4 is 2
// Freq of 5 is 1
