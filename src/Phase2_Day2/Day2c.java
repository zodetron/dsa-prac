package Phase2_Day2;
//leetcode  344 reverse string = not best solution
public class Day2c {
    public static void main(String[] args) {
        String s = new String ("jelloooo");
                StringBuilder sb = new StringBuilder(new String(s));
                sb.reverse();

                char[] s1 = sb.toString().toCharArray();

                for(int i = 0; i < s.length; i++) {
                    s[i] = s1[i];
                }
            }
    }
}
