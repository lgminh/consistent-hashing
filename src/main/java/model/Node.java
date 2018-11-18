package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Node {
    private long minKey;
    private long maxKey;
    private HashMap<Long, Long> keyValues;

    public Node(long minKey, long maxKey, HashMap<Long, Long> keyValues) throws Exception {
        try {
            if (minKey > maxKey) {
                throw new IllegalArgumentException("maxKey must be larger than minKey");
            }
            this.minKey = minKey;
            this.maxKey = maxKey;
            this.keyValues = keyValues;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public boolean containKey(long key) {
        return this.minKey <= key && key <= this.maxKey;
    }

    public long getValue(long key) {
        return this.keyValues.get(key);
    }

    public void insertKey(long key, long value) {
        if (!keyValues.containsKey(key)) {
            keyValues.put(key, value);
        }
    }
}
