package Phase2_Day2;

public class Day2f {

        public static boolean backspaceCompare(String s, String t) {
            return build(s).equals(build(t));
        }
        public static String build(String str) {

            StringBuilder sb = new StringBuilder();

            for (char ch : str.toCharArray()) {
                if (ch != '#') {
                    sb.append(ch);
                }
                else if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
            return sb.toString();
        }
        public static void main(String[] args) {

            String s = "ab#c";
            String t = "ad#c";

            System.out.println("Original s: " + s);
            System.out.println("Original t: " + t);

            System.out.println("Processed s: " + build(s));
            System.out.println("Processed t: " + build(t));

            System.out.println("Result: " + backspaceCompare(s, t));
        }
}
