# Q) What Are The Differences Between Array And Collection?

• Arrays are having fixed size in nature. In case of arrays, we are able to add the 
elements up to the specified size only, we are unable to add the elements over its 
size, if we are trying to add elements over its size then JVM will rise an exception 
like "java.lang.ArrayIndexOutOfBoundsException".

EX: 
Student[] std=new Student[3];  
std[0]=new Student();  
std[1]=new Student();  
std[2]=new Student();  
std[3]=new Student();--> ArrayIndexOutOfBoundsException  

Collections are having dynamically growable nature, even if we add the elements over its  
size then JVM will not rise any exception.  

EX: 
ArrayList al=new ArrayList(3);  
al.add(new Student());  
al.add(new Student());  
al.add(new Student());  
al.add(new Student());--> No Exception  

• In Java, by default, Arrays are able to allow homogeneous elements, if we are  
trying to add the elements which are not same Array data type then Compiler will  
rise an error like "Incompatible Types".  

EX: 
Student[] std=new Student[3];  
std[0]=new Student();  
std[1]=new Student();  
std[2]=new Customer();--> Incompatible Types Error  

In Java, by default, Collections are able to allow heterogeneous elements, even we add  
different types of elements Compiler will not rise any error.  

EX: 
ArrayList al=new ArrayList(3);  
al.add(new Student());  
al.add(new Employee());---> No Error  
al.add(new Customer();----> No Error  

• Arrays are not having predefined methods to perform searching and sorting  
operations over the elements, in case of arrays to perform searching and sorting  
operations developers have to provide their own logic.  

In case of Collections, predefined methods or predefined Collections are defined to  
perform Searching and sorting operations over the elements.  
EX: In Collections, TreeSet was provided to perform sorting order.  

TreeSet ts=new TreeSet();  
ts.add("B");  
ts.add("E");  
ts.add("A");  
ts.add("D");  
ts.add("C");  
ts.add("F");  
System.out.println(ts);  

OUTPUT: [A,B,C,D,E,F]  

• Arrays are able to allow only one type of elements, so Arrays are able to improve   
Typedness in java applications and they are able to perform Type safe operations.  
Collections are able to allow different types of elements, so Collections are able to   
reduce typedness in java applications and they are unable to perform Type safe  
operations.  

• If we know the no of elements in advance at the time of writing java applications then   
Arrays are better to use in java applications and they will provide very good  
performance in java applications, but, But Arrays are not flexible to design  
applications.  

In java applications, Collections are able to provide less performance, but, they will  
provide flexibility to design applications.  
To represent Collection objects in java applications, JAVA has provided predefined  
classes and interfaces in the form of java.util package called as "Collection  
Framework".  
![CollectionFramework](https://github.com/shaukatmakandar786/Spring-notes-images/blob/main/coleectionFramework.png)

# Q) What are the differences between Collection and Map?  
 Collections are able to store all the elements individually, not in the form of Key-value pairs.  
 EX: To store 10 Employee objects we will use Collection.  

 Maps are able to store all the elements in the form of Key-value pairs.  
 EX: To represent Telephone Directory, where we are representing phone number and  
 Customer Name we have to use Maps. 
