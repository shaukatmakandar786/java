# Map:  

• It was introduced in JDK 1.2 version.  
• It is not child interface to Collection Interface.  
• It able to arrange all the elements in the form of Key-value pairs.  
• In Map, both keys and values are objects.  
• Duplicates are not allowed at keys, but values may be duplicated.  
• Only one null value is allowed at keys side, but, any number of null values are allowed  
at values side.  
• Both keys and Values are able to allow heterogeneous elements.  
• Insertion order is not followed.  
• Sorting order is not followed.  

## Methods: 

• public void put(Object key, Object value)  

 It will add the specified key-value pair to Map.  
 
• public void putAll(Map m)  

 It will add all key-value pairs of the specified map to the present Map object.  
 
• public Object get(Object key)  

 It will return value of the specified key.  
 
• public Object remove(Object key)  

 It will remove a key-value pair from Map on the basis of the specified key.  
 
• public int size()  

 It will return number of key-value pairs of a Map  
 
• public boolean containsKey(Object key)  

 It will check whether the specified key is existed or not at keys side.  
 
• public boolean cotainsValue(Object key)  

 It will check whether the specified value is available or not at values side

• public Set keySet()  

 It will return all keys in the form of a Set.  
 
 • public Collection values()  
 
 It will return all values in the form of a Collection object.  
 
• public boolean isEmpty()  

It will check whether the Map object is empty or not, if the present map object is   
empty then it will return true value otherwise it will return false value.

          import java.util.*; 
          class Test 
          { 
                public static void main(String[] args) 
                { 
                      HashMap hm=new HashMap(); 
                      hm.put("A","AAA"); 
                      hm.put("B","BBB"); 
                      hm.put("C","CCC"); 
                      hm.put("D","DDD"); 
                      hm.put("E","EEE"); 
                      System.out.println(hm); 
                      HashMap hm1=new HashMap(); 
                      hm1.put("X","XXX"); 
                      hm1.put("Y","YYY"); 
                      System.out.println(hm1); 
                      hm.putAll(hm1); 
                      System.out.println(hm); 
                      System.out.println(hm.get("B")); 
                      System.out.println(hm.remove("E")); 
                      System.out.println(hm.size()); 
                      System.out.println(hm.isEmpty()); 
                      System.out.println(hm.containsKey("D")); 
                      System.out.println(hm.containsValue("DDD")); 
                      System.out.println(hm.keySet()); 
                      System.out.println(hm.values()); 
                } 
          } 
          
          {A=AAA, B=BBB, C=CCC, D=DDD, E=EEE}
          {X=XXX, Y=YYY}
          {A=AAA, B=BBB, C=CCC, D=DDD, E=EEE, X=XXX, Y=YYY}
          BBB
          EEE
          6
          false
          true
          true
          [A, B, C, D, X, Y]
          [AAA, BBB, CCC, DDD, XXX, YYY]
          
# HashMap: 

• It was introduced in JDK1.2 version.  
• It is not Legacy.  
• It is an implementation class to Map interface.  
• It able to arrange all the elements in the form of Key-value pairs.  
• In HashMap, both keys and values are objects.  
• Duplicates are not allowed at keys, but values may be duplicated.  
• Only one null value is allowed at keys side, but, any number of null values are allowed  
at values side.  
• Both keys and Values are able to allow heterogeneous elements.  
• Insertion order is not followed.  
• Sorting order is not followed.  
• Its internal data structure is "Hashtable".  
• Its initial capacity is 16 elements.  
• It is not synchronized  
• No method is synchronized in HashMap  
• It allows more than one thread to access data.  
• It follows parallel execution.  
• It will reduce application execution time.  
• It will improve application performance.  
• It is not giving guarantee for data consistency.  
• It is not threadsafe.  

## Constructors:  

• public HashMap()  
• public HashMap(int capacity)  
• public HashMap(int capacity, float fill_Ratio)  
• public HashMap(Map m)  

          
          import java.util.*; 
          class Test 
          { 
                public static void main(String[] args) 
                { 
                      HashMap hm=new HashMap(); 
                      hm.put("A","AAA"); 
                      hm.put("B","BBB"); 
                      hm.put("C","CCC"); 
                      hm.put("D","DDD"); 
                      hm.put("E","EEE"); 
                      System.out.println(hm); 
                      hm.put("B","FFF"); 
                      System.out.println(hm); 
                      hm.put("F","CCC"); 
                      System.out.println(hm);
                      hm.put(null,"HHH"); 
                      hm.put("G",null); 
                      hm.put("H",null); 
                      System.out.println(hm); 
                      hm.put(new Integer(10), new Integer(20)); 
                      System.out.println(hm); 
                } 
          } 
          
          {A=AAA, B=BBB, C=CCC, D=DDD, E=EEE}
          {A=AAA, B=FFF, C=CCC, D=DDD, E=EEE}
          {A=AAA, B=FFF, C=CCC, D=DDD, E=EEE, F=CCC}
          {null=HHH, A=AAA, B=FFF, C=CCC, D=DDD, E=EEE, F=CCC, G=null, H=null}
          {null=HHH, A=AAA, B=FFF, C=CCC, D=DDD, E=EEE, F=CCC, G=null, H=null, 10=20}
          
