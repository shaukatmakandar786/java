import java.util.*;
import java.util.stream.Collectors;
class HelloWorld {
    public static void main(String[] args) {
      
        List<Integer> list=Arrays.asList(2,1,3,4,6,3,7,8,9,10,13,12);
        
        
        List<Integer> list1=list.stream().filter(i-> i%2==0).collect(Collectors.toList());
        
        System.out.println(list1);
        
       List<Integer> list2=list.stream().map(i-> i+5).collect(Collectors.toList());
       
       System.out.println(list2);
       
       long length=list.stream().filter(i-> i%2==0).count();
       
        System.out.println("length : "+length);
        
        Integer min=list.stream().min((i1, i2)-> i1.compareTo(i2)).get();
        
         System.out.println("Min Number : "+min);
         
         Integer max=list.stream().max((i1,i2)-> i1.compareTo(i2)).get();
         
         
         System.out.println("Max Number : "+max);
         
         List<Integer> list3=list.stream().sorted().collect(Collectors.toList());
        
         System.out.println("After sorting : "+list3);
         
         List<Integer> list4=list.stream().sorted((i1,i2)-> ((i1>i2) ? -1:(i1<i2)?1:0)).collect(Collectors.toList());
         System.out.println("After sorting : "+list4);
         
         List<Integer> list5=list.stream().sorted((i1, i2)-> i1.compareTo(i2)).collect(Collectors.toList());
         
         System.out.println("After sorting : "+list5);
         
         ArrayList<String> l1=new ArrayList<String>();

                    l1.add("shaukat");
                    l1.add("Azim");
                    l1.add("AAAAAAAAAAAA");
                    l1.add("zakir");
                    l1.add("asif");
                    System.out.println(l1);
                    
        Comparator<String> c=(i1,i2)->{
            
            int len1=i1.length();
            int len2=i2.length();
            
            if(len1>len2)
                return -1;
            else if(len1<len2)    
                return 1;
            else
                return 0;
            
        };   
        
        List<String> list6=l1.stream().sorted(c).collect(Collectors.toList());
        
        System.out.println("After sorting : "+list6);
        
        List<String> list7=l1.stream().sorted((i1, i2)-> Integer.valueOf(i1.length()).compareTo(Integer.valueOf(i2.length()))).collect(Collectors.toList());
        
        System.out.println("list7 : "+list7);
        
         //sorting logic for map
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(102,"BBBBBB");
        hm.put(103,"DDD");
        hm.put(101,"CCCC");
        
        System.out.println("Map1 : "+hm.entrySet().stream()
            .sorted(Map.Entry.<Integer, String>comparingByKey()).collect(Collectors.toList()));
            
        System.out.println("Map2 : "+hm.entrySet().stream().
        sorted(Map.Entry.<Integer, String>comparingByValue()).collect(Collectors.toList()));
        
        System.out.println("Map3 : "+hm.entrySet().stream().
        sorted(Map.Entry.<Integer, String>comparingByKey().reversed()).collect(Collectors.toList()));
        
         System.out.println("Map3 : "+hm.entrySet().stream().
         sorted(Map.Entry.<Integer, String>comparingByValue().reversed()).collect(Collectors.toList()));
        
        

    }
}



// [2, 4, 6, 8, 10, 12]
// [7, 6, 8, 9, 11, 8, 12, 13, 14, 15, 18, 17]
// length : 6
// Min Number : 1
// Max Number : 13
// After sorting : [1, 2, 3, 3, 4, 6, 7, 8, 9, 10, 12, 13]
// After sorting : [13, 12, 10, 9, 8, 7, 6, 4, 3, 3, 2, 1]
// After sorting : [1, 2, 3, 3, 4, 6, 7, 8, 9, 10, 12, 13]
// [shaukat, Azim, AAAAAAAAAAAA, zakir, asif]
// After sorting : [AAAAAAAAAAAA, shaukat, zakir, Azim, asif]
// list7 : [Azim, asif, zakir, shaukat, AAAAAAAAAAAA]
// Map1 : [101=CCCC, 102=BBBBBB, 103=DDD]
// Map2 : [102=BBBBBB, 101=CCCC, 103=DDD]
// Map3 : [103=DDD, 102=BBBBBB, 101=CCCC]
// Map3 : [103=DDD, 101=CCCC, 102=BBBBBB]
