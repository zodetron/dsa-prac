package day17;

//LeetCode 167 – Two Sum II

public class day17d {

        public static int[] twoSum(int[] numbers, int target) {
            int l = 0, r = numbers.length - 1;

            while (l < r) {
                int curSum = numbers[l] + numbers[r];

                if (curSum > target) {
                    r--;
                } else if (curSum < target) {
                    l++;
                } else {
                    return new int[] { l + 1, r + 1 }; // 1-based indices
                }
            }
            return new int[0];
        }

        public static void main(String[] args) {
            int[] numbers = {2, 7, 11, 15};
            int target = 9;

            int[] result = twoSum(numbers, target);

            System.out.print("Indices: ");
            for (int x : result) {
                System.out.print(x + " ");
            }
            // Expected Output: Indices: 1 2
        }
}