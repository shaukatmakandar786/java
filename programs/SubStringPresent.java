// how many times a subString is present in given string


//too hot to hoot
//        too&hot*toh&oot
//        oo&hot*toh$oot

public class Main {
    public static void main(String[] args) {

        String s1="here and there";
        String s2="here";
        
        int tempCount,count=0;
        int m = s1.length();
        int n = s2.length();
        
        for(int i=0;i<=m-n;i++)
        {
            tempCount=0;
            for(int j=0;j<n;j++)
            {
                char p=s1.charAt(i+j);
                char q=s2.charAt(j);

                if(p==q)
                {
                    tempCount++;
                }
            }
            if(tempCount==4)
            {
                count++;
            }
        }
        System.out.println("total count is "+count);


    }
}
