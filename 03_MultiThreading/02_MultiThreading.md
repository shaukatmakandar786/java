# Thread Class Metods:

1. public void setName(String name)  
--> It can be used to provide a particular name to the Thread.  

2. public String getName()  
--> It can be used to get the present name of the Thread.  

EX:

      public class Test {
        public static void main(String[] args) {
          Thread t = new Thread();
          System.out.println(t.getName());//Thread-0
          t.setName("Core Java");
          System.out.println(t.getName());//Core Java
        }
      }

3. public void setPriority(int priorityValue)  
--> It can be used to set a particular Priority Value to the Thread.  

Note: In Java applications, every thread will have a particular priority value and that priority values must be from 1 to 10. In the case of setPriority()  
method we must provide the priorityValue inbetween 1 and 10, if we provide priorityValu in out side of 1 to 10 range then  
JVM will raise an Exception like "java.lang.IllegalArgumentException".  

In Java , to represent Thread Priority values , java.lang.Thread class has provided the following constants.  
	public static final int MIN_PRIORITY = 1;  
	public static final int NORM_PRIOITY = 5;  
	public static final int MAX_PRIORITY = 10;  

4. public int getPriority()  
--> It can be used to get the current priority value of the Thread.  

EX:  

			      public class Test {
				public static void main(String[] args) {
				  Thread t = new Thread();
				  System.out.println(t.getPriority());//5
				  t.setPriority(3);
				  System.out.println(t.getPriority());//3
				  t.setPriority(Thread.MAX_PRIORITY-3);
				  System.out.println(t.getPriority());//7
				  t.setPriority(Thread.MIN_PRIORITY+Thread.NORM_PRIORITY);
				  System.out.println(t.getPriority());//6

				}
			      }

EX:  

    public class Test {
      public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t.getPriority());
        //t.setPriority(15);-->IllegalArgumentException
        //t.setPriority(-10);->IllegalArgumentException
        //t.setPriority(0);-->IllegalArgumentException
        System.out.println(t.getPriority());
      }
    }

5. public static int activeCount()  
--> It can be used to get the no of threads which are in active at present in our Java application.  
Note: In Java applications, if we create a thread class object then the created thread is not active, when we access sdtart() method then only  
Thread will come active state.  

EX:  

      public class Test {
        public static void main(String[] args) {
          System.out.println(Thread.activeCount());//1
          Thread t1 = new Thread();
          t1.start();
          System.out.println(Thread.activeCount());//<=2
          Thread t2 = new Thread();
          t2.start();
          System.out.println(Thread.activeCount());//<=3
          Thread t3 = new Thread();
          t3.start();
          System.out.println(Thread.activeCount());//<=4
        }
      }

6. public boolean isAlive()  
--> It can be used to check whether a thared is in live[Active] or not. If the thread is in active state then isAlive() method will return 'true' value,  
if the thread is not in active then isAlive() method will return 'false' value.  

Note: In Java applications, when we create Thread class object then the generated Thread is not in active, when we access start() method over the thread  
reference then only the generated thread will be in active.  
EX:  

      public class Test {
        public static void main(String[] args) {
          Thread t = new Thread();
          System.out.println(t.isAlive());
          t.start();
          for(int i = 0; i < 100; i++) {
            System.out.println(t.isAlive()+" ");
          }
        }
      }

7. public static Thread currentThread()  
--> It can be used to get a Thread object which is executing the present instruction in Java applications.  
EX:  

        class A{
          void m1() {
            for(int i = 0; i < 10; i++) {
              System.out.println(Thread.currentThread().getName());
            }
          }
        }
        class Thread1 extends Thread{
          A a;
          Thread1(A a){
            this.a = a;
          }
          public void run() {
            a.m1();
          }
        }
        class Thread2 extends Thread{
          A a;
          Thread2(A a){
            this.a = a;
          }
          public void run() {
            a.m1();
          }
        }
        class Thread3 extends Thread{
          A a;
          Thread3(A a){
            this.a = a;
          }
          public void run() {
            a.m1();
          }
        }
        public class Test {
          public static void main(String[] args) {
            A a = new A();

            Thread1 t1 = new Thread1(a);
            Thread2 t2 = new Thread2(a);
            Thread3 t3 = new Thread3(a);

            t1.setName("AAA");
            t2.setName("BBB");
            t3.setName("CCC");

            t1.start();
            t2.start();
            t3.start();
          }
        }

EX:  

    class MyThread extends Thread{
      public void run() {
        for(int i = 0; i < 10; i++) {
          System.out.println(Thread.currentThread().getName());
        }
      }
    }
    public class Test {
      public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        MyThread mt3 = new MyThread();

        mt1.setName("AAA");
        mt2.setName("BBB");
        mt3.setName("CCC");

        mt1.start();
        mt2.start();
        mt3.start();
      }
    }
    
8. public static void sleep(ling time)throws InterruptedException  
--> It can be used to keep a running thread into sleep state untill the specified sleep time, if the sleep time is completed then the sleeping thread will   
come to active state automatically and continous its execution time.  

