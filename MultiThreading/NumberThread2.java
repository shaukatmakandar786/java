import java.util.*;

class Display
{
	boolean flag=true;
	
	public synchronized void first(String msg)
	{

		if(flag)
		{
			try{
				this.wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println(msg);
		flag=true;
		notify();

			
	}
	public synchronized void second(String msg)
	{
		
		if(!flag)
		{
			try{
				this.wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println(msg);
		flag=false;
		notify();
		
	}
}
class T1 extends Thread
{
	Display d1;
	String s;
	int n;
	T1(Display d,String s,int n)
	{
		d1=d;
		this.s=s;
		this.n=n;
		
	}
	public void run()
	{
		for(int i=1;i<=n;i++)
		{
			d1.first(s);
		}
	}
}

class T2 extends Thread
{
	Display d1;
	String s;
	int n;
	T2(Display d,String s,int n)
	{
		d1=d;
		this.s=s;
		this.n=n;
		
	}
	public void run()
	{
		for(int i=1;i<=n;i++)
		{
			d1.second(s);
		}
	}
}

class NumberThread2
{
	public static void main(String args[])
	{
		Display x=new Display();
		T1 z=new T1(x,"dhoni",10);
		T2 y=new T2(x,"virat",10);
		
		y.start();
		z.start();
	}
}

