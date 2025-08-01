import java.io.LineNumberInputStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
    }
}
