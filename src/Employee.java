import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//Example for Comparable Interface
public class Employee implements Comparable<Employee>{
    private Integer id;
    private String name;
    private Double salary;
    public static void main(String[] args) {
        Employee e1=new Employee(10,"venu",50.00);
        Employee e2=new Employee(5,"gopal",20.00);
        List<Employee> list= Arrays.asList(e1,e2);
        Collections.sort(list);
        System.out.println(list);
    }
    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary=salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }



    @Override
    public int compareTo(@NotNull Employee o) {
       return this.name.compareTo(o.name);
    }
}
