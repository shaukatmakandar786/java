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