# LinkedHashMap:  

## Q) What are the differences between HashMap and LinkedHashMap?  

• HashMap was introduced in JDK 1.2 version.  
LinkedHashMap was introduced in JDK 1.4 version.  

• HashMap is not following insertion order.  
LinkedHashMap is following insertion order.  

• HashMap internal data structure is Hashtable.  
LinkedHashMap internal data structure is Hashtable+LinkedList 

          import java.util.*; 
          class Test 
          { 
                public static void main(String[] args) 
                { 
                      HashMap hm=new HashMap(); 
                      hm.put("A","AAA"); 
                      hm.put("B","BBB"); 
                      hm.put("C","CCC"); 
                      hm.put("D","DDD"); 
                      hm.put("E","EEE"); 
                      System.out.println(hm); 

                      LinkedHashMap lhm=new LinkedHashMap(); 
                      lhm.put("A","AAA"); 
                      lhm.put("B","BBB"); 
                      lhm.put("C","CCC"); 
                      lhm.put("D","DDD"); 
                      lhm.put("E","EEE"); 
                      System.out.println(lhm);
                } 
          } 
          
          {A=AAA, B=BBB, C=CCC, D=DDD, E=EEE}
          {A=AAA, B=BBB, C=CCC, D=DDD, E=EEE}
          
          
# IdentityHashMap:  

## Q) What are the differences between HashMap and IdentityHashMap?  

• HashMap was introduced in JDK 1.2 version.  
IdentityHashMap was introduced in JDK 1.4 version.  

• HashMap and IdentityhashMap are not allowing duplicate keys, to check duplicate  
keys HashMap will use equals(-) method, but, IdentityHashMap will use '=='  
operator.  

Note: '==' operator will perform references comparison always, but, equals() method was   
defined in Object class initially, later on it was overridden in String class and in all wrapper  
classes in order to perform contents comparison.  


              import java.util.*; 
              class Test 
              { 
                    public static void main(String[] args) 
                    { 
                          Integer in1=new Integer(10); 
                          Integer in2=new Integer(10); 
                          HashMap hm=new HashMap(); 
                          hm.put(in1,"AAA"); 
                          hm.put(in2,"BBB");// in2.equals(in1)-->true 
                          System.out.println(hm);// {10=BBB} 

                          IdentityHashMap ihm=new IdentityHashMap(); 
                          ihm.put(in1, "AAA"); 
                          ihm.put(in2, "BBB");// in2 == in1 --> false 
                          System.out.println(ihm);// {10=AAA, 10=BBB} 
                    } 
              }
              
              {10=BBB}
              {10=AAA, 10=BBB}
              
# WeakHashMap:  

## Q) What is the difference between HashMap and WeakHashMap?   

                  import java.util.*; 
                  class A 
                  { 
                        public String toString() 
                        { 
                        return "A"; 
                        } 
                  } 
                  class Test 
                  { 
                       public static void main(String[] args) 
                       { 
                             A a1=new A(); 
                             HashMap hm=new HashMap(); 
                             hm.put(a1, "AAA"); 
                             System.out.println("HM Before GC :"+hm);// {A=AAA} 
                             a1=null; 
                             System.gc(); 
                             System.out.println("HM After GC :"+hm);// {A=AA} 

                             A a2=new A(); 
                             WeakHashMap whm=new WeakHashMap(); 
                             whm.put(a2, "AAA"); 
                             System.out.println("WHM Before GC :"+whm);// {A=AAA} 
                             a2=null; 
                             System.gc(); 
                             System.out.println("WHM After GC :"+whm);// {} 

                       } 
                  } 
                  
                  HM Before GC :{A=AAA}
                  HM After GC :{A=AAA}
                  WHM Before GC :{A=AAA}
                  WHM After GC :{}
                  
NOTE: In Java applications, Garbage Collector will destroy objects internally. In java  
applications, it is possible to destroy objects explicitly by activating GarbageCollector, for   
this, we have to use the following two steps.  
• Nullify the respective object reference.  
• Access System.gc() method, it will access  
 finalize() method internally just before destroying object.  
 
  
            class A { 
            
                A() { 
                  System.out.println("Object Creating"); 
                } 
                public void finalize() { 
                  System.out.println("Object Destroying"); 
                } 
            } 
            class Test { 
             public static void main(String[] args) { 
                 A a = new A(); 
                 a = null; 
                 System.gc(); 
             } 
            }
            
            Object Creating
            Object Destroying

