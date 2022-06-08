import java.util.*;
public class SecondLargestNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many elements you want to enter in array");
        int n=sc.nextInt();

        int a[]=new int[n];
        System.out.println("enter "+n+" numbers");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=a[0];
        int temp=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                temp=max;
                max=a[i];
            }
        }
        System.out.println("second maximum number is "+temp);
    }
}
