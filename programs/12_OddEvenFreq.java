public class FrequencyOfOddAndEven {

    public static void main(String[] args) {

        int a[]={1,2,3,4,5,6,7,8,9};
        int odd=0,even=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("even frequency is"+even);
        System.out.println("odd frequency is "+odd);
    }
}

// even frequency is4
// odd frequency is 5