# SortedMap:   
• It was introduced in JDK1.2 version.  
• It is a direct child interface to Map interface  
• It able to allow elements in the form of Key-Value pairs, where both keys and values  
are objects.  
• It will not allow duplicate elements at keys side, but, it able to allow duplicate  
elements at values side.  
• It will not follow insertion order.  
• It will follow sorting order.  
• It will not allow null values at keys side. If we are trying to add null values at keys side  
then JVM will rise an exception like java.lang.NullPointerException.  
• It will not allow heterogeneous elements at keys side, if we are trying add  
heterogeneous elements then JVM will rise an exception like  
java.lang.ClassCastException.  
• It able to allow only comparable objects at keys side by default, if we are trying to add  
non comparable objects then JVM will rise an exception like  
java.lang.ClassCastException.  
• If we want to add non comparable objects then we must use Comparator. 

Methods:  
public Object firstKey()  
public Object lastKey()  
public SortedMap headMap(Object key)  
public SportedMap tailMap(Object key)  
public SortedMap subMap(Object obj1, Object obj2)  

           import java.util.*; 
           class Test 
           { 
                  public static void main(String[] args) 
                  { 
                       TreeMap tm=new TreeMap(); 
                       tm.put("B", "BBB"); 
                       tm.put("E", "EEE"); 
                       tm.put("D", "DDD"); 
                       tm.put("A", "AAA"); 
                       tm.put("F", "FFF"); 
                       tm.put("C", "CCC"); 
                       System.out.println(tm); 
                       System.out.println(tm.firstKey()); 
                       System.out.println(tm.lastKey()); 
                       System.out.println(tm.headMap("D")); 
                       System.out.println(tm.tailMap("D")); 
                       System.out.println(tm.subMap("B", "E")); 
                  } 
           } 
           
           {A=AAA, B=BBB, C=CCC, D=DDD, E=EEE, F=FFF}
           A
           F
           {A=AAA, B=BBB, C=CCC}
           {D=DDD, E=EEE, F=FFF}
           {B=BBB, C=CCC, D=DDD}
           
# NavigableMap:  

It was introduced in JAVA6 version, it is a child interface to SortedMap and it has defined  
methods to provide navigations over the elements.  

## Methods: 

• public Object CeilingKey(Object obj)  
• public Object higherKey(Object obj)  
• public Object floorKey(Object obj)  
• public Object lowerKey(Object obj)  
• public NavigableMap descendingMap()  
• public Map.Entry pollFirstEntry()  
• public Map.Entry pollLastEntry()           

        import java.util.*; 
        class Test 
        { 
            public static void main(String[] args) 
            { 
                   TreeMap tm=new TreeMap(); 
                   tm.put("A", "AAA"); 
                   tm.put("B", "BBB"); 
                   tm.put("C", "CCC"); 
                   tm.put("D", "DDD"); 
                   tm.put("E", "EEE"); 
                   tm.put("F", "FFF"); 
                   System.out.println(tm); 
                   System.out.println(tm.descendingMap()); 
                   System.out.println(tm.ceilingKey("D")); 
                   System.out.println(tm.higherKey("D")); 
                   System.out.println(tm.floorKey("D")); 
                   System.out.println(tm.lowerKey("D")); 
                   System.out.println(tm.pollFirstEntry()); 
                   System.out.println(tm.pollLastEntry()); 
                   System.out.println(tm); 
            } 
        }
        
        {A=AAA, B=BBB, C=CCC, D=DDD, E=EEE, F=FFF}
        {F=FFF, E=EEE, D=DDD, C=CCC, B=BBB, A=AAA}
        D
        E
        D
        C
        A=AAA
        F=FFF
        {B=BBB, C=CCC, D=DDD, E=EEE}
        
# TreeMap:  

• It was introduced in JDK 1.2 version.  
• It is not Legacy.  
• It is an implementation class to Map, SoortedMap and NavigableMap interfaces.  
• It able to allow elements in the form of Key-Value pairs, where both keys and values  
are objects.  
• It will not allow duplicate elements at keys side, But, it able to allow duplicate  
elements at values side.  
• It will not follow insertion order.  
• It will follow sorting order.  
• It will not allow null values at keys side. If we are trying to add null values at keys side  
then JVM will rise an exception like java.lang.NullPointerException.  
• It will not allow heterogeneous elements at keys side, if we are trying add  
heterogeneous elements then JVM will rise an exception like  
java.lang.ClassCastException.  
• It able to allow only comparable objects at keys side by default, if we are trying to add   
non comparable objects then JVM will rise an exception like   
java.lang.ClassCastException.  
• If we want to add non comparable objects then we must use Comparator.  
• Its internal data Structer is "Red-Black Tree".  
• It is not synchronized.  
• No methods are synchronized in TreeMap.  
• It allows more than one thread to access data.  
• It will follow parallel execution.  
• It will reduce execution time.  
• It will improve application performance.          
• It is not giving guarantee for Data Consistency.  
• It is not threadsafe.  

