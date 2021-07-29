package linked.list;

public class LinkedList {
    Node head;
    public void insert(int num){
        Node newObject=new Node (num);
        if(head != null){
            newObject.next=head;
        }
        head=newObject;
    }
    public boolean includes(int valueNode) {
        Node current = head;
        while (current != null) {
            if (current.valueNode == valueNode) {
                return true;
            }
            current = current.next;
        }return false;
    }
    public String toString(){
      String strings="";
      Node current=head;
   while (current!=null){
       strings=strings+"";
               current=current.next;
   }
        strings=strings+"null";
   return strings;
    }
    }
