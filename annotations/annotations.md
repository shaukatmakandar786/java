## Annotation:

1. Annotation is a new feature of java provided by JDK 5.0 version.
2. It is used to describe meta data in java program.
3. Meta data means data about data,and especially in java program data about our coding part is called meta data.
4. means describe some information about our coding part we are going to use annotations.

## Syntax:

1. Declarations Syntax
2. Utilization Syntax

- Declarations Syntax:

@interface Annotation_Name  
{  
  membe  
  //data-type member_Name()[default value]  
}

- Utilization Syntax:

we can use this annotation with variable, methods, classes and so on.  
@Annotation_Name(member1="value",member2="value")  
Programming statement  

## On the basis of member annotation is devided into 3 parts:

1. Marker Annotaion
2. single-Valued Annotation
3. Multi-Valued Annotation

- Marker Annotaion:
eg: @Override, @WebListener

- single-Valued Annotation:
eg: @SuppressWarning("unchecked")

- Multi-Valued Annotation
eg: @Webservlet(name="myservlet",urlPattern={"/abc","/xyz"})

## Classificatio of annotations:

1. Standard Annotation
2. Custom Annotation

- Standard Annotation
  - General Purpose Annotation
  - Meta Annotation
    
    - General Purpose Annotation:
    1. @override
    2. @SuppressWarning
    3. @Depricated
    4. @FunctionalInterface  
    5. all above annotations are present in (java.lang) package  
     
  
    - Meta Annotation:
    1. @Documented
    2. @Inherited
    3. @Target
    4. @Retention
    5. all above annotations are present in (java.lang.annotation) package  

## Note:

For all annotation's super interface is java.lang.annotation.Annotation
        
## Meta Annotation:

Annotation about Annotation is called meta annotation.
That means declaring an annotation using another annotation.
Java provided all annotation in (java.lang.annotation.Annotation) package.

1. @Inherited
2. @Documented
3. @Target
4. @Retention

## @Inherited:
By default, annotations are not inherited to subclasses. 
The @Inherited annotation marks the annotation to be inherited to subclasses.  

### Example:

@Inherited  
@interface Persistable  
{  
    ----;  
    ----;   
}  

@Persistable  
class Employye  
{  
  int eid;  
  String name;  
}  
class Manager extends Employee  
{  
  void getManagerDetails()  
  {  
    sop(eid);  
    sop(name);  
  }  
  
}  

## @Documented:

The @Documented Marks the annotation for inclusion in the documentation.  
Means if we used @Documented Annotaion so all annotation also display in documentation of HTML.

### Example:
D:\app\Employee.java  
d:\app>javadoc Employee  

@Documented  
@interface Persistable  
{  
    ----;  
    ----;   
}  

@Persistable  
class Employye  
{  
  int eid;  
  String name; 
  
  public Employee(int eid,String name)  
  {  
  }  
  public void add()  
  {  
  }  
  
}  


## @Target:

@Target tag is used to specify at which type, the annotation is used.

The java.lang.annotation.ElementType enum declares many constants to specify the type of element  
where annotation is to be applied such as TYPE, METHOD, FIELD etc.
  
Syntax: 

@Target(ElementType.value)  

Example:  

@Target(ElementType.TYPE)-> class, interface or enumeration  
@Target(ElementType.FIELD)-> variables  
@Target(ElementType.METHOD)-> methods  
@Target(ElementType.CONSTRUCTOR)-> constructors  

@Target(ElementType.TYPE,ElementType.FIELD)  
@interface Persistable  
{  
    ------;  
    ------;  
}  

## @Retention:

@Retention annotation is used to specify to what level annotation will be available.

Syntax:  

@Retention(RetentionPolicy.value)  

Example  

@Retention(RetentionPolicy.SOURCE)    
@Retention(RetentionPolicy.CLASS) 
@Retention(RetentionPolicy.RUNTIME)  

## Custom Annotation:

1. define user define annotation
2. utilize user define annotation
3. access data from user define annotation

Note: see above concepts example in Custom Annotation folder




