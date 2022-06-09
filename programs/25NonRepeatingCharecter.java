//first non-repeating character in a string? example i/p:- str="apple" o/p :- a


public class NonRepeatingCharecter {

    public static void main(String[] args) {

        int a[]={1,2,3,1,4,2};
        int count;
        for(int i=0;i<=a.length-2;i++)
        {
            count=0;
            for(int j=1+i;j<=a.length-1;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                System.out.println(a[i]+" is first non repeating value");
                break;
            }
        }
    }
}
// 3 is first non repeating value
