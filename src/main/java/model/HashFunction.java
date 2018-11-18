package model;

public abstract class HashFunction {
    private String hashFunction;

    protected HashFunction(String hash) {
        this.hashFunction = hash;
    }

    public long hash(long key) {
        return 0;
    }
}
