package persistent;

import java.util.ArrayList;

public interface KeyValueDAO {
    public ArrayList<Long> getKeys();
    public void setValue(long key, long value);
    public ArrayList<Long> getValues();
    public void addKey(long key, long value);
    public long getValue(long key);
}
