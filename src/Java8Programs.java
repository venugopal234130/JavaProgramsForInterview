import java.io.LineNumberInputStream;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Employee1
{
    private Integer id;
    private String name;
    private Double salary;
    public Employee1(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class Java8Programs {
    public static void main(String[] args) {

        //Sort the int Array using java Streams
        //Convert an array to Stream by using Arrays.stream(arr)
        int arr[]={10,2,4,5,1,6,8};
        List<Integer> DescendingOrder=Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(DescendingOrder);
        //Convert list to Map
        List<String> strings=Arrays.asList("venu","gopal");
        Map<String,Integer> toMap=strings.stream().collect(Collectors.toMap(String::toUpperCase,String::length));
        System.out.println(toMap);
        //Filter the even numbers
        Arrays.stream(arr).boxed().filter(n->n%2==0).forEach(System.out::println);
        //FIND THE NTH HIGHEST SALARY OF AN EMPLOYEE
        Employee1 e1=new Employee1(10,"venu",50.00);
        Employee1 e2=new Employee1(5,"gopal",20.00);
        Employee1 e3=new Employee1(15,"ram",25.00);
        Employee1 e4=new Employee1(13,"syam",60.00);
        Employee1 e5=new Employee1(5,"gopal",20.00);
        Employee1 e6=new Employee1(5,"gopal",20.00);
        Employee1 e7=new Employee1(15,"ram",26.00);

        List<Employee1> emp=Arrays.asList(e1,e2,e3,e4,e5,e6,e7);
        //emp.stream().map(Employee1::getSalary).sorted(Comparator.reverseOrder()).findFirst().ifPresent(System.out::println);
       // emp.stream().sorted(Comparator.comparing(Employee1::getSalary).reversed()).forEach(System.out::println);
       // emp.stream().collect(Collectors.groupingBy(Employee1::getName,Collectors.counting())).entrySet().stream().map(Map.Entry::getKey).forEach(System.out::println);
        Map<String,Optional<Employee1>> map=emp.stream().collect(Collectors.groupingBy(Employee1::getName,Collectors.maxBy(Comparator.comparing(Employee1::getSalary))));
        System.out.println(map);

        Map<String,Double> map1=emp.stream().collect(Collectors.groupingBy(Employee1::getName,Collectors.averagingDouble(Employee1::getSalary)));
        System.out.println(map1);

        String input="venugopalvenu";
        Map<Character,Long> map3=input.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        System.out.println(map3);

        Map<Character,Long> map4=input.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(map4);

       // map3.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
        int[] values={10,2,4,5,1,6,8,1,1,2,4,5};
        Arrays.stream(values).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
       // Arrays.stream(values).boxed().collect(Collectors.toMap(Function.identity(),x->x,(x,y)->x)).forEach(System.out::println);
   Map<Boolean,List<Integer>> v= Arrays.stream(values).boxed().
            collect(Collectors.partitioningBy(x->x%2==0));
    System.out.println(v);

    Arrays.stream(values).boxed().map(String::valueOf).filter(s->s.startsWith("1")).forEach(System.out::println);
    Set<Integer> s=new HashSet<>();
    List<String> stringValues=Arrays.asList("venu","gopal"," ",null);
    stringValues.stream().filter(Objects::nonNull).forEach(System.out::println);

    //select salary from(
        // select salary,dense_rank() over (ORDER BY DESC salary) as rnk
        // from employees) as ranked_salaraies
        //where rnk=2;

        String str = "aabbbcdeff";
        String st="madamz";
        str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).map(Map.Entry::getKey).findFirst().ifPresent(System.out::println);
       boolean flag= IntStream.range(0,st.length()/2).allMatch(i->st.charAt(i)==st.charAt(st.length()-i-1));
        if(flag){
            System.out.println(st);
        }
        else {
            System.out.println("Not Palin");
        }
    }
}
