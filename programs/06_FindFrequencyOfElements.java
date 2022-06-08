//Java program to print frequency of a element in a an array?

import java.util.Arrays;

public class FindFrequency {

    public static void main(String[] args) {

        int a[]={1,1,1,1,2,2,2,3,3,4};
        boolean visited[]=new boolean[a.length];

        Arrays.fill(visited,false);

        int count;
        for(int i=0;i<=a.length-2;i++)
        {
            if(visited[i]==true)
                continue;
            count=0;
            for(int j=1+i;j<=a.length-1;j++)
            {
                if(a[i]==a[j])
                {
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(a[i]+" has "+count+" frequency");
        }
    }
}

// 1 has 3 frequency
// 2 has 2 frequency
// 3 has 1 frequency
