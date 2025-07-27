package day8;
import java.util.*;
//beat 97% using the bucket sort algorithm
public class day8f {
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
            day8f sol = new day8f();
            int[] nums = {1, 1, 1, 2, 2, 3, 3, 3, 4};
            int k = 2;

            int[] result = sol.topKFrequent(nums, k);
            System.out.println("Top " + k + " frequent elements: " + Arrays.toString(result));
        }
    }

