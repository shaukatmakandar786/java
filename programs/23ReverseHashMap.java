import java.util.HashMap;
import java.util.*;
//write a program to implement reverse hash map
public class ReverseHashMap {
    public static void main(String[] args) {

        HashMap<Integer,String> h1=new HashMap<>();
        h1.put(1,"shaukat");
        h1.put(2,"wasim");
        h1.put(3,"azim");
        h1.put(4,"asif");

        System.out.println(h1);
        HashMap<String,Integer> newMap=new HashMap<>();
        for(Map.Entry<Integer,String> entry:h1.entrySet())
        {
            newMap.put(entry.getValue(),entry.getKey());
        }
        System.out.println(newMap);

    }
}

// {1=shaukat, 2=wasim, 3=azim, 4=asif}
// {azim=3, asif=4, shaukat=1, wasim=2}
