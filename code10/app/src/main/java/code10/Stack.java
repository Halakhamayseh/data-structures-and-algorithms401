package code10;

public class Stack <t> {
    public Node top;

    public void push(t value) {
        Node newnode = new Node(value);
        if (top == null) {
            top = newnode;
        } else {
            newnode.next = top;
            top = newnode;
            //return top;
        }
    }

    ///////////
    public t pop() {
        t popvalue = null;
        if (top != null) {
            popvalue = (t) top.nodeValue;
            top = top.next;
        } else {
            System.out.println("throw exception there some thing erong");
        }
        return popvalue;
    }

    public t peek() {
        if (top != null) {
            return (t) top.nodeValue;
        } else {
            System.out.println("throw exception there some thing erong");
        }
return (t) top.nodeValue;
    }

    public boolean isEmty() {
        if (top == null) {
            return true;
        } return false;
    }
}
