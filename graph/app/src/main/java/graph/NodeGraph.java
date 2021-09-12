package graph;

public class NodeGraph {
    public String value;
    public int weight;

    public NodeGraph(String value, int weight) {
        this.value = value;
        this.weight = weight;
    }

    public NodeGraph(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "NodeGraph{" +
                "value=" + value +
                '}';
    }
}
