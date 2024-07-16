import java.util.Arrays;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Started....!");
        
        int a[]={3,2,5,6,8,4,3,7,2,6,};
        int b[]=new int[a.length];
        int k=0;
        boolean flag;
        
        for(int i=0; i<=a.length-2; i++){
            
            flag=false;
            for(int j=1+i; j<=a.length-1; j++){
                
                if(a[i]==a[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                b[k]=a[i];
                k++;
            }
        }
        
        // System.out.println("Unique array elements : "+Arrays.toString(b));
        
        for(int i=0; i<k; i++){
            System.out.println(b[i]);
        }
        
    }
}

// Started....!
// 5
// 8
// 4
// 3
// 7
// 2
