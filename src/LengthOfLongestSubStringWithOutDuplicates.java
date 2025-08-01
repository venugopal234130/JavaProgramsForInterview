import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubStringWithOutDuplicates {
    public static void main(String[] args) {
        String str="abcabce";
        Set<Character> set=new HashSet<>();
        int r=0,l=0,n=str.length(),max=0,start=0;
        while(r<n)
        {
            if(!set.contains(str.charAt(r)))
            {
                set.add(str.charAt(r));
                if(max<r-l+1)
                {
                    max=r-l+1;
                    start=l;
                }
                r++;
            }
            else {
                set.remove(str.charAt(l));
                l++;
            }
        }
        System.out.println(str.substring(start,start+max));
        System.out.println(max);
    }

}
