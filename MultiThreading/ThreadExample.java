//thread priority concept is not working in my computer.i dont know why
class ThreadDemo implements Runnable{
	
	public synchronized void run(){
		
		Thread t=Thread.currentThread();
		int i=t.getPriority();
		String name=t.getName();
		
		System.out.println("Thread Name:="+name);
		System.out.println("Thread Priority:="+i);
	}
}

class ThreadExample
{
	public static void main(String[] args)
	{
		
		ThreadDemo x=new ThreadDemo();
		
		Thread t1=new Thread(x);
		Thread t2=new Thread(x);
		
		t1.setName("MacTech.com");
		t2.setName("Real Academy");
		
		t1.setPriority(1);
		t2.setPriority(10);
		
		
		t1.start();
		t2.start();
		
		
		//Thread.currentThread().setName("MacTech.com");
		
		//System.out.println(10/0);
	}
}