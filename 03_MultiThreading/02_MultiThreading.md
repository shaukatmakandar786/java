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
