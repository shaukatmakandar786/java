// check given string is balanced or not

package com.shaukat;

import java.util.Stack;

public class BalancedParenthesis {

    public static void main(String[] args) {

        String s="{[()]}";
        if(isValid(s))
        {
            System.out.println("Given Parenthesis Is Balanced");
        }
        else {
            System.out.println("Given Parenthesis Is Balanced");
        }

    }

    public static boolean isValid(String s)
    {
        Stack<Character> stack=new Stack<Character>();
        boolean ans=true;
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='{' || ch=='[' || ch=='(')
            {
                stack.push(ch);
            }
            else if (ch=='}') {
                if(!stack.isEmpty() && stack.peek()=='{')
                {
                    stack.pop();
                }
                else {
                    ans=false;
                    break;
                }
            }
            else if (ch==']') {
                if(!stack.isEmpty() && stack.peek()=='[')
                {
                    stack.pop();
                }
                else {
                    ans=false;
                    break;
                }
            }
            else if (ch==')') {
                if(!stack.isEmpty() && stack.peek()=='(')
                {
                    stack.pop();
                }
                else {
                    ans=false;
                    break;
                }
            }
        }
        return ans;
    }

}
