//Java program to print sorting an array in ascending order?

public class RemoveDuplicateInArray {

    public static void main(String[] args) {

        int a[]={9,8,7,6,5,4,3,2,1};
        int temp;
        System.out.println("Display before sorting");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        for(int i=0;i<=a.length-2;i++)
        {
            for(int j=1+i;j<=a.length-1;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }

        System.out.println("Display after sorting");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
}

// Display before sorting
// 9
// 8
// 7
// 6
// 5
// 4
// 3
// 2
// 1
// Display after sorting
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
