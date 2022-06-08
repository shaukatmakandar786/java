//Java program to remove duplicates in an array?

public class RemoveDuplicateInArray {

    public static void main(String[] args) {

        int a[]={2,3,5,9,1,6,3,4,4};
        int b[]=new int[a.length];
        int k=0;
        boolean flag;
        for(int i=0;i<=a.length-2;i++)
        {
            flag=false;
            for(int j=1+i;j<=a.length-1;j++)
            {
                if(a[i]==a[j])
                {
                    flag=true;
                    break;
                }

            }
            if(flag==false)
            {
                b[k]=a[i];
                k++;
            }
        }
        b[k]=a[a.length-1];

        for(int i=0;i<=k;i++)
        {
            System.out.println(b[i]);
        }

    }
}

// 2
// 5
// 9
// 1
// 6
// 3
// 4
