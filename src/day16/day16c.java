package day16;
import java.util.*;

public class day16c {
        public String simplifyPath(String path) {
            Stack<String> stack = new Stack<>();
            String[] tokens = path.split("/");

            for (String c : tokens) {
                if (c.equals("") || c.equals(".")) {
                    // skip empty and current directory
                    continue;
                } else if (c.equals("..")) {
                    if (!stack.isEmpty()) {
                        stack.pop(); // go one directory up
                    }
                } else {
                    stack.push(c); // valid directory name
                }
            }

            // Build the simplified path
            StringBuilder result = new StringBuilder();
            for (String dir : stack) {
                result.append("/").append(dir);
            }

            return result.length() == 0 ? "/" : result.toString();
        }
    public static void main(String[] args) {
        day16c sol = new day16c();

        // Test cases
        System.out.println(sol.simplifyPath("/home/"));          // "/home"
        System.out.println(sol.simplifyPath("/../"));            // "/"
        System.out.println(sol.simplifyPath("/home//foo/"));     // "/home/foo"
        System.out.println(sol.simplifyPath("/a/./b/../../c/")); // "/c"
    }
}
