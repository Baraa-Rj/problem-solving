import java.util.*;

public class GroupAnagram {
    public List<List<String>> groupAnagramsSorting(String[] strs) {
        if (strs == null) {
            return new ArrayList<>();
        }
        Map<String, ArrayList<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] charS = s.toCharArray();
            Arrays.sort(charS);
            String string = String.valueOf(charS);
            map.putIfAbsent(string, new ArrayList<>());
            map.get(string).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null) {
            return new ArrayList<>();
        }
        Map<String, ArrayList<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            Arrays.sort(count);
            map.putIfAbsent(Arrays.toString(count), new ArrayList<>());
            map.get(Arrays.toString(count)).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
