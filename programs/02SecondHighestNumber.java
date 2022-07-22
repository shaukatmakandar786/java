import java.util.*;
public class SecondLargestNumber {

    public static void main(String[] args) {
       int a[]={2,3,5,9,1,6,3,4,4,7};
        Arrays.sort(a);

        System.out.println(a[a.length-2]);
    }
}
