package code15;

public class Node<t> {
    private t nodeValue;
    private Node<t> left;
   private Node<t> right;

    public Node(t nodeValue) {
        this.nodeValue = nodeValue;
    }

    public t getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(t nodeValue) {
        this.nodeValue = nodeValue;
    }

    public Node<t> getLeft() {
        return left;
    }

    public void setLeft(Node<t> left) {
        this.left = left;
    }

    public Node<t> getRight() {
        return right;
    }

    public void setRight(Node<t> right) {
        this.right = right;
    }
}
