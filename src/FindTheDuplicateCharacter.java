import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheDuplicateCharacter {

    public static void main(String[] args) {
        String str="venuvenugopal";
        Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
        char ch1[]=str.toCharArray();
        for(char ch:ch1)
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.print(entry.getKey()+" ");
            }
        }

        //Using java 8 Streams
        System.out.println("using java8");
        Map<Character,Long> map1=str.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(map1);

        System.out.println("using java8");
        List<Character> map2=str.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(map2);
    }
}
