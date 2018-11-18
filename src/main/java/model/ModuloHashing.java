package model;

public class ModuloHashing extends HashFunction {
    private int n;

    public ModuloHashing(String hash, int n) {
        super(hash);
        this.n = n;
    }

    @Override
    public long hash(long key) {
        return  key % this.n;
    }
}
