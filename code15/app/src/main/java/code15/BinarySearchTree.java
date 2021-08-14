package code15;

public class BinarySearchTree<t> extends BinaryTree{
    public void addFuction(t value){
    root=addFuctionHelper(root,value);
    }
    public Node addFuctionHelper(Node root,t value){
        //Node newNode=new Node (value);
        if(root==null){
            root= new Node (value);
        }else if((int)root.nodeValue>(int)value){
            root.left=addFuctionHelper(root.left,value);
        }else {
            root.right=addFuctionHelper(root.right,value);
        }return root;
    }
    public boolean containsFunction(t value){
      // Node newNode=root;
        while (root!=null){
            if((int)root.nodeValue>(int)value){
                root=root.left;
                System.out.println((int)root.nodeValue);
                return false;
            }
            if((int)root.nodeValue>(int)value){
                root=root.right;
                return false;
            }
            if((int)root.nodeValue==(int)value){
                return true;
            }

        }
        return false;
    }

}
