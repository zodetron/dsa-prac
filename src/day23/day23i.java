package day23;
//leetcode 271. Encode Decode Strings
import java.util.*;

public class day23i {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s.length()).append('#').append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            res.add(str.substring(i, j));
            i = j;
        }
        return res;
    }

    public static void main(String[] args) {
        day23i sol = new day23i();

        List<String> input = Arrays.asList("leet", "code", "is", "fun");
        String encoded = sol.encode(input);
        System.out.println("Encoded: " + encoded);

        List<String> decoded = sol.decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}

