# Set: 

• It was introduced in JDK 1.2 version.  
• It is a direct child interface to Collection interface.  
• It is not index based, it able to arrange all the elements on the basis of elements  
hashcode values.  
• It will not allow duplicate elements.  
• It will not follow insertion order.  
Note: LinkedHashSet will follow insertion order.  
• It will not follow Sorting order.  
Note: SortedSet, NavigableSet and TreeSet are following Sorting order.  
• It able to allow only one null value.  
Note: SortedSet, NavigableSet and TreeSet are not allowing even single null value.  

# HashSet:  

• HashSet is a direct implementation class to Set interface.  
• It was introduced in JDK 1.2 version.  
• It is not index based, it able to arrange all the elements on the basis of elements  
hashcode values.  
• It will not allow duplicate elements.  
• It will not follow insertion order.  
• It will not follow Sorting order.  
• It able to allow only one null value.  
• Its interal data structer is "Hashtable".  
• Its initial capacity is "16" elements and its initial fill_Ratio is 75%.  
• It is not synchronized.  
• Almost all the methods are not synchronized in HashSet  
• It allows more than one thread at a time.  
• It follows parallel execution.  
• It will reduce execution time  
• It improves performance of the applications.  
• It is not giving guarantee for data consistency.  
• It is not threadsafe.  

### Constuctors:  

• public HashSet()  

This constructor can be used to create an empty HashSet object with 16 elements as  
initial capacity and 75% fill ratio.  

EX: HashSet hs = new HashSet();  

• public HashSet(int capacity)  

This constructor can be used to create an empty HashSet object with the specified  
capacity as initial capacity and with the default fill ratio 75%.  

EX: HashSet hs = new HashSet(20);  

• public HashSet(int capacity, float fill_Ratio)  

This constructor can be used to create an empty HashSet object with the specified  
capacity and with the specified fill ratio.  

EX: HashSet hs = new HashSet(20, 0.85f);  

• public HashSet(Collection c)  

This constructor can be used to create HashSet object with all the elements of the 
specified Collection.  

              import java.util.*; 
              class Test 
              { 
                      public static void main(String[] args) 
                      { 
                            HashSet hs1=new HashSet(); 
                            hs1.add("A"); 
                            hs1.add("B"); 
                            hs1.add("C"); 
                            hs1.add("D"); 
                            hs1.add("E"); 
                            System.out.println(hs1); 
                            HashSet hs2=new HashSet(hs1); 
                            System.out.println(hs2); 
                      } 
              }
              
              OUTPUT: 
              [D,E,A,B,C]
              [D,E,A,B,C]

-------------------------------------------------------------------------------

            import java.util.*; 
            class Test 
            { 
                  public static void main(String[] args) 
                  { 
                        HashSet hs=new HashSet(); 
                        hs.add("A"); 
                        hs.add("B"); 
                        hs.add("C"); 
                        hs.add("D"); 
                        hs.add("E"); 
                        System.out.println(hs); 
                        hs.add("B"); 
                        System.out.println(hs); 
                        hs.add(null); 
                        hs.add(null); 
                        System.out.println(hs); 
                        hs.add(new Integer(10)); 
                        System.out.println(hs); 
                  } 
            }

            [A, B, C, D, E]
            [A, B, C, D, E]
            [null, A, B, C, D, E]
            [null, A, B, C, D, E, 10]

#LinkedHashSet:  

## Q ) What are the differences between HashSet and LinkedHashSet?  

• HashSet was introduced in JDK 1.2 version.  
LinkedhashSet was introduced in JDK 1.4 version.  

• HashSet is not following insertion order.  
LinkedHashSet is following insertion order.  

• The internal data structer of HashSet is "Hashtable".  
The internal data structer of LinkedHashSet is "Hashtable" and "LinkedList".  

                import java.util.*;
                class Test 
                { 
                      public static void main(String[] args) 
                      { 
                            HashSet hs=new HashSet(); 
                            hs.add("A"); 
                            hs.add("B"); 
                            hs.add("C"); 
                            hs.add("D"); 
                            hs.add("E"); 
                            System.out.println(hs); 
                            LinkedHashSet lhs=new LinkedHashSet(); 
                            lhs.add("A"); 
                            lhs.add("B"); 
                            lhs.add("C"); 
                            lhs.add("D"); 
                            lhs.add("E"); 
                            System.out.println(lhs); 
                      } 
                } 
                
                OUTPUT: 
                [D,E,A,B,C]
                [A,B,C,D,E]
                
