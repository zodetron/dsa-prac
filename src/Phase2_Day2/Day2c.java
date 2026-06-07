package Phase2_Day2;
//leetcode  344 reverse string = not best solution
public class Day2c {
    public static void reverseString(char[] s) {
        StringBuilder sb = new StringBuilder(new String(s));
        sb.reverse();
        char[] reversed = sb.toString().toCharArray();
        for (int i = 0; i < s.length; i++) {
            s[i] = reversed[i];
        }
    }
    public static void main(String[] args) {
        char[] s = {'j','e','l','l','o','o','o','o'};
        reverseString(s);
        System.out.println(s);
    }
}
