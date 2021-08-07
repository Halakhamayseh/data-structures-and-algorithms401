package linked.list;

public class LinkedList {
    Node head;
    Node tail;

    public  void insert(int num) {
        Node newObject = new Node(num);
        if (head != null) {
            newObject.next = head;
        }
        head = newObject;
    }

    public boolean includes(int valueNode) {
        Node current = head;
        while (current != null) {
            if (current.valueNode == valueNode) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public String toString() {
        String strings = "";
        Node current = head;
        while (current != null) {
            strings = strings + "{" + current.valueNode + "}->";
            current = current.next;
        }
        strings = strings + "null";
        return strings;
    }

    //public void append(int value){
    // Node nweNode=new Node(value);
    //if(head.next!=null){
    //head.next=nweNode;
    //nweNode.next=head;
    //System.out.println(head.valueNode);
    //}// added while loop head dosenot null
    //inside it use if to check he.next=null then head.next might use return  // =newnode//out side head =head.next
    //head=nweNode;
    // while(head!=null){
    //  if(head.next!=null){
    //  head.next=nweNode;
    //  return;
    // }
    //}
    // head=head.next;
    // head=nweNode;
    // System.out.println(nweNode.valueNode);
    //System.out.println(value);
    //}
    ////////////////////////code 06////////////////////////////////////////
    public void append(int value) {
        Node nweNode = new Node(value);

        //checks if list is empty
        if (head == null) {
            head = nweNode;

        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = nweNode;
        }
    }

    public void insertbefore(int valueNode, int newValuebefore) {
        Node nweNode = new Node(newValuebefore);
        Node current = head;
        if (head != null) {
            nweNode.next = head;
            if (current.valueNode == valueNode) {
                nweNode.next = head;
                head = nweNode;
                System.out.println(nweNode.valueNode);
            }
            //System.out.println(head);
        }
        current = current.next;
        //System.out.println(head);

    }

    public void insertAfter(int valueNode, int newValueAfter) {
        Node nweNode = new Node(newValueAfter);
        Node current = head;
        if (current.valueNode != valueNode) {
            current = current.next;

            System.out.println(head);
        }
        nweNode.next = current.next;
        current.next = nweNode;
        System.out.println(nweNode);

    }
//////////////////just to test some function//////////////////////////////////////
    public void print(Node n) {
        while (n != null) {
            System.out.println(n.valueNode + " ");//to print all node to see results & debuging the code
            n = n.next;
        }
    }
////////////////////code 07/////////////////////////////////
    public int linkedlistkth(int k) {
        int length = 0;
        Node value = head;

        for (int i = 0; value != null; i++) {
            value = value.next;
            length++;
        }
        value = head;
        for (int i = 1; i < length - k + 1; i++) {
            value = value.next;
        }
        return value.valueNode;
    }
/////////////////////////////code08////////////////////////////////
    public LinkedList zip(LinkedList list1, LinkedList list2) {
        LinkedList mergedLinkedlinkedlist=new LinkedList();
        Node currList1 = list1.head;
        Node currList2 = list2.head;
        //while (currList1!=null || currList1)
        if (currList1 == null) {
            //insert(currList2.valueNode);
            list1.append();
        } else if (currList2 == null) {
            insert(currList1.valueNode);
        } else if (currList1 != null && currList2 != null) {
            list2.insertbefore(currList1.valueNode, currList2.valueNode);
            currList2 = currList2.next;
            currList1 = currList1.next;
        } else if (currList1 != null){
            list2.append(currList1.valueNode);

        }
        list1.head=currList1;
       return list2;
    }
    //////////////////////code09////////////////////////////////////////
    public static LinkedList reversedLinkedList(LinkedList listone) {
        //LinkedList reversedLinkedListArray = new LinkedList();
        Node curr1 = listone.head ;
        Node next=null;
        //Node currFinall=listone.tail;
        // Node next=head.next;
        Node previce = null;
        while (curr1 != null) {
            next=curr1.next;
           curr1.next = previce;
            //curr1=previce.next;
           previce=curr1;
           curr1=next;

        }
        listone.head=previce;
       // System.out.println((listone.head.valueNode));
        return listone;
    }
}
