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