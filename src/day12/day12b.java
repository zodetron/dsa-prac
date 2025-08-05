package day12;

public class day12b {
        public int[] dailyTemperatures(int[] temperatures) {
            int n = temperatures.length;
            int[] res = new int[n];

            for (int i = 0; i < n; i++) {
                int count = 1;
                int j = i + 1;
                while (j < n) {
                    if (temperatures[j] > temperatures[i]) {
                        break;
                    }
                    j++;
                    count++;
                }
                count = (j == n) ? 0 : count;
                res[i] = count;
            }
            return res;
        }

        public static void main(String[] args) {
            day12b sol = new day12b();
            int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
            int[] result = sol.dailyTemperatures(temperatures);

            System.out.print("Result: [");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]);
                if (i < result.length - 1) System.out.print(", ");
            }
            System.out.println("]");
        }

}
