//CollectionExample7

import java.util.*;
class Employee
{
	private int eid;
	private String name;
	
	Employee(int a,String b)
	{
		eid=a;
		name=b;
	}
	
	int getId()
	{
		return(eid);
	}
	String getName()
	{
		return(name);
	}
}
class CollectionExample7
{
	public static void main(String args[])
	{
			Scanner sc=new Scanner(System.in);
			Hashtable h=new Hashtable();
			int id,n;
			String nm;
			System.out.println("how many details you want to enter");
			n=sc.nextInt();
			Employee x[]=new Employee[n];
			
			for(int i=0;i<n;i++)
			{
				System.out.println("enter eid and name");
				id=sc.nextInt();
				nm=sc.next();
				
				x[i]=new Employee(id,nm);
				h.put(i,x[i]);
			}
			Set s=h.keySet();//return all key from Hashtable to set objects
			Iterator ir=s.iterator();
			while(ir.hasNext())
			{
				Object p=ir.next();
				Employee e=(Employee)h.get(p);
				System.out.println("Emp Id="+e.getId()+"  "+"Emp name="+e.getName());
			}
					
	}
}

