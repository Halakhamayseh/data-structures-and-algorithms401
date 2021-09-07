package hashTabel30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashmapTreeIntersection<Integer> {

public List <Integer> hashmapTreeIntersectionFunction(BinaryTree firstTree,BinaryTree secondTree){
          //store each tree value in list use preorder to back root left right as ex
    List arrayOne= firstTree.preorderFunction(firstTree.root);
    List arrayTow= secondTree.preorderFunction(secondTree.root);
    //to store Intersection
    List result=new ArrayList();

    ///looping through first array and add the itme
//    for (int a = 0; a < arrayOne.size(); a++) {
//        hashSetResult.add((Integer) arrayOne.get(a));
//    }
    ///looping through second array and if firt array include the item in second array add this item to result array
    for (int b = 0; b <arrayTow.size() ; b++) {
        if(arrayOne.contains(arrayTow.get(b))){
            result.add(arrayTow.get(b));
//            System.out.println(arrayTow.get(b));
        }
       ///////return result
    }return result;
}
}
