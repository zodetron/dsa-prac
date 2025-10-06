package day23;
//leetcode 347. Top K Frequent Elements
import java.util.*;

public class day23f {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            for (int n : freq[i]) {
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        day23f sol = new day23f();

        int[] nums = {1, 1, 1, 2, 2, 3}; // sample input
        int k = 2;

        int[] result = sol.topKFrequent(nums, k);

        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Top " + k + " frequent elements: " + Arrays.toString(result));
    }

}