# SortedSet:  

• It was introduced in JDK1.2 version.  
• It is a child interface to Set interface.  
• It is not index based.  
• It is not allowing duplicate elements.  
• It is not following insertion order.  
• It follows Sorting order.  
• It allows only homogeneous elements.  
• It will not allow heterogeneous elements, if we are trying to add heterogeneous  
elements then JVM wi## ll rise an exception like java.lang.ClasscastException.  
• It will not allow null values, if we are trying to add any null value then JVM will rise an  
exception like java.lang.NullPointerException.  
• It able to allow only Comparable objects by default, if we are trying to add non  
comparable objects then JVM will rise an exception like java.lang.ClassCastException.  
Note: If we are trying to add non comparable objects then we have to use Comparator.  

## Methods: 

• public Object first()  

 It will return first element from SortedSet.  
 
• public Object last()  

 It will return last element from SortedSet.  
 
• public SortedSet headSet(Object obj)  

It will return SortedSet object with the elements which are less the specified element.  

• public SortedSet tailSet(Object obj)  

 It will return SoredSet object with the elements which are greater than or equals to  
 
 the specified element.  
 
• public SortedSet subSet(Object obj1, Object obj2)  

 It will return SortedSet object with all elements which are greater than or equals to  
 
 the specified first element and which are less than the specified second element.  
 

          import java.util.*; 
          class Test 
          { 
                public static void main(String[] args) 
                { 
                      TreeSet ts=new TreeSet(); 
                      ts.add("D"); 
                      ts.add("F"); 
                      ts.add("B"); 
                      ts.add("E"); 
                      ts.add("C"); 
                      ts.add("A"); 
                      System.out.println(ts); 
                      System.out.println(ts.first()); 
                      System.out.println(ts.last()); 
                      System.out.println(ts.headSet("D")); 
                      System.out.println(ts.tailSet("D")); 
                      System.out.println(ts.subSet("B","E")); 
                } 
          }

          [A, B, C, D, E, F]
          A
          F
          [A, B, C]
          [D, E, F]
          [B, C, D]
          
          
# NavigableSet:

It was introduced in JAVA6 version, it is a child interface to SortedSet interface, it is  
following all the properties of SortedSet and it has define methods to provide navigations  
over the elements.  

## Methods: 

• public Object ceiling(Object obj)  

It will return lowest element among all the elements which are greater than or equals  
to the specified element.  

• public Object higher(Object obj)  

It will return lowest element among all the elements which are greater than the  
specified element.  

• public Object floor(Object obj)  

It will return highest element among all the elements which are less than or equals to  
the specified element.  

• Trpublic Object lower(Object obj)  

It will return highest element among all the elements which are less than the specified  
element.   

• public Object pollFirst()  
 It will remove and return first element from NavigableSet.  
 
 • public Object pollLast()  
 
 It will remove and return last element from NavigableSet.  
 
• public NavigableSet descendingSet()  

 It will return all elements in the form of NavigableSet in descending order.

          import java.util.*; 
          class Test 
          { 
                public static void main(String[] args) 
                { 
                      TreeSet ts=new TreeSet(); 
                      ts.add("D"); 
                      ts.add("F"); 
                      ts.add("B");
                      ts.add("E"); 
                      ts.add("C"); 
                      ts.add("A"); 
                      System.out.println(ts); 
                      System.out.println(ts.ceiling("D")); 
                      System.out.println(ts.higher("D")); 
                      System.out.println(ts.floor("D")); 
                      System.out.println(ts.lower("D")); 
                      System.out.println(ts.descendingSet()); 
                      ts.pollFirst(); 
                      ts.pollLast(); 
                      System.out.println(ts); 
                } 
          } 
          
          [A, B, C, D, E, F]
          D
          E
          D
          C
          [F, E, D, C, B, A]
          [B, C, D, E]
