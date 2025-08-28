package day16;
import java.util.*;

public class day16e {

        public int calculate(String s) {
            Stack<Integer> st = new Stack<>();
            int num = 0;
            int sign = 1;
            int res = 0;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (Character.isDigit(ch)) {
                    num = num * 10 + (ch - '0');
                }
                else if (ch == '+') {
                    res += num * sign;
                    num = 0;
                    sign = 1;
                }
                else if (ch == '-') {
                    res += num * sign;
                    num = 0;
                    sign = -1;
                }
                else if (ch == '(') {
                    st.push(res);
                    st.push(sign);
                    sign = 1;
                    res = 0;
                    num = 0;
                }
                else if (ch == ')') {
                    res += num * sign;
                    num = 0;
                    int lastSign = st.pop();
                    int lastRes = st.pop();
                    res = lastRes + lastSign * res;
                }
            }
            res += num * sign;
            return res;
        }
    public static void main(String[] args) {
        day16e sol = new day16e();

        // Test cases
        System.out.println(sol.calculate("1 + 1"));                  // 2
        System.out.println(sol.calculate(" 2-1 + 2 "));              // 3
        System.out.println(sol.calculate("(1+(4+5+2)-3)+(6+8)"));    // 23
        System.out.println(sol.calculate(" 10 - (2 + 3) "));         // 5
        System.out.println(sol.calculate("(7)-(0)+(4)"));            // 11
    }
}
