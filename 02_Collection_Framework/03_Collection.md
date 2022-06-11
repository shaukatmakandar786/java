# List: 
• List is a direct child interface to Collection interface  
• List was provided by JAVA along with its JDK1.2 version  
• List is index based, it able to arrange all the elements as per indexing.  
• List is able to allow duplicate elements.  
• List is following insertion order.  
• List is not following Sorting order.  
• List is able to allow any number of null values.  
• List is able to allow heterogeneous elements.  

List interface has provided the following methods common to all of its implementation 
classes.  

• public void add(int index, Object obj)  
 It able to add the specified element at the specified index value.  
 
• public Object set(int index, Object obj)  
 It able to set the specified element at the specified index value.  
 
Q) What is the difference between add(--) Method and set(--) Method?  

• add(--) method is able to perform insert operation. If any element is existed at the 
specified element then add() method will insert the specified new element at the 
specified index value and add() method will adjust the existed element to next index  

value. If no element is existed at the specified index then add() method add the   
specified element at the specified index.  

• set(--) method is able to perform replace operation. If any element is existed at the  
specified index then set() method will remove the existed element and set(-) method  
will add the specified element to the specified index and set() method will return the  
removed element. If no element is existed at the specified index value then set()  
method will rise an exception like java.lang.indexOutOfBoundsException.  

• public Object get(int index)  

 It will return an element available at the specified index value.  
 
• public Object remove(int index)  

 It will remove and return an element available at the specified index value.  
 
• public int indexOf(Object obj)  

 It will return an index value where the first occurrence of the specified element.  
 
• public int lastIndexOf(Object obj)  

 It will return an index value where the last occurrence of the specified element.  
 
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
                      al.add(1,"X"); 
                      System.out.println(al); 
                      al.add(6,"F"); 
                      System.out.println(al); 
                      al.set(3,"Y"); 
                      System.out.println(al); 
                      //al.set(7,"Z");--->IndexOutOfBoundsException
                      System.out.println(al.get(4)); 
                      System.out.println(al.remove(6)); 
                      System.out.println(al); 
                      al.add(6,"X"); 
                      al.add(7,"B"); 
                      al.add(8,"X"); 
                      System.out.println(al); 
                      System.out.println(al.indexOf("X")); 
                      System.out.println(al.lastIndexOf("X")); 
                  } 
            } 

            [A, B, C, D, E]
            [A, X, B, C, D, E]
            [A, X, B, C, D, E, F]
            [A, X, B, Y, D, E, F]
            D
            F
            [A, X, B, Y, D, E]
            [A, X, B, Y, D, E, X, B, X]
            1
            8  
        
ArrayList: 

• It was provided by JAVA along with JDK 1.2 version.  
• It is a direct implementation class to List interface.  
• It is index based.  
• It allows duplicate elements.  
• It follows insertion order.  
• It will not follow sorting order.  
• It allows heterogeneous elements.  
• It allows any number of null values.  
• Its internal data structure is "Resizable Array".  
• Its initial capacity is 10 elements.  
• Its incremental capacity ration is   
new_Capacity = (Current_Capacity*3/2)+1  
• It is best option for frequent retrieval operations.  
• It is not synchronized.  
• No method is synchronized method in ArrayList.  
• It allows more than one thread to access data.  
• It follows parallel execution.  
• It will reduce execution time.  
• It will improve application performance.  
• It will not give guarantee for data consistency.  
• It is not thread safe.  
• It is not Legacy Collection.  

## Constructors: 

• public ArrayList()  
 It can be used to create an empty ArrayList object with 10 elements as default capacity value.  
 
 EX: ArrayList al = new ArrayList();  
 
 • public ArrayList(int capacity)  
 It can be used to create an empty ArrayList object with the specified capacity.  
 
 EX: ArrayList al = new ArrayList(20);  
 
