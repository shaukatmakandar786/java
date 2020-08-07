/* create a HashTable that will maintain the mobile number and student 
name and display contact list */

import java.util.*;
class CollectionExample5
{
	public static void main(String args[])
	{
		Hashtable h1=new Hashtable();
		Scanner sc=new Scanner(System.in);
		int n,i;
		long mno;
		String name;
		
		System.out.println("how many details you want to enter");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("enter mobile number and name");
			mno=sc.nextInt();
			name=sc.next();
			
			h1.put(mno,name);
		}
		System.out.println(h1);
		
		Set s=h1.keySet();//return all key from Hashtable to set objects
		Iterator ir=s.iterator();
		while(ir.hasNext())
		{
			Object p=ir.next();
			System.out.println(p+"="+h1.get(p));
		}
		
	}
}
