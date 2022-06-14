import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Demo{

    public static void main(String[] args) {
        
//         ArrayList<ArrayList<Integer> > x
//                 = new ArrayList<ArrayList<Integer> >();

        
//         x.add(0,new ArrayList<Integer>(Arrays.asList(3,4,6)));
//         x.add(1,new ArrayList<Integer>(Arrays.asList(10,20,40)));
//         x.add(2,new ArrayList<Integer>(Arrays.asList(2,11,22)));
//         System.out.println(x);

//         Scanner sc=new Scanner(System.in);
      
        ArrayList<ArrayList<Integer>> y=new ArrayList<ArrayList<Integer>>();
        System.out.println("how many array list you want to create");
      
        int m= sc.nextInt(); 
        for(int i=0;i<m;i++)
        {
            System.out.println("how many details you want to enter in arraylist");
            int n=sc.nextInt();
            System.out.println("enter "+n+" numbers");
            ArrayList<Integer> t=new ArrayList<Integer>();
            for (int j=0;j<n;j++)
            {
                System.out.println("enter a no");
                Integer no=sc.nextInt();
                Integer i1 = Integer.valueOf(no);
                t.add(i1);
            }
            y.add(i,t);
        }
        System.out.println(y);
    }
}
