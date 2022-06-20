# Multi Threading:  

## Q)What is the difference between Process, Procedure and Processor?

Ans:  

1. Procedure is a set of isntructions representing a particular action.  

2. Process is a flow of execution to perform a particular action by executing set of instructions[Procedure].  

3. Processor is an H/W component to generate processes.  

Initially, there are two models to execute applications.  
1. Single Proess Mechanism / Single Tasking  
2. Multi Process Mechanism / Multi Tasking  

### 1. Single Proess Mechanism / Single Tasking:  

--> This model allows only one process to execute the complete application.  
--> It follows Sequerntial execution of the tasks.  
--> It will increase application execution time.  
--> It will reduce application performance.   


### 2. Multi Process Mechanism / Multi Tasking:  

--> This model allows more than one process at a time to execute the  
    complete application.  
--> It follows parallel execution of the tasks.  
--> It will reduce application execution time.  
--> It will increase application performance.  

In Multi Process Mechanism, controlling is switched from one process context to another process context, so , this type of switching between process contexts is called as "Context Switching".  

There are two types of Context Switchings.  

1. Heavy Weight Context Switching  
2. Light Weight COntext Switching  
  
1. Heavy Weight Context Switching:  
--> It is the context switching between two heavy weight components.  
EX: Context Switching between two processes.  
--> Heavy Weight Context switching will increase application execution time.  
--> It will reduce application performance.  

2. Light Weight COntext Switching:  
--> It is the context switching between two light weight components.  
EX: Context switching between two Threads.  
--> Liht Weight Context switching will reduce application execution time.  
--> It will increase application performance.  

## Q)What is the difference between Process and Thread?

Ans:  

Process is flow of execution, it is heavy weight, it will take more execution time, it will reduce application performance.  

Thread is flow of execution, it is light weight, it will take less execution time, it will increase application execution time.  
  
Note: Now a days Majority of the technologies are designed on the basis of Threads.  

There are two thread models to execute applications.  
1. Single Thread Model / Single Tasking  
2. Multi Thread Model / Multi Tasking  

1. Single Thread Model / Single Tasking:  
--> It allows only one thread to execute the comlete application.  
--> It follows sequential execution of the applications.  
--> It will increase application execution time.  
--> It will reduce application performance.  


2. Multi Thread Model / Multi Tasking  
--> It allows more than one thread to execute the application application.  
--> It follows parallel execution .  
--> It will reduce application execution time.  
--> It will increase application performance. 

Note: Almost all the technologies using Multi Thread Model.  
 
Java is Thread Based Programming Language, it is Multi Threadded Programming Language, it follows Multi Thread Model, it allows to create and execute more than one thread at a time to execute applications.

To prepare Threads, JAVA has provided predefined library in the form of java.lang package.  

1. Thread  
2. Runnable  

## Q)What is Thread and in how many ways we are able to create threads in Java applications?  

Ans:  

Thread is flow of execution to perform a particular task.  
As per the predefined library provided by Java, there are two ways to create threads.  

1. BY Extending java.lang.Thread class  
2. By Implementing java.lang.Runnable interface  

        1. By Extending java.lang.Thread class:  
            class MyThread extends Thread{
                -----
            }
--------------------------------------------------------------------------------------------------	

        2. By Implementing java.lang.Runnable interface:
            class MyThread implements Runnable{
                ------
            }
 

## Threads Design:
---------------
1. Approach-1: By Extending Thread class  
2. Approach-2: By Implementing Runnable Interface  

1. Approach-1: By Extending Thread class:  
------------------------------------------
a)Declare an User defined class.  
b)Extend Uer defined class from java.lang.Thread class  
c)Override Thread class run() method in user defined class.  

	Note: In run() method we must provide the application logic which we want to execute by creating new thread.  
	public void run()  
	Note: java.lang.Runnable interface contains only one method that is run().
    
d)In Main class, in main() method,Create thread and execute run() method  
  provided implementation.  
	
    Note: To create Thread[Flow of execution] we have to use start() method from java.lang.Thread.  
	public void start()  
	Note: It will create new thread[Flow of execution] and it will send that thread to run() method to execute.

EX:  

          
            class WelcomeThread extends Thread{
                public void run() {
                    for(int i = 0; i < 10; i++) {
                        System.out.println("WelcomeThread : "+i);
                    }
                }
            }

            public class Test {
                public static void main(String[] args) {
                    WelcomeThread welcomeThread = new WelcomeThread();
                    welcomeThread.start();
                    for(int i = 0; i < 10; i++) {
                        System.out.println("Main Thread   : "+i);
                    }
                }
            }

## Q)In Java applications, we have already first approach[Extending Thread class] to create threads then what is the requirement to go for Second approach[Implementing Runnable Interface] of creating Threads?
--------------------------------------------------------------------------
Ans:  

        In First Approach:
          class MyClass extends Thread{
          }

        In GUI Appl.
          class MyClass extends Frame{
          }

        In Java appl.
          class MyClass extends Frame , Thread{
          }

Single sub class is extended from more than one super class directly, ity represents Multiple Inhertitance, it is not supported in Java.  

If we use first approach to create threads then we must extend java.lang.Thread class to user defined class, it is not possible to extend any other classes to user defined class.  

To overcome the above problem, we have to use Second Approach tocreate threads.  

IN Second approach of creating threads we will implement Runnable interface instead of extending Thread class.  

	class MyClass extends Frame implements Runnable{
		-----
	} 


## 2. Approach-2: By Implementing Runnable Interface

a)Declare an user defined class.  
b)Implement java.lang.Runnable interface in User defined class.  
c)Provide implementation for run() method in User defined class .  
   Note: Provide Application logic[Task] which we want to execute by creating new thread.  
d)In Mian class and in main(), Create Thread and access run() method.  

   
			class MyThread implements Runnable{
				public void run(){
					-----Appl Logic----
				}
			}

			class Test{
				public static void main(String[] args){
					Case-1:
						MyThread mt = new MyThread();
						mt.start();
						Status: Compilation Error 
					Case-2:
						MyThread mt = new MyThread();
						mt.run();
						Status: Here User Thread is not created, only Main Thread is executing MyThread class run() and main() method, here no Multi Threadding.
					Case-3:
						MyThread mt = new MyThread();
						Thread t = new Thread();
						t.start();
						Status: Here New Thread is created and it will be submitted to Thread class run() method, but not, MyThread class run() method.
					case-4:
						MyThread mt = new MyThread();
						Thread t = new Thread(mt);
						t.start();
						Status: Valid, Here new Thread is created and it will be submitted to MyThread class run() method. 
				}
			}

EX:  


		class WelcomeThread implements Runnable{
			public void run() {
				for(int i = 0; i < 10; i++) {
					System.out.println("Welcome Thread : "+i);
				}
			}
		}
		public class Test {
			public static void main(String[] args) {
				/*
				WelcomeThread welcomeThread = new WelcomeThread();
				welcomeThread.start();
				*/
				/*
				WelcomeThread welThread = new WelcomeThread();
				welThread.run();
				for(int i = 0; i < 10; i++) {
					System.out.println("Main Thread  : "+i);
				}
				*/
				/*
				WelcomeThread wt = new WelcomeThread();
				Thread t = new Thread();
				t.start();
				for(int i = 0; i < 10; i++) {
					System.out.println("Main Thread : "+i);
				}
				*/
				WelcomeThread wt = new WelcomeThread();
				Thread t = new Thread(wt);
				t.start();
				for(int i = 0; i < 10; i++) {
					System.out.println("Main Thread  : "+i);
				}
			}
		}
