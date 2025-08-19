package day15;
import java.util.*;

public class day15e {
        public static void main(String[] args) {
            TimeMap timeMap = new TimeMap();

            // Example usage
            timeMap.set("foo", "bar", 1);
            System.out.println(timeMap.get("foo", 1)); // "bar"
            System.out.println(timeMap.get("foo", 3)); // "bar"

            timeMap.set("foo", "bar2", 4);
            System.out.println(timeMap.get("foo", 4)); // "bar2"
            System.out.println(timeMap.get("foo", 5)); // "bar2"
        }
    }

    class TimeMap {
        private Map<String, TreeMap<Integer, String>> m;

        public TimeMap() {
            m = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {
            m.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp, value);
        }

        public String get(String key, int timestamp) {
            if (!m.containsKey(key)) return "";
            TreeMap<Integer, String> timestamps = m.get(key);
            Map.Entry<Integer, String> entry = timestamps.floorEntry(timestamp);
            return entry == null ? "" : entry.getValue();
        }
    }

