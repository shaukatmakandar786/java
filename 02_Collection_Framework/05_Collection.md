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

# TreeSet:  
• It was introduced in JDK 1.2 version.  
• It is not Legacy Collection.  
• It has provided implementation for Collection, Set, SortedSet and NavigableSet  
interfaces.  
• It is not index based.  
• It is not allowing duplicate elements.  
• It is not following insertion order.  
• It follows Sorting order.  
• It allows only homogeneous elements.  
• It will not allow heterogeneous elements, if we are trying to add heterogeneous  
elements then JVM will rise an exception like java.lang.ClasscastException.  
• It will not allow null values, if we are trying to add any null value then JVM will rise an  
exception like java.lang.NullPointerException.  
• It able to allow only Comparable objects by default, if we are trying to add non  
comparable objects then JVM will rise an exception like  
java.lang.ClassCastException.  

NOTE: If we are trying to add non comparable objects then we have to use  
java.util.Comparator. 
• Its internal data structure is "Balanced Tree".  
• It is mainly for frequent search operations.  

## Constructors: 

• public TreeSet()  
 It can be used to create an Empty TreeSet object.  
 EX: TreeSet ts = new TreeSet();  
 
• public TreeSet(Comparator c)  
It will create an empty TreeSet object with the explicit Sorting mechanism in the form  
of Comparator  
EX: TreeSet ts = new TreeSet(new MyComparator());  

• public TreeSet(SortedSet ts)  
 It will create TreeSet object with all elements of the specified SortedSet  
 
 
        import java.util.*; 
        class Test 
        { 
              public static void main(String[] args) 
              { 
                  TreeSet ts1=new TreeSet(); 
                  ts1.add("B"); 
                  ts1.add("C"); 
                  ts1.add("F"); 
                  ts1.add("A"); 
                  ts1.add("E"); 
                  ts1.add("D"); 
                  System.out.println(ts1); 
                  TreeSet ts2=new TreeSet(ts1); 
                  System.out.println(ts2); 
              } 
        } 
        
        [A, B, C, D, E, F]
        [A, B, C, D, E, F]
----------------------------------------------------------------------------------------
• public TreeSet(Collection c)  

 It able to create TreeSet object with all the elements of the specified Collectio
 

          import java.util.*; 
          class Test 
          { 
                public static void main(String[] args) 
                { 
                    ArrayList al=new ArrayList(); 
                    al.add("B"); 
                    al.add("C"); 
                    al.add("F"); 
                    al.add("A"); 
                    al.add("E"); 
                    al.add("D"); 
                    System.out.println(al); 
                    TreeSet ts=new TreeSet(al); 
                    System.out.println(ts); 
                } 
          }
          
          [B, C, F, A, E, D]
          [A, B, C, D, E, F]
          
-------------------------------------------------------------------------------------------


            import java.util.*; 
            class Test 
            { 
                  public static void main(String[] args) 
                  { 
                          TreeSet ts=new TreeSet(); 
                          ts.add("B"); 
                          ts.add("C"); 
                          ts.add("F"); 
                          ts.add("A"); 
                          ts.add("E"); 
                          ts.add("D"); 
                          System.out.println(ts); 
                          ts.add("B"); 
                          System.out.println(ts); 
                          //ts.add(null);--> NullPointerException 
                          //ts.add(new Integer(10));-->ClassCastException 
                          //ts.add(new StringBuffer("BBB"));->ClassCastException 
                  } 
            } 

When we add elements to the TreeSet object, TreeSet object will arrange all the elements  
in a particular sorting order with the following algorithm.  
• TreeSet will construct a Tree [Balanced Tree] on the basis of the elements  

 To construct Balanced Tree we have to use the following steps.  
• If the element is first element to the TreeSet object then make that element as "Root Node".  
• If the element is not first element then access compareTo(--) method over the   
present element by passing previous elements one by one of the balanced Tree   
right from root node until the present element is located in Tree.  

          • If compareTo(-) method returns -ve value then go to left child of the present  
          node and access again compareTo(-) method by passing left child. If no left  
          child is existed then make the present element as left child  

          • If compareTo(-) method returns +ve value then go to right child and access  
          again compareTo(-) by passing right as parameter. If no right child is existed   
          then make the present element as right child.  

          • If compareTo(-) method return 0 value then discard the present element and  
          declare that the present element is a duplicate element of the existed element.  
  
