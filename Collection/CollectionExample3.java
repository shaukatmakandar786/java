/* write a program accept n integers from the users and display integers
sorted order.The Collection should not accept duplicate elements */

import java.util.*;
class CollectionExample3
{
	public static void main(String args[])
	{
		TreeSet t=new TreeSet();
		Scanner sc=new Scanner(System.in);
		int n,i;
		int no;
		
		System.out.println("how many numbers you want to enter");
		n=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			System.out.println("enter a number");
			no=sc.nextInt();
			
			t.add(no);
		}
		System.out.println("display elements in sorted order");
		Iterator ir=t.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
	}
}
