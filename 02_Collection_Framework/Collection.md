# Q) What Are The Differences Between Array And Collection?

• Arrays are having fixed size in nature. In case of arrays, we are able to add the 
elements up to the specified size only, we are unable to add the elements over its 
size, if we are trying to add elements over its size then JVM will rise an exception 
like "java.lang.ArrayIndexOutOfBoundsException".

EX: 
Student[] std=new Student[3];
std[0]=new Student();
std[1]=new Student();
std[2]=new Student();
std[3]=new Student();--> ArrayIndexOutOfBoundsException

Collections are having dynamically growable nature, even if we add the elements over its
size then JVM will not rise any exception.