EX:  

      class WelcomeThread extends Thread{
        public void run() {
          for(int i = 0;i < 10; i++) {
            try {
              Thread.sleep(1000);
              System.out.println("Welcome To Durgasoft");
            } catch (InterruptedException e) {				
              e.printStackTrace();
            }			
          }
        }
      }
      public class Test {
        public static void main(String[] args) {
          WelcomeThread wt = new WelcomeThread();
          wt.start();
        }
      }

9. public void join()throws InterruptedException  
--> This method can be used to pass present [Main Thread] to Complete another thread, after completion of other thread automatically thepased thread will  
continue its execution part.  

EX:  

      class WelcomeThread extends Thread{
        public void run() {
          for(int i = 0; i < 10; i++) {
            System.out.println("WelcomeThread : "+i);
          }
        }
      }
      public class Test {
        public static void main(String[] args)throws Exception {
          WelcomeThread wt = new WelcomeThread();
          wt.start();
          wt.join();
          for(int i = 0; i < 10; i++) {
            System.out.println("MainThread    : "+i);
          }
        }
      }

# Daemon Threads:  

Daemon Thread is a thread running internally and providing services to some other thread, Damon threads will be terminated automatically when the threads  
which are taking services from daemon threads are terminated.  
EX: Garbage Collector inside JVM is Daemon Thread.  

When we start JVM to execute a particular Java Application, internally, Garbage Collector will be executed and it is providing Garbage Collection service  
to JVM, where Garbage Collector thread will be terminated automatically when JVM thread is terminated.  
   
In Java applications, to make a thread as daemon thread we must use the following method.  

  public void setDaemon(boolean b)  
  --> if b value is true then the thread will be   
      daemon thread.  
  --> If b value is false then the thread will not be  
      daemon thread.  

Note: If we want to make a thread as daemon thread then we have to access setDamon(true) method before accessing start() method, because, once if we start a thread then it will not allow to change its state, if we access setDamon(true) method after acessing start() method then JVM will raise an exception like "java.lang.IllegalThreadStateException".  

To check whether a thread is daemon thread or not we have to use the following method .  

   public boolean isDaemon()  
   
EX:  

		class GarbageCollector extends Thread{
			public void run() {
				while(true) {
					System.out.println("Garbage Collector Thread");
				}
			}
		}
		public class Test {
			public static void main(String[] args){
				GarbageCollector gc = new GarbageCollector();

				gc.start();
				gc.setDaemon(true);
				for(int i = 0; i < 10; i++) {
					System.out.println("JVM Thread");
				}
				System.out.println(gc.isDaemon());
			}
		}

# Concurrent Threads:  

In Multi Threadding, we may create more than one thread and we may execute more than one thread at a time.  

If we execute more than one thread on single data item or on single program then that threads are called as "Concurrent Threads" and that process is  
called as "Threads Concurrency".  

In the case of Threads concurrncy there may be chances are available to get Data Inconsistency, it will provide wrong results in Java applications.  

To overcome the above problems we need "Threadsafe" resources.  

If any resource allows more than one thread at a time with out providing data inconsistency then that resource is called as "Threadsafe Resource".  
 
If we want to make a resource as threadsafe resource then we have to use the following approaches.  
1. Use Local Variables Over Instance Variable.  
2. Use Immutable Objects Over Mutable Objects.  
3. Use Synchronization.  
-----  
-----  

1. Use Local Variables Over Instance Variable:  

In Java applications, if we declare any variable inside a method then that variable is called as Local Variable.  

In Java applications, Local variables data will be stored in Stack memory.  

If we create multiple threads in java applications then a seperate stack will be created in stack memory for each and every thread.  
 
If any thread access the local variable of a method then the respective local variable value will be stored in the threads respective stack only.  

If multiple threads access the same local variable then multiple copies of the respective local variable will be stored in threads respective stacks.  
 
If any thread performs modification on local variable then that modification is available upto the threads respective stack only, one thread modifification   
is not available to other threads.  
 
 
If we declare any non static variable at class level then that variable is called as an instance variable.  

In java applications, instance variables data will be stored inside the objects in heap memory.  

In general, Heap memory objects are shared objects for multiple threads, all the threads can access data, it may provide data inconsistency.  

EX:  

			class A{
				int i = 10;
				void increment() {
					i = i + 10;
					System.out.println(Thread.currentThread()+" : "+i);
				}
			}
			class Thread1 extends Thread{
				A a;
				Thread1(A a){
					this.a = a;
				}
				public void run() {
					a.increment();
				}
			}
			class Thread2 extends Thread{
				A a;
				Thread2(A a){
					this.a = a;
				}
				public void run() {
					a.increment();
				}
			}
			public class Test {
				public static void main(String[] args){
					A a = new A();
					Thread1 t1 = new Thread1(a);
					Thread2 t2 = new Thread2(a);
					t1.start();
					t2.start();
				}
			}

