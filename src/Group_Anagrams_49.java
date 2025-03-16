import java.util.*;

public class Group_Anagrams_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {

            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String str_sort = String.copyValueOf(charArray);

            List<String> strings;

            if (map.containsKey(str_sort))
                strings = map.get(str_sort);
            else
                strings = new ArrayList<>();

            strings.add(str);
            map.put(str_sort, strings);
        }

        return new ArrayList<>(map.values());
    }
}
