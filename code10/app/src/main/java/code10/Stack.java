package code10;

public class Stack <t> {
    public Node top;

    public void push(t value) {
        Node newnodepush= new Node(value);
        if(top==null){
            top=newnodepush;
        }else {
            newnodepush.next=top;
            top=newnodepush;
        }

    }

    ///////////wrong ways ////
//    public t pop() {
//        t popvalue = null;
//        if (top != null) {
//            popvalue = (t) top.nodeValue;
//            top = top.next;
//        } else {
//            try {
//                throw new Exception("throw exception there some thing Wrong");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//        }
//        return popvalue;
//    }
    public t pop() {
        t popvalue = null;
        if (top == null) {
            try {
                throw new Exception("throw exception there some thing Wrong");
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            popvalue = (t) top.nodeValue;
            top = top.next;

        }
        return popvalue;
    }
///////////////wrong ways to check
//    public t peek() {
//        if (top != null) {
//            return (t) top.nodeValue;
//        } else {
//            try {
//                throw new Exception("throw exception there some thing Wrong");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//return (t) top.nodeValue;
//    }
public t peek() {
    if (top == null) {
        try {
            throw new Exception("throw exception there some thing Wrong");
        } catch (Exception e) {
            e.printStackTrace();
        }

    } else {
        return (t) top.nodeValue;
    }
    return (t) top.nodeValue;
}
    public boolean isEmty() {
        if (top == null) {
            return true;
        } return false;
    }
    public String print() {
        String res = "";
        if (isEmty()){
            System.out.println("Stack isEmty");
        }else {
            Node current=  top;
            res+="{"+current.nodeValue+"}";
          current = current.next;
        }return res;
    }

}
