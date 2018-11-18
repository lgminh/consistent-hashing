import model.HashFunction;
import model.Node;

import java.util.ArrayList;

public class Supervisor {
    private ArrayList<Node> nodes;
    private HashFunction hashFunction;
    public Supervisor(HashFunction hashFunction, ArrayList<Node> nodes) {
        this.hashFunction = hashFunction;
        this.nodes = nodes;
    }

    public long hashKey(long key) {
        return this.hashFunction.hash(key);
    }

    public void addKey(long key) {
        long value = this.hashFunction.hash(key);
        //find the node to insert the key
        Node node = findNode(key);
        // insert the key
        node.insertKey(key, value);
    }

    private Node findNode(long key) {
        Node node = null;
        for (Node currentNode: nodes) {
            if (currentNode.containKey(key)) {
                node = currentNode;
                break;
            }
        }
        return node;
    }



    public void distributeKey() {

    }
}