## Constructors:  

• public TreeMap()  
• public TreeMap(Comparator c)  
• public TreeMap(SortedMap sm)  
• public TreeMap(Map m)  

        import java.util.*; 
        class Test 
        { 
             public static void main(String[] args) 
             { 
                 TreeMap tm=new TreeMap(); 
                 tm.put("A", "AAA"); 
                 tm.put("B", "BBB"); 
                 tm.put("C", "CCC"); 
                 tm.put("D", "DDD"); 
                 System.out.println(tm); 
                 tm.put("B", "EEE"); 
                 System.out.println(tm); 
                 tm.put("E", "CCC"); 
                 System.out.println(tm); 
                 //tm.put(null, "EEE");-->NullPointerException 
                  tm.put("F",null); 
                  System.out.println(tm); 
                  //tm.put(new Integer(10), new Integer(20));-->CCE 
                  System.out.println(tm); 
                  tm.put("G", new Integer(20)); 
                  System.out.println(tm); 
                  //tm.put(new StringBuffer("BBB"), "GGG");-->CCE 
                  tm.put("H", new StringBuffer("HHH")); 
                  System.out.println(tm); 
              } 
        }
        
        {A=AAA, B=BBB, C=CCC, D=DDD}
        {A=AAA, B=EEE, C=CCC, D=DDD}
        {A=AAA, B=EEE, C=CCC, D=DDD, E=CCC}
        {A=AAA, B=EEE, C=CCC, D=DDD, E=CCC, F=null}
        {A=AAA, B=EEE, C=CCC, D=DDD, E=CCC, F=null}
        {A=AAA, B=EEE, C=CCC, D=DDD, E=CCC, F=null, G=20}
        {A=AAA, B=EEE, C=CCC, D=DDD, E=CCC, F=null, G=20, H=HHH}
        
#Hashtable:  

## Q) What are the differences between HashMap and Hashtable?  

• HashMap was introduced in JDK 1.2 version.  
Hashtable was introduced in JDK 1.0 version Hashtable:  

• HashMap is not Legacy.  
Hashtable is Legacy.  

• In HashMap, one null value is allowed at keys side and any number of null values are allowed at values side.  
In case of Hashtable, null values are not allowed at both keys and values side.   

• HashMap is not synchronized.  
Hashtable is synchronized.  

• No method is synchronized in HashMap.  
Almost all the methods are synchronized in Hashtable  

• HashMap allows more than one thread to access data.  
Hashtable allows only one thread at a time to access data.  

• HashMap follows parallel execution.  
Hashtable follows sequential execution.  

• HashMap will reduce execution time.  
Hashtable will increase execution time.  

• HashMap will improve application performance.  
Hashtable will reduce application performance.  

• HashMap will not give guarantee for data consistency.  
Hashtable will give guarantee for data consistency  

• HashMap is not threadsafe.  
Hashtable is threadsafe.  
      

           import java.util.*; 
           class Test 
           { 
                  public static void main(String[] args) 
                  { 
                         HashMap hm=new HashMap(); 
                         hm.put("A", "AAA"); 
                         hm.put("B", "BBB"); 
                         hm.put("C", "CCC"); 
                         hm.put("D", "DDD"); 
                         System.out.println(hm); 
                         hm.put(null, "EEE"); 
                         hm.put(null, "FFF"); 
                         hm.put("E",null); 
                         hm.put("F", null); 
                         System.out.println(hm); 
                         System.out.println(); 
                         Hashtable ht=new Hashtable(); 
                         ht.put("A", "AAA"); 
                         ht.put("B", "BBB"); 
                         ht.put("C", "CCC"); 
                         ht.put("D", "DDD"); 
                         System.out.println(ht); 
                         //ht.put(null, "EEE");-->NullPointerException 
                         //ht.put("E", null);-->NullPointerException 
                   } 
           }       
           
           {A=AAA, B=BBB, C=CCC, D=DDD}
           {null=FFF, A=AAA, B=BBB, C=CCC, D=DDD, E=null, F=null}
           {A=AAA, D=DDD, C=CCC, B=BBB}
