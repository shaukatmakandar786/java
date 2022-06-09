//Java Program to find maximum and minimum occurring character in a string

public class FindMaximumAndMinimumOccuringCharecter {
    public static void main(String[] args) {

        String s1="aa bbb cccc dddd eeeee";

        String[] s = s1.split(" ");

        int max=s[0].length();
        String maxString=s[0];
        for(int i=1;i<s.length;i++)
        {
            if(s[i].length()>max)
            {
                max=s[i].length();
                maxString=s[i];
            }
        }
        System.out.println("Maximum Occuring charecter is "+maxString);

        int min=s[0].length();
        String minString=s[0];
        for(int i=1;i<s.length;i++)
        {
            if(s[i].length()<min)
            {
                min=s[i].length();
                minString=s[i];
            }
        }
        System.out.println("Minimum Occuring charecter is "+minString);
    }
}


// Maximum Occuring charecter is eeeee
// Minimum Occuring charecter is aa
