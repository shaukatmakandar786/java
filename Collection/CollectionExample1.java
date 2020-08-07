/*
write a program to create a linkedList of four integers objects and do the 
following operations

1) Add elements at first possition
2) Delete last element
*/

import java.util.*;

class CollectionExample1 
{
	public static void main(String args[])
	{
		LinkedList li=new LinkedList();
		li.add("one");
		li.add("two");
		li.add("three");
		li.add("four");
		
		System.out.println(li);
		
		li.addFirst("five");
		
		System.out.println(li);

		li.removeLast();

		System.out.println(li);
		
		
	}
}
