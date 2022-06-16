//Java Program to find the longest repeating sequence in a string

package com.shaukat;

public class FrequencyOfCharacterInString {

    public static void main(String[] args) {

        String s="abc pqr abc xyz pqr pqr pqr xyz abc abc abc";

        String[] s1 = s.split(" ");
        int count=0;
        int max=0;
        String ans="";
        for(int i=0;i<=s1.length-2;i++)
        {
            count=0;
            for(int j=1+i;j<=s1.length-1;j++)
            {
                if(s1[i].equals(s1[j]))
                {
                    count++;
                }
            }
            if(count>max)
            {
                max=count;
                ans=s1[i];
            }
        }
        System.out.println("Most repeating elements is "+ ans);

    }
}
