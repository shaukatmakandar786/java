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
