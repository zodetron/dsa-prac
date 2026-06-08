package Phase2_Day2;
//leetcode 1528 shuffle string

public class Day2e {
        public static String restoreString(String s, int[] indices) {

            char[] ans = new char[s.length()];

            for (int i = 0; i < s.length(); i++) {
                ans[indices[i]] = s.charAt(i);
            }

            return new String(ans);
        }

        public static void main(String[] args) {

            String s = "codeleet";
            int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};

            String result = restoreString(s, indices);

            System.out.println("Original String: " + s);
            System.out.println("Indices: ");

            for (int index : indices) {
                System.out.print(index + " ");
            }

            System.out.println();
            System.out.println("Restored String: " + result);
        }
}
