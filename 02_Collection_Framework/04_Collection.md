# LinkedList:  

• It was introduced in JDK1.2 version.  
• It is not Legacy Collection.  
• It is a direct implementation class to List interface.  
• It is index based.  
• It allows duplicate elements.  
• It follows insertion order.  
• It is not following sorting order.  
• It allows heterogeneous elements.  
• It allows null values in any number.  
• Its internal data structure is "Double Linked List".;  
• It is best choice for frequent insertions and deletions.  
• It is not synchronized Collection.  
• No method is synchronized in LinkedList.  
• It allows more than one thread to access data.  
• It will follow parallel execution.  
• It will decrease execution time.  
• It will improve application performance.  
• It is not giving guarantee for data consistency.  
• It is not threadsafe.  

Constructors:  

• public LinkedList()  

 It will create an empty LinkedList object.  
 EX: LinkedList ll = new LinkedList();  
 
• public LinkedList(Collection c)  
 It will create LinkedList object with all the elements of the specified Collection object.  
 
EX: 
LinkedList ll1 = new LinkedList();  
ll1.add("A");  
ll1.add("B");  
ll1.add("C");  
ll1.add("D");  
System.out.println(ll1);  
LinkedList ll2=new LinkedList(ll1);  
System.out.println(ll2);  

OUTPUT:
[A, B, C, D]  
[A, B, C, D]  

Methods:  

• public void addFirst(Object obj)  

 It will add the specified element as first element to LinkedList.  
 
• public void addLast(Object obj)  

 It will add the specified element as last element to LinkedList.  
 
• public Object getFirst()  

 It will return first element from LinkedList.  
 
• public Object getLast()  

 It will return last element from LinkedList.  
 
• public void removeFirst()  

 It will remove first element from LinkedList.  
 
• public void removeLast()  

 It will remove last element from LinkedList.  
 
     import java.util.*; 
     class Test 
     { 
        public static void main(String[] args) 
        { 
            LinkedList ll=new LinkedList(); 
            ll.add("A"); 
            ll.add("B"); 
            ll.add("C"); 
            ll.add("D"); 
            ll.add("E"); 
            System.out.println(ll); 
            ll.addFirst("X"); 
            ll.addLast("Y"); 
            System.out.println(ll); 
            ll.removeFirst(); 
            ll.removeLast(); 
            System.out.println(ll);
            System.out.println(ll.getFirst()); 
            System.out.println(ll.getLast()); 
        } 
     } 
     
     [A, B, C, D, E]
     [X, A, B, C, D, E, Y]
     [A, B, C, D, E]
     A
     E

# Cursors / Iterators in Collections:  

In java applications, when we pass Collection object reference variable as parameter to  
System.out.println(-) method, then, JVM will execute toString() method internally. Initially  
toString() method was implemented in java.lang.Object class, it was implemented in such  
a way that to return a String contains "Class_Name@Ref_val" . In java applications,  
Collection classes are not depending on Object class toString() method, they are having  
their own toString() method , which are implemented in such a way to return a String  
contains all the elements of the Collection object by enclosed with [].  

EX:  
ArrayList al = new ArrayList();  
al.add("A");  
al.add("B");  
al.add("C");  
al.add("D");  
System.out.println(al);  
OUTPUT: [A, B, C, D]  

As per the requirement, we don’t want to display all the Elements at a time on command  
prompt, we want to retrieve elements one by one individually from Collection objects and   
we want to display all the elements one by one on Command prompt.  
To achieve the above requirement, Collection Framework has provided the following  
three Cursors or Iterators.  

• Enumeration  
• Iterator  
• ListIterator  

## Enumeration:  

• It is a Legacy Cursor, it is applicable for only Legacy Collections to retrieve elements in one by one fashion.  

• To retrieve elements from Collections by using Enumeration we have to use the 
following steps.  

• Create Enumeration Object:  

To create Enumeration object we have to use the following method from Legacy Collections.  
public Enumeration elements()  

### Retrive Elements from Enumeration:  

• Check whether more elements are available or not from Current cursor position by using the following method.  

public boolean hasMoreElements()  

• It will return true value if at least next element is existed.  
• It will return false value if no element is existed from current cursor position.  
• If at least next element is existed then read next element and move cursor to next position by using the following method.  

 public Object nextElement()  
 
      import java.util.*; 
      class Test 
      { 
          public static void main(String[] args) 
          { 
                Vector v=new Vector(); 
                v.add("A"); 
                v.add("B"); 
                v.add("C"); 
                v.add("D"); 
                v.add("E"); 
                System.out.println(v); 
                Enumeration e=v.elements(); 
                while(e.hasMoreElements()) 
                { 
                System.out.println(e.nextElement()); 
                } 
          } 
      }
      [A, B, C, D, E]
      A
      B
      C
      D
      E
      
Drawbacks:   

• Enumeration is applicable for only Legacy Collections.  
• Enumeration is able to allow only read operation while iterating elements.  

## Iterator:  