• TreeSet will retrieve all the elements from balanced Tree by following in order traversal.  
In String class, compareTo(-) method was implemented like below str1.compareTo(str2);  

          • If str1 come first when compared with str2 as per dictionary order then 
          compareTo() method will return -ve value.
          • If str2 come first when compared with str1 in dictionary order then compareTo() 
          method will return +ve value.
          • If str1 and str2 are same or available at same location in dictionary order then 
          compareTo(-) method will return 0 value.
          
If we want to add user defined elements like Employee, Student, Customer to TreeSet   
then we have to use the following steps.  
• Declare an user defined class.  
• Implement java.lang.Comparable iterface in User defined class.   
• Provide implementation for compareTo(-) method in user defined class.   
• In main class, in main() method, create objects for user defined class and add objects  
to TreeSet object.  

EX sort by student name as ascending order using Comparable

            import java.util.TreeSet;

            class Student implements Comparable
            {
                private int rno;
                private String name;
                private float per;

                @Override
                public String toString() {
                    return "Student{" +
                            "rno=" + rno +
                            ", name='" + name + '\'' +
                            ", per=" + per +
                            '}';
                }

                public Student() {
                }

                public Student(int rno, String name, float per) {
                    this.rno = rno;
                    this.name = name;
                    this.per = per;
                }

                @Override
                public int compareTo(Object o) {

                    Student s=(Student)o;
                    int i = this.name.compareTo(s.name);
                    if(i==-1)
                     return i;
                    else if(i==1)
                        return i;
                    else
                        return i;
                }
            }

            public class ComparableExample {

                public static void main(String[] args) {


                    Student s1=new Student(101,"CCCC",70.76f);
                    Student s2=new Student(102,"BBBB",65.76f);
                    Student s3=new Student(103,"AAAA",56.76f);

                    TreeSet t1=new TreeSet();
                    t1.add(s1);
                    t1.add(s2);
                    t1.add(s3);

                    System.out.println(t1);
                }

            }
            
            [Student{rno=103, name='AAAA', per=56.76}, Student{rno=102, name='BBBB', per=65.76}, Student{rno=101, name='CCCC', per=70.76}]
            
            
EX sort by student name as decending order using Comparable

            @Override
            public int compareTo(Object o) {

                Student s=(Student)o;
                int i = this.name.compareTo(s.name);
                if(i==-1)
                 return 1;
                else
                    return 1;
            }
            
EX sort student whos has max lenght charecter in his name using Comparable

            import java.util.TreeSet;

            class Student implements Comparable
            {
                private int rno;
                private String name;
                private float per;

                @Override
                public String toString() {
                    return "Student{" +
                            "rno=" + rno +
                            ", name='" + name + '\'' +
                            ", per=" + per +
                            '}';
                }

                public Student() {
                }

                public Student(int rno, String name, float per) {
                    this.rno = rno;
                    this.name = name;
                    this.per = per;
                }

                @Override
                public int compareTo(Object o) {

                    Student s=(Student)o;
                    int len1=this.name.length();
                    int len2 = s.name.length();

                    if(len1<len2)
                        return 1;
                    else
                        return -1;

                }
            }

            public class ComparableExample {

                public static void main(String[] args) {


                    Student s1=new Student(101,"CCCCCCCCC",70.76f);
                    Student s2=new Student(102,"BBBB",65.76f);
                    Student s3=new Student(103,"AAAAAAA",56.76f);

                    TreeSet t1=new TreeSet();
                    t1.add(s1);
                    t1.add(s2);
                    t1.add(s3);

                    System.out.println(t1);
                }
            }

            [Student{rno=101, name='CCCCCCCCC', per=70.76}, Student{rno=103, name='AAAAAAA', per=56.76}, Student{rno=102, name='BBBB', per=65.76}]

            
If we add non-comparable objects to TreeSet object then JVM will rise an exception like  
java.lang.ClassCastException, because, Non-Comparable objects are not providing  
compareTo(-) method internally, but, it is required to the TreeSet inorder to provide  
sorting order over elements.  

If we want to add non-Comparable objects to TreeSet object then we must provide sorting  
logic to TreeSet object explicitly, for this, we have to use java.util.Comparator interface.  
If we want to use Comparator interface in java applications then we have to use the  
following steps.            

• Declare an User defined class.  
• Implement java.util.Comparator interface in user defined class.  
• Provide implementation for Comparator interface methods in user defined class.  

     public boolean equals(Object obj)
     public int compare(Object obj1, Object obj2)
     
Note: In User defined class it is not required to implement equals(-) method, because,  
equals(-) method will come from default super class Object.     

• Provide User defined Comparator object to TreeSet object  
 EX: MyComparator mc = new MyComparator();  
 TreeSet ts = new TreeSet(mc);  
 
 
