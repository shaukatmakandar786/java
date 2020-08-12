

import java.util.*;
class NumberThread1 implements Runnable
{

	static int a,b;
	public void run()
	{
		Thread t=Thread.currentThread();
		
		String name=t.getName();
		

		if(name.equals("addition"))
		{
			add();
		}
		else if(name.equals("multiplication"))
		{
			mul();
		}
			
	}
	void add()
	{
		System.out.println("Addition:="+(a+b));
	}
	void mul()
	{
		System.out.println("Addition:="+(a*b));
	}
	
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");

		a=sc.nextInt();
		b=sc.nextInt();
		
		NumberThread x=new NumberThread();
		Thread t1=new Thread(x);
		Thread t2=new Thread(x);
		
		t1.setName("addition");
		t2.setName("multiplication");
		
		t1.start();
		t2.start();
	}
	
	
}