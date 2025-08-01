import java.io.LineNumberInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Programs {
    public static void main(String[] args) {

        //Sort the int Array using java Streams
        //Convert an array to Stream by using Arrays.stream(arr)
        int arr[]={10,2,4,5,1,6,8};
        List<Integer> DescendingOrder=Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(DescendingOrder);

    }
}
