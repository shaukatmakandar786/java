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
