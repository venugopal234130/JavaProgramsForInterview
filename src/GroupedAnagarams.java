import java.util.*;
public class GroupedAnagarams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        // Map to hold sorted word as key and list of anagrams as value
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // Convert string to char array, sort it, then back to string
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            // Add to map
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }

        // Return all grouped anagrams
        return new ArrayList<>(map.values());
    }

    // Example usage
    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(input);
        System.out.println(result);
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
