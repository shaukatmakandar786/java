/* write a java program to reads n city names and stored them into 
ArrayList ,display the elements of collection in sorted order   */

import java.util.*;

class CollectionExample2
{
	public static void main(String args[])
	{
		ArrayList al=new ArrayList();
		Scanner sc=new Scanner(System.in);
		int n,i;
		String city;
		
		System.out.println("how many details you want to enter");
		n=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			System.out.println("enter city name");
			city=sc.next();
			
			al.add(city);
		}
		System.out.println("display before sorting");
		Iterator ir=al.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
	//	TreeSet t=new TreeSet(al);
	
		Collections.sort(al);
		
		System.out.println("display after sorting");

		Iterator irt=al.iterator();
		
		while(irt.hasNext())
		{
			System.out.println(irt.next());
		}
		
	}
	
}	
