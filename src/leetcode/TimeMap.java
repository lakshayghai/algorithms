package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TimeMap {

    private Map<String, List<Data>> keyStore;

    public TimeMap() {
        keyStore = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {

        List<Data> timeStore;
        if(keyStore.containsKey(key)) {
            timeStore = keyStore.get(key);

        } else {
            timeStore = new ArrayList<>();
        }
        timeStore.add(new Data(timestamp, value));
        keyStore.put(key, timeStore);

    }

    public String get(String key, int timestamp) {
        if(keyStore.containsKey(key)) {
            List<Data> timeStore = keyStore.get(key);
            int left = 0;
            int right = timeStore.size() -1;
            while (left < right) {
                int mid = left + right +1/2;
                if(timeStore.get(mid).getTimestamp()<=timestamp) {
                    left = mid;
                } else {
                    right = mid-1;
                }
            }
            return timeStore.get(left).getTimestamp() > timestamp ? "" : timeStore.get(left).getValue();

        } else {
            return "";
        }
    }

    class Data {
        private int timestamp;
        private String value;

        public Data(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }

        public int getTimestamp() {
            return timestamp;
        }


        public String getValue() {
            return value;
        }

    }


    public static void main(String[] args) {
        TimeMap tm = new TimeMap();
        tm.set("foo", "bar", 1);  // store the key "foo" and value "bar" along with timestamp = 1.
        System.out.println(tm.get("foo", 1));         // return "bar"
        System.out.println(tm.get("foo", 3));         // return "bar", since there is no value corresponding to foo at timestamp 3 and timestamp 2, then the only value is at timestamp 1 is "bar".
        tm.set("foo", "bar2", 4); // store the key "foo" and value "bar2" along with timestamp = 4.
        System.out.println(tm.get("foo", 4));         // return "bar2"
        System.out.println(tm.get("foo", 5));
        tm.set("love", "high", 10);
        tm.set("love", "low", 20);
        System.out.println(tm.get("love", 5));
        System.out.println(tm.get("love", 10));
        System.out.println(tm.get("love", 15));
        System.out.println(tm.get("love", 20));
        System.out.println(tm.get("love", 25));

    }
}
