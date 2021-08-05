package code10;

public class Queue<t> {
    public Node front;
    public Node rear;
    public void enqueue(t value) {
        Node newnodeQueue = new Node(value);
       if (front==null){
           front=newnodeQueue;
           rear=newnodeQueue;
       }else {
           rear.next=newnodeQueue;
           rear=newnodeQueue;
       }
    }
    public t peek() {
        if (front!=null){
           return  (t) front.nodeValue;

        }else {
            System.out.println("there is an error");
        }return  (t) front.nodeValue;
    }
    public boolean isEmty() {
        if (front == null) {
            return true;
        } return false;
    }
}
