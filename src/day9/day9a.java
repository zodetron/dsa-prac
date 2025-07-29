package day9;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class day9a {
    public String encode(List<String> strs) {
        return ""; // temporary placeholder
    }

    public List<String> decode(String str) {
        return new ArrayList<>(); // temporary placeholder
    }

    public static void main(String[] args) {
        day9a sol= new day9a();
        List<String> myList = new ArrayList<>();
        List<String> strs = Arrays.asList("neet", "code", "love", "you");
//        myList=sol.decode(strs);
        myList = sol.decode(sol.encode(strs));
    }
}
