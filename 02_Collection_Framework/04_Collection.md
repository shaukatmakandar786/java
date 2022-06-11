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
 
