# Collection:

• It is an interface provided by JAVA along with JDK 1.2 version.  
• It able to represent a group of individual elements as single unit.  
• It has provided the following methods common to every implementation class.  

1. public boolean add(Object obj)  

This method is able to add the specified element to Collection object. If the specified 
element is added successfully then add(-) method will return "true" value. If the specified 
element is not added successfully then add() method will return "false" value.

    import java.util.*;
    public class Test
    {
        public static void main(String args[])
        {
               HashSet hs=new HashSet(); 
               System.out.println(hs.add("A")); 
               hs.add("B"); 
               hs.add("C"); 
               hs.add("D"); 
               System.out.println(hs); 
               System.out.println(hs.add("A")); 
               System.out.println(hs);
        }
    }
    
    OUTPUT: 
    true
    [A,B,C,D]
    false
    [A,B,C,D
    
2. public boolean addAll(Collection c)  

This method can be used to add all the elements of the specified Collection to the present  
Collection object. If addition operation is success then addAll(-) method will return "true"  
value, if addition operation is failure then addAll() method will return "false" value.  

        import java.util.*;
        public class Test
        {
            public static void main(String args[])
            {
                   HashSet hs=new HashSet(); 
                   hs.add("A"); 
                   hs.add("B"); 
                   hs.add("C"); 
                   hs.add("D"); 
                   System.out.println(hs); 
                   System.out.println(hs.add("A")); 
                   System.out.println(hs);
                   HashSet hs1=new HashSet(); 
                   System.out.println(hs1.addAll(hs)); 
                   System.out.println(hs1); 
                   System.out.println(hs1.addAll(hs)); 
                   System.out.println(hs1);
            }
        }
        
        [D,A,B,C]
        true
        [D,A,B,C]
        false
        [D,A,B,C]

3. public boolean remove(Object obj)  

This method can be used to remove the specified element from the Collection object.If  
remove operation is success then remove() method will return true value, if remove   
operation is failure then remove() method will return false value.  

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
                        System.out.println(al); 
                        System.out.println(al.remove("B")); 
                        System.out.println(al); 
                        System.out.println(al.remove("B")); 
                        System.out.println(al); 
                } 
        } 
        
        OUTPUT:
        [A,B,C,D]
        true
        [A,C,D]
        false
        [A,C,D]
        
4. public boolean removeAll(Collection c)  

This method can be used to remove all the elements of the specified Collection from   
the present Collection object. If remove operation is success then removeAll() method   
will return true value. If remove operation is not success then removeAll() method will  
return false value.        

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
                        al.add("F"); 
                        System.out.println(al); 
                        ArrayList al1=new ArrayList(); 
                        al1.add("B"); 
                        al1.add("C"); 
                        al1.add("D"); 
                        System.out.println(al1); 
                        System.out.println(al.removeAll(al1)); 
                        System.out.println(al); 
                        System.out.println(al.removeAll(al1)); 
                        System.out.println(al); 
                } 
        }

        OUTPUT: 
        [A,B,C,D,E,F]
        [B,C,D]
        true
        [A,E,F]
        false
        [A,E,F]
        
5. public boolean contains(Object obj)

This method will check whether the specified element is existed or not in the  
Collection object. If the specified element is existed then this method will return  
"true" value. If the specified element is not existed then this method will return  
"false" value.        

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
                        al.add("F"); 
                        System.out.println(al); 
                        System.out.println(al.contains("B")); 
                        System.out.println(al.contains("X")); 
                } 
        } 
        OUTPUT: 
        [A,B,C,D,E,F]
        true
        false
        
6. public boolean containsAll(Collection c)  
This method will check whether all the elements of the specified Collection are  
available or not in the present Collection object. If all the elements are existed then   
containsAll() method will return true value, if atleast one element is not existed then  
containsAll() method will return false value.      

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
                        al.add("F"); 
                        System.out.println(al); 
                        ArrayList al1=new ArrayList(); 
                        al1.add("B"); 
                        al1.add("C"); 
                        al1.add("D"); 
                        System.out.println(al.containsAll(al1)); 
                        al1.add("X"); 
                        al1.add("Y"); 
                        System.out.println(al.containsAll(al1)); 
                } 
        } 
        OUTPUT: 
        [A,B,C,D,E,F]
        true
        false

7. public boolean retainAll(Collection c)  
This method will remove all the elements from the present Collection object except  
the elements which are existed in the specified Collection object. If at least one  
element is removed then retainAll() method will return true value. If no elements are   
removed then retainsAll() method will return false value.  

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
                        al.add("F"); 
                        System.out.println(al); 
                        ArrayList al1=new ArrayList(); 
                        al1.add("B"); 
                        al1.add("C"); 
                        al1.add("D"); 
                        System.out.println(al1); 
                        System.out.println(al.retainAll(al1)); 
                        System.out.println(al); 
                        System.out.println(al.retainAll(al1)); 
                        System.out.println(al); 
                }
        } 
        OUTPUT: 
        [A,B,C,D,E,F]
        [B,C,D]
        true
        [B,C,D]
        false
        [B,C,D
