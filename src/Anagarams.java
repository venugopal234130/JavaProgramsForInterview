import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Anagarams {
    public static void main(String[] args)
    {
        String str1="listen";
        String str2="silent";
        Map<Character,Integer> map=new HashMap<>();
        if(str1.length()!=str2.length())
        {
            System.out.println("No");
            return;
        }
        for(char c:str1.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:str2.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)-1);
            if(map.get(c)==0)
            {
                map.remove(c);
            }
        }
        if(map.isEmpty())
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }

    //using java8
        System.out.println("Using Java 8 ");
    String s1=str1.chars().mapToObj(c->String.valueOf((char)c)).sorted().collect(Collectors.joining());
        String s2=str2.chars().mapToObj(c->String.valueOf((char)c)).sorted().collect(Collectors.joining());
        if(s1.equals(s2))
        {
        System.out.println("YES");
    }
    else
    {
        System.out.println("NO");
    }
    }
}
