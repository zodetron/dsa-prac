package day22;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class day22b {

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
        day22b sol= new day22b();
        List<String> myList = new ArrayList<>();
        List<String> strs = Arrays.asList("neet", "code", "love", "you");
        myList = sol.decode(sol.encode(strs));
        System.out.println(myList);
    }
}
