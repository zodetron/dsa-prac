package day8;
import java.util.*;

public class day8e {
        public int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> count = new HashMap<>();
            for (int num : nums) {
                count.put(num, count.getOrDefault(num, 0) + 1);
            }

            List<int[]> arr = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
                arr.add(new int[] {entry.getValue(), entry.getKey()});
            }

            // Sort based on frequency in descending order
            arr.sort((a, b) -> b[0] - a[0]);

            int[] res = new int[k];
            for (int i = 0; i < k; i++) {
                res[i] = arr.get(i)[1]; // get the number, not frequency
            }
            return res;
        }

        public static void main(String[] args) {
            day8e sol = new day8e();
            int[] nums = {1, 1, 1, 2, 2, 3};
            int k = 2;
            int[] result = sol.topKFrequent(nums, k);

            System.out.println("Top " + k + " frequent elements: " + Arrays.toString(result));
        }
}
