package day8;
import java.util.*;

public class day8c {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> res = new HashMap<>();
            for (String s : strs) {
                char[] charArray = s.toCharArray();
                Arrays.sort(charArray);
                String sortedS = new String(charArray);
                res.putIfAbsent(sortedS, new ArrayList<>());
                res.get(sortedS).add(s);
            }
            return new ArrayList<>(res.values());
        }

        public static void main(String[] args) {
            day8c solution = new day8c();
            String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
            List<List<String>> result = solution.groupAnagrams(strs);

            // Print the result
            for (List<String> group : result) {
                System.out.println(group);
            }
        }
}
