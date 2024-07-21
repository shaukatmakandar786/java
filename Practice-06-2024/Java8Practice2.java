// find accurences of string and character in java 8

import java.util.*;
import java.util.stream.Collectors;
class HelloWorld {
    public static void main(String[] args) {
         List<String> stringList = Arrays.asList("Honda", "TVS", "Honda", "Jupiter", "Honda", "TVS");

        String str = "Raaj";
        
        System.out.println(stringList.stream().collect(Collectors.groupingBy(i-> i, Collectors.counting())));
        
        Map<String, Long> map=stringList.stream().collect(Collectors.groupingBy(i-> i, Collectors.counting()));
        
        System.out.println(map);
        
       str.chars().mapToObj(x-> (char) x)
        .collect(Collectors.groupingBy(i-> i, Collectors.counting()));
        
        System.out.println(str.chars().mapToObj(x-> (char) x)
        .collect(Collectors.groupingBy(i-> i, Collectors.counting())));
        
         Map<Character, Long> map2=str.chars().mapToObj(x-> (char) x)
        .collect(Collectors.groupingBy(i-> i, Collectors.counting()));
        
        System.out.println(map2);
        
    }
}

// {TVS=2, Jupiter=1, Honda=3}
// {TVS=2, Jupiter=1, Honda=3}
// {a=2, R=1, j=1}
// {a=2, R=1, j=1}
