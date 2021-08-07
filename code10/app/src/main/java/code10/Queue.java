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
        if (front == null) {
            try {
                throw new Exception("throw exception there some thing Wrong");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            dequeuevalue = (t) front.nodeValue;
            front = front.next;

        }
        return dequeuevalue;
    }
    public t peek() {
        if (front==null){
            try {
                throw new Exception("there is an empty");
            } catch (Exception e) {
                e.printStackTrace();
            }


        }else {
            return  (t) front.nodeValue;

        }return  (t) front.nodeValue;
    }
    public boolean isEmty() {
        if (front == null) {
            return true;
        } return false;
    }
    public String print() {
        String res = "";
        if (isEmty()){
            System.out.println("Stack isEmty");
        }else {
            Node current=  front;
            Node current2= rear ;
            res+="{"+current.nodeValue+"}"+"{"+current2.nodeValue+"}";
            current = current.next;
            current2 = current2.next;
        }return res;
    }
//    public String show() {
//        if (front == null) {
//            return true;
//        } return false;
//    }
}
