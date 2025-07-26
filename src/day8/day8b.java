package day8;
    import java.util.*;

public class day8b {
        public static void main(String[] args) {
            List<String> input = Arrays.asList("xy", "xyz", "zxy", "yz","jarvis");
            List<String> sortedList = new ArrayList<>();

            for (String str : input) {
                char[] chars = str.toCharArray();
                Arrays.sort(chars);  // sort characters inside each string
                sortedList.add(new String(chars));
            }

            // Print as [xy][xyz][xyz][yz]
            for (String sorted : sortedList) {
                System.out.print("[" + sorted + "]");
            }
        }
}
