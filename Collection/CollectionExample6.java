/*write a java program to read n Integer into ArrayList collection  and
sort the elements in decending order (use comparator) */

import java.util.*;

class CollectionExample6
{
	
	public static void main(String args[])
	{
		ArrayList li=new ArrayList();
		
		li.add(56);
		li.add(23);
		li.add(44);
		li.add(35);
		
		System.out.println(li);
		
		Collections.sort(li,new MyComparator());
		
		System.out.println(li);

		Iterator ir=li.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
	}
}
class MyComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;

		if(i1>i2)
		{
			return -1;
		}
		else 
		{
			return 1;
		}
	}
}
