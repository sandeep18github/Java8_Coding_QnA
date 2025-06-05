import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//WAP to print employees who's age is greater than 25
public class Stream1 {

    public static void main(String[] args) {

        Employee e1 = new Employee(25, "Sandeep",30000);
        Employee e2 = new Employee(27, "Venu",40000);
        Employee e3 = new Employee(26, "Feroz",60000);
        Employee e4 = new Employee(28, "Ramu",70000);

        List<Employee> empList = Arrays.asList(e1, e2, e3, e4);

        List<Employee> empAgeAbove25 = empList.stream().filter(p -> p.age > 25).collect(Collectors.toList());
        System.out.println(empAgeAbove25);

        //Extract the emp names for empList
        List<String> empNameList = empList.stream().map(f -> f.name).collect(Collectors.toList());
        System.out.println(empNameList);
        //assending order
        List<String> collect = empList.stream().map(f -> f.name).sorted().collect(Collectors.toList());
        System.out.println(collect);

        //decending order
        List<String> collect2 = empList.stream().map(f -> f.name).sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
        System.out.println(collect2);
        //limit() method
        empList.stream().map(f->f.name).limit(3).forEach(i-> System.out.println(i));

        //Min(),Max(),Avg()

        double min = empList.stream().mapToDouble(s -> s.salary).min().orElse(0);
        System.out.println("Min_Salary ==> "+min);

        double Max = empList.stream().mapToDouble(s -> s.salary).max().orElse(0);
        System.out.println("Max_Salary ==> "+Max);

        double Avg = empList.stream().mapToDouble(s -> s.salary).average().orElse(0);
        System.out.println("Avg_Salary ==> "+Avg);


    }
}

     class Employee {
        int age;
        String name;
        double salary;


       public Employee(int age, String name,double salary) {
            this.age = age;
            this.name = name;
            this.salary=salary;
        }

        @Override
        public String toString() {
            return "Employee{" + "age=" + age + ", name='" + name +"salary = "+ salary + '\'' + '}';
        }
    }

