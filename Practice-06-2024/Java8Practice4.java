import java.util.*;
import java.util.stream.Collectors;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Server started...!");
        
       List<Employee> list=Arrays.asList(
           new Employee(101, "Shaukat",50000d, "M"),
           new Employee(102, "Wasim",60000d, "M"),
           new Employee(103, "Zakir",70000d, "M"),
           new Employee(104, "Asif",30000d, "F"),
            new Employee(105, "Azim",50000d, "F"));
           
           //sort in ASC based on employee name
           System.out.println(list.stream().sorted((i1, i2)-> i1.getName().compareTo(i2.getName())).collect(Collectors.toList()));
           
            System.out.println();
           
           //sort in DESC based on employee name
           System.out.println(list.stream().sorted((i1, i2)-> -i1.getName().compareTo(i2.getName())).collect(Collectors.toList()));
           System.out.println();
           
           //sort in ASC based on employee name length
           System.out.println(list.stream().sorted((i1, i2)-> Integer.valueOf(i1.getName().length()).compareTo(Integer.valueOf(i2.getName().length()))).collect(Collectors.toList()));
           System.out.println();
           
           //sort in DESC based on employee name length
           System.out.println(list.stream().sorted((i1, i2)-> -Integer.valueOf(i1.getName().length()).compareTo(Integer.valueOf(i2.getName().length()))).collect(Collectors.toList()));
           System.out.println();
           
           //print employee whos has second lowest salary
           System.out.println(list.stream().sorted((i1, i2)-> i1.getSalary().compareTo(i2.getSalary()))
                .map(Employee::getName).distinct().skip(1).findFirst().get());
             System.out.println();
             
            //print employee whos has second highest salary
           System.out.println(list.stream().sorted((i1, i2)-> -i1.getSalary().compareTo(i2.getSalary()))
                .map(Employee::getName).distinct().skip(1).findFirst().get());    
           System.out.println();
           
            //count how many male and female
           System.out.println(list.stream().collect(Collectors.groupingBy(i-> i.getGender(), Collectors.counting()))); 
                
    }
}

class Employee{

    private Integer id;
    private String name;
    private Double salary;
    private String gender;

    public Employee(Integer id, String name, Double salary, String gender) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Double getSalary() {
        return salary;
    }
}



// Server started...!
// [Employee{id=104, name='Asif', salary=30000.0}, Employee{id=105, name='Azim', salary=50000.0}, Employee{id=101, name='Shaukat', salary=50000.0}, Employee{id=102, name='Wasim', salary=60000.0}, Employee{id=103, name='Zakir', salary=70000.0}]

// [Employee{id=103, name='Zakir', salary=70000.0}, Employee{id=102, name='Wasim', salary=60000.0}, Employee{id=101, name='Shaukat', salary=50000.0}, Employee{id=105, name='Azim', salary=50000.0}, Employee{id=104, name='Asif', salary=30000.0}]

// [Employee{id=104, name='Asif', salary=30000.0}, Employee{id=105, name='Azim', salary=50000.0}, Employee{id=102, name='Wasim', salary=60000.0}, Employee{id=103, name='Zakir', salary=70000.0}, Employee{id=101, name='Shaukat', salary=50000.0}]

// [Employee{id=101, name='Shaukat', salary=50000.0}, Employee{id=102, name='Wasim', salary=60000.0}, Employee{id=103, name='Zakir', salary=70000.0}, Employee{id=104, name='Asif', salary=30000.0}, Employee{id=105, name='Azim', salary=50000.0}]

// Shaukat

// Wasim

// {F=2, M=3}