• public ArrayList(Collection c)  

 It can be used to create an ArrayList object with all the elements of the specified Collection object.  
  
        import java.util.*; 
        class Test 
        { 
           public static void main(String[] args) 
           { 
              ArrayList al1=new ArrayList(); 
              al1.add("AAA"); 
              al1.add("BBB"); 
              al1.add("CCC"); 
              al1.add("DDD"); 
              System.out.println(al1); 
              ArrayList al2=new ArrayList(al1); 
              System.out.println(al2); 
              } 
        } 
        OUTPUT: 
        [AAA,BBB,CCC,DDD]
        [AAA,BBB,CCC,DDD]


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
                 al.add("B"); 
                 System.out.println(al); 
                 al.add(new Integer(10)); 
                 System.out.println(al); 
                 al.add(null); 
                 al.add(null); 
                 System.out.println(al); 
            } 
        }
        
        [A, B, C, D, E]
        [A, B, C, D, E, B]
        [A, B, C, D, E, B, 10]
        [A, B, C, D, E, B, 10, null, null]
        
# Vector:   
• It was introduced in JDK1.0 version.  
• It is Legacy Collection.  
• It is a direct implementation class to List interface.  
• It is index based.  
• It allows duplicate elements.  
• It follows insertion order.  
• It will not follow sorting order.  
• It allows heterogeneous elements.  
• It allows any number of null values.  
• Its internal data structure is "Resizable Array".  
• Its initial capacity is 10 elements.  
• It is best choice for frequent retrieval operations.  
• It is not good for frequent insertions and deletion operations.  
• Its incremental capacity is double the current capacity.  
New_capacity = 2*Current_Capacity  
• It is synchronized elemenet.  
• All the methods of vector class are synchronized.  
• It allows only one thread at a time.  
• It follows sequential execution.  
• It will increase execution time.  
• It will reduce application performance.  
• It is giving guarantee for data consistency.  
• It is threadsafe.  

• public Vector()  

 It can be used to create an empty Vector object with the initial capacity 10 elements. 
 
 EX: Vector v = new Vector();  
 System.out.println(v.capacity());  
 OUTPUT: 10  
 
• public Vector(int capacity)  
 It can be used to create an empty vector object with the specified capacity value.  
 
 EX: Vector v = new Vector(20);  
 System.out.println(v.capacity());  
 OUTPUT: 20  
 
 • public Vector(int capacity, int incremental_Ratio)  
 
This constructor can be used to create an empty Vector object with the specified initial  
capacity and with the specified incremental ratio  

      import java.util.*; 
      class Test 
      { 
          public static void main(String[] args) 
          { 
              Vector v=new Vector(5,5); 
              System.out.println(v.capacity()); 
              for(int i=1;i<=6;i++) 
              { 
                   v.add(i); 
              } 
              System.out.println(v.capacity()); 
              for(int i=7;i<=11;i++) 
              { 
                   v.add(i); 
              } 
              System.out.println(v.capacity()); 
          } 
      } 
      
      OUTPUT:
      5
      10
      15

• public Vector(Collection c)  

 This constructor can be used to create Vector object with all the elements of the  
 specified Collection object.  

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
             System.out.println(v); 
             Vector v1=new Vector(v); 
             System.out.println(v1); 
          } 
       } 
       OUTPUT:
       [A,B,C,D]
       [A,B,C,D]
       
Methods:  
• public void addElement(Object obj)  

 It will add the specified element to Vector.  
 
• public Object firstElement()  

 It will return first element of the Vector.  
 
• public Object lastElement()  

 It will return last element of the Vector.  
 
• public Object elementAt(int index)  

 It will return an element available at the specified index.  
 
• public void removeElement(Object obj)  

It will remove the specified element from Vector.  

• public void removeElementAt(int index)  

 It will remove an element existed at the specified index value.  
 
• public void removeAllElements()  

 It will remove all elements from Vector.  
 
      import java.util.*; 
      class Test 
      { 
           public static void main(String[] args) 
           { 
                Vector v=new Vector(); 
                v.addElement("A"); 
                v.addElement("B"); 
                v.addElement("C"); 
                v.addElement("D"); 
                v.addElement("E"); 
                System.out.println(v); 
                System.out.println(v.firstElement()); 
                System.out.println(v.lastElement()); 
                System.out.println(v.elementAt(3)); 
                v.removeElement("D"); 
                System.out.println(v); 
                v.removeElementAt(2); 
                System.out.println(v); 
                v.removeAllElements(); 
                System.out.println(v); 
           }
       }
       
       [A, B, C, D, E]
       A
       E
       D
       [A, B, C, E]
       [A, B, E]
       []
