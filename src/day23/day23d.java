package day23;
//leetcode 49 - group anagrams
import java.util.*;

class day23d {

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
            day23d sol = new day23d();

            String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
            List<List<String>> result = sol.groupAnagrams(input);

            System.out.println("Grouped Anagrams: " + result);
        }
}
//int m-10;