//synchronized keyword is nor working properly with Thread class
//where as it works with Runnable interface

class ThreadDemo implements Runnable
{
	public  void run()
	{
		synchronized(this){
		
			for(int i=1;i<=10;i++)
			{
				System.out.println("cpp"+i);
			}
		}
	}
	
}
class SyncBlockExample
{
	public static void main(String args[])
	{
			ThreadDemo x=new ThreadDemo();
			Thread t2=new Thread(x);
			Thread t1=new Thread(x);

			t1.start();
			t2.start();
	}
}