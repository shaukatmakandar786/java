import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       
       printNumber(1, 10);
    }
    public static void printNumber(int start, int end){
        
        if(start>end){
            return;
        }
        System.out.println(start);
        printNumber(start+1, end);
    }
}

// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10