• Iterator is an interface provided JAVA along with its JDK1.2 version.  
• Iterator can be used to retrieve all the elements from Collection objects in one by one fashion.  
• Iterator is applicable for all the Collection interface implementation classes to retrieve elements.  
• Iterator is able to allow both read and remove operations while iterating elements.  
• If we want to use Iterator in java applications then we have to use the following steps.  
• Create Iterator Object:   
• To create Iterator object we have to use the following method from all Collection implementation classes.  
• public Iterator iterator()  
• EX: Iterator it = al.iterator();  
• Retrive Elements from Iterator:  
• To retrieve elements from Iterator we have to use the following steps.  
• Check whether next element is existed or not from the current cursor position by using  
the following method  

public boolean hasNext()  
• This method will return true if next element is existed.  
• This method will return false if no element is existed from current cursor position.  
• If next element is existed then read next element and move cursor to next position by using the following method.  
• public Object next()  

NOTE: To remove an element available at current cursor position then we have to use the following method  
public void remove()  

       import java.util.*; 
       class Test 
       { 
           public static void main(String[] args) 
           { 
                 ArrayList al=new ArrayList(); 
                 al.add("A"); 
                 al.add("B"); 
                 al.add("C"); 
                 al.add("D"); 
                 al.add("E"); 
                 System.out.println(al); 
                 Iterator it=al.iterator(); 
                 while(it.hasNext()) 
                 { 
                    String element=(String)it.next(); 
                    System.out.println(element); 
                    if(element.equals("C")) 
                    { 
                       it.remove(); 
                    } 
                 } 
                 System.out.println(al); 
           } 
       } 
       
       [A, B, C, D, E]
       A
       B
       C
       D
       E
       [A, B, D, E]
       
## ListIterator:   
• It is an interface provided by JAVA along with JDK1.2 version.  
• It able to allow to read elements in both forward direction and backward direction.  
• It able to allow the operations like read, insert, replace and remove while iterating  
elements.  
• If we want to use ListIterator in java applications then we have to use the following 
steps.  

• Create ListIterator Object:  

• To create ListIterator object we have to use the following method.
• public ListIterator listIterator()  

• EX: ListIterator lit = ll.listIterator();  

• Retrieve Elements from ListIterator  

 To retrieve elements from ListIterator in Forward direction then we have to use the  
 following methods.  
 
public boolean hasNext()  

It will check whether next element is existed or not from the current cursor position.  

public Object next()  

It will return next element and it will move cursor to the next position in forward  
direction.  

public int nextIndex()  

It will return next index value from the current cursor position.  

To retrieve elements in Backward direction we have to use the following methods.  

public boolean hasPrevious()  

It will check whether previous element is existed or not from the current cursor position,  
If previous element is existed then it will return "true" value, if previous element is not  
existed then it will return false value.  

public Object previous()  

It will return previous element and it will move cursor to the next previous position.  

public int previousIndex()  

It will return previous index value from the current cursor position.  
To perform the operations like remove, insert and replace over the elements we have to  
use the following methods. 

• public void remove()  
• public void add(Object obj)  
• public void set(Object obj)  

       import java.util.*; 
       class Test 
       { 
            public static void main(String[] args) 
            { 
                 LinkedList ll=new LinkedList(); 
                 ll.add("A"); 
                 ll.add("B"); 
                 ll.add("C"); 
                 ll.add("D"); 
                 ll.add("E"); 
                 ll.add("F"); 
                 System.out.println(ll); 
                 ListIterator lit=ll.listIterator(); 
                 System.out.println("Elements in Forward Direction"); 
                 while(lit.hasNext()) 
                 { 
                 System.out.println(lit.nextIndex()+"--->"+lit.next()); 
                 } 
                 System.out.println(); 
                 System.out.println("Elements in Backward Direction"); 
                 while(lit.hasPrevious()) 
                 { 
                 System.out.println(lit.previousIndex()+"--->"+lit.previous()); 
                 } 
            } 
       } 

       [A, B, C, D, E, F]
       Elements in Forward Direction
       0--->A
       1--->B
       2--->C
       3--->D
       4--->E
       5--->F

       Elements in Backward Direction
       5--->F
       4--->E
       3--->D
       2--->C
       1--->B
       0--->A
       
-------------------------------------------------------------------------------------

        import java.util.*; 
        class Test1 
        { 
             public static void main(String[] args) 
             { 
               LinkedList ll=new LinkedList(); 
               ll.add("A"); 
               ll.add("B"); 
               ll.add("C"); 
               ll.add("D"); 
               ll.add("E"); 
               ll.add("F"); 
               System.out.println(ll); 
               ListIterator lit=ll.listIterator(); 
               while(lit.hasNext()) 
               { 
                  String element=(String)lit.next(); 
                  if(element.equals("B")) 
                  { 
                     lit.add("X"); 
                  } 
                  if(element.equals("D")) 
                  { 
                     lit.set("Y"); 
                  } 
                  if(element.equals("E")) 
                  { 
                     lit.remove(); 
                  } 
               } 
               System.out.println(ll); 
            } 
        }
        
        [A, B, C, D, E, F]
        [A, B, X, C, Y, F]
