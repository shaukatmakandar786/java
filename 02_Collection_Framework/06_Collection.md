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
