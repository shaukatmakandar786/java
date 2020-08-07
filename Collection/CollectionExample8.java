//CollectionExample8
import java.util.*;

class Employee
{
	 int eid;
	 String name;
	
	Employee(int a,String b)
	{
		eid=a;
		name=b;
	}
	
	public String toString()
	{
		return("Emp Id="+eid+"  "+"Emp Name="+name);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		
		if(e1.eid<e2.eid)
		{
			return -1;
		}
		else
		{
			return 1;
		}

	}
}

class CollectionExample8
{
	public static void main(String args[])
	{
		ArrayList t=new ArrayList();
		t.add(new Employee(104,"shaukat"));
		t.add(new Employee(103,"asif"));
		t.add(new Employee(101,"azim"));
		t.add(new Employee(102,"zakir"));
		System.out.println("display before sorting");
		System.out.println(t);
		Collections.sort(t,new MyComparator());
		System.out.println("display after sorting");
		System.out.println(t);



	}
}
