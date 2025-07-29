
package day9;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


        public class day9b {
            public String encode(List<String> strs) {
                String enco= "";
                for(String s:strs){
                    enco+=s;
                }
                return enco;
            }

            public List<String> decode(String str) {
                return new ArrayList<>();
            }

            public static void main(String[] args) {
                day9b sol= new day9b();
                List<String> myList = new ArrayList<>();
                List<String> strs = Arrays.asList("neet", "code", "love", "you");
                myList = sol.decode(sol.encode(strs));
                System.out.println(myList);
            }
        }
