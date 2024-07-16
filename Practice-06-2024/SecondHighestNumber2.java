import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
         int a[]={2,3,5,9,1,6,3,4,4,7};
         int temp;
         for(int i=0; i<=a.length-2; i++){
             
             for(int j=1+i; j<=a.length-1; j++){
                 
                 if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                 }
             }
         }
         
         System.out.println(a[a.length-2]);
  
    }
}

// 7
