package day24;
//leetcode 22. Generate Parentheses
import java.util.*;

public class day24d {
        public List<String> generateParenthesis(int n) {
            List<List<String>> res = new ArrayList<>();

            // Base case: when there are 0 pairs of parentheses
            res.add(new ArrayList<>());
            res.get(0).add("");

            // Build up results for 1..n pairs
            for (int k = 1; k <= n; k++) {
                List<String> current = new ArrayList<>();
                for (int i = 0; i < k; i++) {
                    for (String left : res.get(i)) {
                        for (String right : res.get(k - i - 1)) {
                            current.add("(" + left + ")" + right);
                        }
                    }
                }
                res.add(current);
            }

            return res.get(n);
        }

        public static void main(String[] args) {
            day24d sol = new day24d();
            System.out.println(sol.generateParenthesis(3));
        }
}
