import model.HashFunction;
import model.Node;

import java.util.ArrayList;

public class ConsistentHashing {
    private HashFunction hash;
    private ArrayList<Node> nodes;
    private Supervisor supervisor;
    public ConsistentHashing(HashFunction hash, Supervisor supervisor, ArrayList<Node> nodes) {
        this.hash = hash;
        this.supervisor = supervisor;
        this.nodes = nodes;
    }

}
