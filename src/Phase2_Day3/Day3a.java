package Phase2_Day3;

public class Day3a {
        public String removeDuplicates(String s) {
            StringBuilder sb = new StringBuilder();

            for (char ch : s.toCharArray()) {
                if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ch) {
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    sb.append(ch);
                }
            }

            return sb.toString();
        }

        public static void main(String[] args) {
            Day3a sol = new Day3a();

            String s = "abbaca";
            String result = sol.removeDuplicates(s);

            System.out.println("Input: " + s);
            System.out.println("Output: " + result);
        }
}
