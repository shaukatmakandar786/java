/* write a java program to create LinkedList and traverse it backwadrs*/

import java.util.*;

class CollectionExample4
{
	public static void main(String args[])
	{
		LinkedList li=new LinkedList();
		Scanner sc=new Scanner(System.in);
		int i,n,no;
		
		System.out.println("how many numbers you want to enter");
		n=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			System.out.println("enter no");
			no=sc.nextInt();
			
			li.add(no);
		}
		System.out.println("Normal Traversing");
		ListIterator it=li.listIterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("BackWard Traversing");

		
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
	}
}
