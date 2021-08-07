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
    public t dequeue() {
        t dequeuevalue = null;
        if (front != null) {
            dequeuevalue = (t) front.nodeValue;
            dequeuevalue = (t) front.next;
        } else {
            try {
                throw new Exception("throw exception there some thing Wrong");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return dequeuevalue;
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
//    public String show() {
//        if (front == null) {
//            return true;
//        } return false;
//    }
}
