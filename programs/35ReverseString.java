//Java Program to replace lower-case characters with upper-case and vice-versa

package com.shaukat;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String s="shaukat MAKANDAR";
        char[] chars = s.toCharArray();

        char[] chars1=new char[s.length()];
        int k=0;
        for(int index=0;index<chars.length;index++)
        {

            if(Character.isUpperCase(chars[index]))
            {
                chars1[k]=Character.toLowerCase(chars[index]);
                k++;

            }
            else if(Character.isLowerCase(chars[index]))
            {

                chars1[k]=Character.toUpperCase(chars[index]);
                k++;

            } else if (Character.isSpaceChar(chars[index])) {

                chars1[k]=chars[index];
                k++;
            }
        }
        String s2=new String(chars1);
        System.out.println(s2);


    }
}
