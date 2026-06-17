package Phase2_Day3;

import java.util.Stack;

class Day3b {
    public String decodeString(String s) {
        Stack<Integer> nums = new Stack<>();
        Stack<StringBuilder> strs = new Stack<>();

        StringBuilder curr = new StringBuilder();
        int num = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
            else if (ch == '[') {
                nums.push(num);
                strs.push(curr);

                curr = new StringBuilder();
                num = 0;
            }
            else if (ch == ']') {
                int repeat = nums.pop();
                StringBuilder prev = strs.pop();

                for (int i = 0; i < repeat; i++) {
                    prev.append(curr);
                }

                curr = prev;
            }
            else {
                curr.append(ch);
            }
        }

        return curr.toString();
    }

    public static void main(String[] args) {
        Day3b sol = new Day3b();

        System.out.println(sol.decodeString("3[a]2[bc]"));      // aaabcbc
        System.out.println(sol.decodeString("3[a2[c]]"));       // accaccacc
        System.out.println(sol.decodeString("2[abc]3[cd]ef"));  // abcabccdcdcdef
        System.out.println(sol.decodeString("10[a]"));          // aaaaaaaaaa
    }
}