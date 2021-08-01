package code06;

public class LinkedList {
    Node head;
    public void  append(int value){
        Node nweNode=new Node(value);
       if(head!=null){
           nweNode.next=head;

       }
       head=nweNode;

    }
}
