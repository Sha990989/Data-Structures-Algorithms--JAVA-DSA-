/*create one array ---> array={"eat", "ten", "ate", "tan", "ant", "but"}  ===>{using hashmap}

Output:-["eat", "ten", "ate"]
       
          ["tan", "ant"]

             ["but"]
 */
import java.util.*;

public class extractingsubstringsusinghashset{
    public static void main(String[] args) {
        String[] str = {"ant", "bat", "eat", "ten", "tea", "nat", "ate"};

        // Map from sorted word -> list of anagrams
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : str) {
            // Sort the characters of the word
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // Add word to corresponding anagram group
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }

        // Print grouped anagrams
        for (List<String> group : map.values()) {
            System.out.println(group);
        }
    }
}