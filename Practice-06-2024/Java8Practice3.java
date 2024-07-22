import java.util.*;
import java.util.stream.Collectors;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Server started...!");
        
       List<Employee> list=Arrays.asList(
           new Employee(101, "Shaukat",50000d, "M"),
           new Employee(102, "Wasim",60000d, "M"),
           new Employee(103, "Zakir",70000d, "M"),
           new Employee(104, "Asif",30000d, "M"),
            new Employee(105, "Azim",50000d, "M"));
           
           //print all salary > 40000
           System.out.println(list.stream().filter(employee-> employee.getSalary()>40000d)
               .map(Employee::getSalary)
               .distinct()
               .collect(Collectors.toList()));
                        
            //print employee name whos salary > 40000
            
            System.out.println(list.stream().filter(employee-> employee.getSalary()>40000d).map(Employee::getName).collect(Collectors.toList()));
            
        List<Integer> list1 = Arrays.asList(10, 20, 40, 30, 67, 34);
        List<Integer> list2 = Arrays.asList(154, 22, 40, 30, 65, 34);
        List<Integer> list3 = Arrays.asList(14, 20, 40, 30, 60, 14);
        
        List<List<Integer>> flatExample=Arrays.asList(list1, list2, list3);
          
        System.out.println(flatExample.stream().flatMap(flatList-> flatList.stream()).collect(Collectors.toList()));
                        
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
// [50000.0, 60000.0, 70000.0]
// [Shaukat, Wasim, Zakir, Azim]
// [10, 20, 40, 30, 67, 34, 154, 22, 40, 30, 65, 34, 14, 20, 40, 30, 60, 14]
