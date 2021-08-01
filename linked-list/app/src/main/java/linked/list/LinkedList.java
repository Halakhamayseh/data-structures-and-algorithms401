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
       strings=strings+"{"+current.valueNode+"}->";
               current=current.next;
   }
        strings=strings+"null";
   return strings;
    }
    public void append(int value){
        Node nweNode=new Node(value);
        if(head.next!=null){
            nweNode.next=head;
            System.out.println(head);
        }
        head=nweNode;
        System.out.println(head);
        System.out.println(value);
    }
    public void insertbefore(int valueNode,int newValuebefore){
        Node nweNode=new Node(newValuebefore);
        Node current=head;
        if(head!=null){
            nweNode.next=head;
            if(current.valueNode==valueNode){
                //current=newValuebefore;
            }
            System.out.println(head);
        }
        current=current.next;
        System.out.println(head);

    }
    public void insertAfter(int valueNode,int newValueAfter){
        Node nweNode=new Node(newValueAfter);
        Node current=head;
        if(current.valueNode!=valueNode){
            current=current.next;

            System.out.println(head);
        }
        nweNode.next=current.next;
        current.next=nweNode;
        System.out.println(head);

    }
    }
