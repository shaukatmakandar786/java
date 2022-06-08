//Java program to print duplicate words ina String?

public class SecondLargestNumber {

    public static void main(String[] args) {

        String  s1="this is java and java is great";
        String[] s = s1.split(" ");

       for(int i=0;i<=s.length;i++)
       {
           for(int j=1+i;j<=s.length-1;j++)
           {
               if(s[i].equalsIgnoreCase(s[j]))
               {
                   System.out.println(s[i]);
               }
           }
       }

    }
// }
// is
// java
