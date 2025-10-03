package day22;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class day22a {
        private static final String DELIMITER = "#";

        // Encode: Join all strings with delimiter
        public String encode(List<String> strs) {
            StringBuilder sb = new StringBuilder();
            for (String s : strs) {
                sb.append(s).append(DELIMITER);
            }
            return sb.toString();
        }
        public List<String> decode(String str) {
            // Split into parts
            String[] parts = str.split(DELIMITER, -1); // Keep trailing empty parts

            // Remove the last part if it's empty (due to trailing delimiter)
            List<String> result = new ArrayList<>(Arrays.asList(parts));
            if (!result.isEmpty() && result.get(result.size() - 1).equals("")) {
                result.remove(result.size() - 1);
            }

            return result;
        }

        public static void main(String[] args) {
            day22.day22b sol= new day22.day22b();
            List<String> myList = new ArrayList<>();
            List<String> strs = Arrays.asList("neet", "code", "love", "you");
//        myList=sol.decode(strs);
            myList = sol.decode(sol.encode(strs));
            System.out.println(myList);
        }
    }
