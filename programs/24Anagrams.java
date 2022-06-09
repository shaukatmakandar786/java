//Java program to to find anagrams of a given word
import java.util.Arrays;


public class Anagrams {
    static void isAnagram(String s1,String s2)
    {
        int length1 = s1.length();
        int length2 = s2.length();
        boolean status=false;
        if(length1!=length2)
            status=true;
        else{
            char[] c1 = s1.toLowerCase().toCharArray();
            char[] c2 = s2.toLowerCase().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);
            status=Arrays.equals(c1,c2);
        }
        if(status)
            System.out.println(s1+" and "+s2+" are Anagrams");
        else
            System.out.println(s1+" and "+s2+" are not Anagrams");
    }
    public static void main(String[] args) {

        isAnagram("keep","Peek");
        isAnagram("Mother In Law", "Hitler Woman");
        isAnagram("abc","pqr");

    }
}

// keep and Peek are Anagrams
// Mother In Law and Hitler Woman are Anagrams
// abc and pqr are not Anagrams
