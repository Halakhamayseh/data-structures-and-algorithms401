/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package code15;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }


    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        BinarySearchTree<Integer> firstObj=new BinarySearchTree<>();
        firstObj.addFuction(11);
        firstObj.addFuction(12);
        firstObj.addFuction(20);
       // System.out.println(firstObj.containsFunction(11));
        //System.out.println(firstObj.containsFunction(12));
       // System.out.println(firstObj.containsFunction(20));
      // System.out.println(firstObj.containsFunction(15));

        BinaryTree<Integer> secObj=new BinaryTree<>();
        secObj.root = new Node(2);
        secObj.root.left = new Node(7);
        secObj.root.right = new Node(5);
        secObj.root.left.right = new Node(6);
        secObj.root.left.right.left = new Node(1);
        secObj.root.left.right.right = new Node(11);
        secObj.root.right.right = new Node(9);
        secObj.root.right.right.left = new Node(4);
       // secObj.setRoot(new Node(5));
//        secObj.getRoot().setLeft(new Node(3));
//        secObj.getRoot().setRight(new Node(7));
//        secObj.getRoot().getLeft().setLeft(new Node(2));
//        secObj.getRoot().getLeft().setRight(new Node(6));
//        secObj.getRoot().getRight().setRight(new Node(9));
//        secObj.getRoot().getLeft().getRight().setLeft(new Node(12));
//        secObj.getRoot().getLeft().getRight().setRight(new Node(11));
//        secObj.getRoot().getRight().getRight().setRight(new Node(4));

       // secObj.root.right.right.left=new Node(7);
  System.out.println(secObj.maxNumber(secObj.root));
        //System.out.println(secObj.root.nodeValue);
    }
}