EX:  

		class A{
			void increment() {
				int i = 10;
				i = i + 10;
				System.out.println(Thread.currentThread().getName()+" : "+i);
			}
		}
		class Thread1 extends Thread{
			A a;
			Thread1(A a){
				this.a = a;
			}
			public void run() {
				a.increment();
			}
		}
		class Thread2 extends Thread{
			A a;
			Thread2(A a){
				this.a = a;
			}
			public void run() {
				a.increment();
			}
		}
		public class Test {
			public static void main(String[] args){
				A a = new A();
				Thread1 t1 = new Thread1(a);
				Thread2 t2 = new Thread2(a);

				t1.setName("Thread-1");
				t2.setName("Thread-2");
				t1.start();
				t2.start();
			}
		}

EX:


		class A{
			int i = 10;
			void increment() {
				int j = 10;

				i = i + 10;
				j = j + 10;

				System.out.println(Thread.currentThread().getName()+" : Instance Variable : "+i);
				System.out.println(Thread.currentThread().getName()+" : Local Variable    : "+j);

			}
		}
		class Thread1 extends Thread{
			A a;
			Thread1(A a){
				this.a = a;
			}
			public void run() {
				a.increment();
			}
		}
		class Thread2 extends Thread{
			A a;
			Thread2(A a){
				this.a = a;
			}
			public void run() {
				a.increment();
			}
		}
		public class Test {
			public static void main(String[] args){
				A a = new A();

				Thread1 t1 = new Thread1(a);
				Thread2 t2 = new Thread2(a);

				t1.setName("Thread-1");
				t2.setName("Thread-2");

				t1.start();
				t2.start();
			}
		}

2. Use Immutable Objects Over Mutable Objects:  

Mutable Object is a Java object, it allows modifications on its content directly.  
EX: StringBuffer   

If we submit multiple threads on single SingBuffer object to perform modifications then all the threads modifications are allowed in the same object,  
it will override one thread modifications with another thread modifications, it will provide data inconsistency, it will not make the respective resource as Threadsafe.  

EX:  

		class A{
			StringBuffer sb = new StringBuffer("Durga");
			void add() {
				sb = sb.append("soft");
				System.out.println(Thread.currentThread()+" : "+sb);
			}
		}

		class Thread1 extends Thread{
			A a;
			Thread1(A a){
				this.a = a;
			}
			public void run() {
				a.add();
			}
		}

		class Thread2 extends Thread{
			A a;
			Thread2(A a){
				this.a = a;
			}
			public void run() {
				a.add();
			}
		}
		public class Test {
			public static void main(String[] args) {
				A a = new A();
				Thread1 t1 = new Thread1(a);
				Thread2 t2 = new Thread2(a);
				t1.start();
				t2.start();
			}
		}

Immutable Objects are normal Java objects, they will not allow modifications on their content, if we are trying to perform modifications on its content then data is 

allowed for modifications but the resultent modified data will not be stored back in original object , where the resultent modified data will be stored by creating new Object.  

EX: 
String class objects are Immutable objects.  
All Wrapper Classes Objects are Immutable.  
	
In Java applications, if we submit more than one thread on single String object [Immutable Object] and if more than one thread is performing modifications  
on single immutable object content, then, at each and every modification a seperate new String object will be created , where new modified data will be  
stored, old Object data is remains same , this approach will not allow overriding one thread modifications with another thread modifications, this approach will   provide data consistency, it will make the resource as Threadsafe resource.  

EX:  

	class A{
		String str1 = new String("Durga");

		void add() {
			String str2 = str1.concat("soft");
			System.out.println(Thread.currentThread().getName()+" : "+str2);
		}
	}
	class Thread1 extends Thread{
		A a;
		Thread1(A a){
			this.a = a;
		}
		public void run() {
			a.add();
		}
	}
	class Thread2 extends Thread{
		A a;
		Thread2(A a){
			this.a = a;
		}
		public void run() {
			a.add();
		}
	}
	public class Test {
		public static void main(String[] args) {
			A a = new A();
			Thread1 t1 = new Thread1(a);
			Thread2 t2 = new Thread2(a);

			t1.setName("Thread1");
			t2.setName("Thread2");

			t1.start();
			t2.start();
		}
	}

EX:  

		class A{
			String str1 = new String("Durga");
			StringBuffer sb1 = new StringBuffer("Durga");

			void modify() {
				String str2 = str1.concat("soft");
				StringBuffer sb2 = sb1.append("soft");
				System.out.println("str2 : "+Thread.currentThread().getName()+" : "+str2);
				System.out.println("sb   : "+Thread.currentThread().getName()+" : "+sb2);
			}
		}
		class Thread1 extends Thread{
			A a;
			Thread1(A a){
				this.a = a;
			}
			public void run() {
				a.modify();
			}
		}
		class Thread2 extends Thread{
			A a;
			Thread2(A a){
				this.a = a;
			}
			public void run() {
				a.modify();
			}
		}
		public class Test {
			public static void main(String[] args) {
				A a = new A();
				Thread1 t1 = new Thread1(a);
				Thread2 t2 = new Thread2(a);
				t1.setName("Thread-1");
				t2.setName("Thread-2");
				t1.start();
				t2.start();
			}
		}
