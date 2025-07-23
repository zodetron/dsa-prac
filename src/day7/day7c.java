//package day7;
//import java.util.HashMap;
//bad complexity and very complex if used hashmap
//and hash map is not possible
//class day7c {
//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//
//        HashMap<Character, Integer> charCountMap = new HashMap<>();
//
//        for (char c : s.toCharArray()) {
//            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
//        }
//
//        for (char c : t.toCharArray()) {
//            if (!charCountMap.containsKey(c) || charCountMap.get(c) == 0) {
//                return false;
//            }
//            charCountMap.put(c, charCountMap.get(c) - 1);
//        }
//
//        return true;
//    }
//
//    public static void main(String[] args) {
//        isAnagram();
//    }
//}
//
