import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
     
     
        for(int i=1; i<=5;i++){
            
            for(int k=4; k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        
        for(int i=5; i>=1; i--){
          
            for(int k=4; k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        
    }
    
}

 //     *
 //    * *
 //   * * *
 //  * * * *
 // * * * * *
 // * * * * *
 //  * * * *
 //   * * *
 //    * *
 //     *
