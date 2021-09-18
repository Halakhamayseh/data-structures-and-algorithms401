package graph;


    public class Node<t> {
        public t nodeValue;
        public Node<t> left;
        public Node<t> right;
        public Node next;

        public Node(t nodeValue) {
            this.nodeValue = nodeValue;
            left = right = null;
        }
    }

