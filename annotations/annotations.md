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
        



