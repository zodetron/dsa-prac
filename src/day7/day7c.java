package day7;
import java.util.*;

public class day7c {
        public boolean isAnagram(String s, String t) {
            HashSet<Character>setA=new HashSet<>();
            for(int i=0;i<s.length();i++){
                setA.add(s.charAt(i));
            }
            System.out.println(setA);
            return true;
        }
    public static void main(String[] args) {
        day7c obj = new day7c();
        String s1 =new String ("Hellow");
        String t1 = new String("weollh");

        isAnagram(s1,t1);
    }
}
