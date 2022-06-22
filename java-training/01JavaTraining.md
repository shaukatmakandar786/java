# History of java:

1.java is developed by sun microsystem 1991.  
2.java langauge is initiated by james gosling and his team.  
3.java current version is java 18  
4.Oracle company is acquired the Sun Micro System company in 2010,so we can said that now JAVA is the product of oracle  
5.C lang follows procedural oriented guidline(it is function based language)  

	In C language if we want to perform some operation then we will make some function and we can perform that operation.
	In below you can see the some operation like addition and subtraction

ex:  

          void main()
          {

          add();
          sub();

          }
          void add()
          {
          -------
          --------
          }
          void sub(){
          -------
          ------
          }

6 .C++ lang follows procedural oriented(function based language) + Object Oriented(class based language) guidlines.  

In cpp we can create a method out the class,you can see below example like main() method,mul() method i created out side the class.  
it means that cpp support both OOPS+POS   

            int  main()
            {
              Arithmetic o1;
              o1.add();
              o1.sub();
              mul();

            }
            class Arithmetic
            {

              public:

                void add()
                {
                  -----
                  -----
                }

                void sub()
                {
                  ------
                  ------
                }
            };
            void mul()
            {
              -----
              -----
            }

7.java follows only Object Oriented(class based language) guidlines.  
	
In java we cant create a single method outside the class even main method also,so we can say that java is Near Pure object oriented programming language.  

      class Arithmetric
      {
          public void add(int a,int b)
          {
              System.out.println("add="+(a+b));
          }

          public void sub(int a,int b)
          {
              System.out.println("sub="+(a-b));
          }
      }
      class HelloWorld {
          public static void main(String[] args) {

              Arithmetric o=new Arithmetric();
              o.add(10,20);
              o.sub(40,20);
          }
      }

8. Java is nearly Pure Object Oriented lang,but java is not 100% object oriented lang.  

ans: java is not 100% object oriented lang, because in java if we create some primitive type variable it is not  
conceder as an object ,it only conceder as a normal variable thats why we said that java is not 100% object orinted language.  

Ex:  

        public class Test {
            public static void main(String[] args) {

                int a=10;//this is not not conceder as an object
                Integer b=new Integer(a);//this is object


            }
        }
        
        
9. Top down and bottom up approach:  

Top down:
	C lang follows top down approach,it means that in c lang first we will decide the flow of the program then we will do the detailing part  
	(measn first we write main() method then we will write the some other methods like add(),sub()).  

bottom up:  
	cpp and java follows bottom up approach,it means that first we will do the detailing part then we will decide the flow of the   
	program(means first we write some classes then we will write the main class).  

-------------------------------------------------------------

                    // Online C compiler to run C program online
                    #include <stdio.h>
                    // c follows top down approach
                    int main() {

                        add(10,30);
                        sub(30,10);

                        return 0;
                    }
                    void add(int a,int b)
                    {
                        printf("addition is %d\n",(a+b));
                    }
                    void sub(int a,int b)
                    {
                        printf("subtraction is %d\n",(a-b));
                    }
-----------------------------------------------------------------------

        // Online C++ compiler to run C++ program online

        //CPP follows bottom up approach
        #include <iostream>
        using namespace std;
        class Arithmetic
        {
            public:
            void add(int a,int b)
            {
                cout<<a+b<<endl;
            }
            void sub(int a,int b)
            {
                cout<<a-b;
            }
        };
        int main() {

           Arithmetic o;
           o.add(10,20);
           o.sub(30,10);
            return 0;
        }
-------------------------------------------------------------------------

          // Online Java Compiler
          // Use this editor to write, compile and run your Java code online
          // java is also follows bottom up approach
          class Arithmetric
          {
              public void add(int a,int b)
              {
                  System.out.println("add="+(a+b));
              }

              public void sub(int a,int b)
              {
                  System.out.println("sub="+(a-b));
              }
          }
          class HelloWorld {
              public static void main(String[] args) {

                  Arithmetric o=new Arithmetric();
                  o.add(10,20);
                  o.sub(40,20);
              }
          }
          
--------------------------------------------------------------------------------------




