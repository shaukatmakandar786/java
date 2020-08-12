
class ThreadDemo implements Runnable
{
	public  void run()
	{
		synchronized(this){
		
			System.out.println("cpp");
			try
			{
				this.wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println("java");

		}
	}
	
}
class WaitNotifyExample
{
	public static void main(String args[])
	{
			ThreadDemo x=new ThreadDemo();
			
			Thread t1=new Thread(x);

			t1.start();
			try{
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			synchronized(x)
			{
				x.notify();
			}
	}
}