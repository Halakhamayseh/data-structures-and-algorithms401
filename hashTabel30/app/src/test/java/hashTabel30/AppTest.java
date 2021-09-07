/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashTabel30;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    //Adding a key/value to your hashtable results in the value being in the data structure
    //Retrieving based on a key returns the value stored
    //Successfully returns null for a key that does not exist in the hashtable
    //Successfully handle a collision within the hashtable
    //Successfully retrieve a value from a bucket within the hashtable that has a collision
    //Successfully hash a key to an in-range value
    @Test void testCode30() {
        HashTable<String>newHashTable=new HashTable<>(4);

        newHashTable.add("a","firtAdd");
        newHashTable.add("tow","towAdd");
        String resultAdd="firtAdd";
        String resultAddTow="towAdd";

        assertEquals(resultAdd,newHashTable.get("a"));
        assertEquals(resultAddTow,newHashTable.get("tow"));

        assertTrue(newHashTable.contain("a"));
        assertFalse(newHashTable.contain("b"));

        assertEquals(1, newHashTable.getHash("hala"));


    }
    @Test void testCode31(){
        HashmapRepeatedWord testRepeated=new HashmapRepeatedWord();
        String test="It was a queer, sultry SUMMer , the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        assertEquals("summer", testRepeated.findFirstRepeatedWord(test));

    }
    ////////////code32
    @Test void testCode32(){
        BinaryTree<Integer> secObj=new BinaryTree<>();
        secObj.root = new Node(150);
        secObj.root.left = new Node(100);
        secObj.root.right = new Node(250);
        secObj.root.left.left = new Node(75);
        secObj.root.left.right = new Node(160);
        secObj.root.left.right.left = new Node(125);
        secObj.root.left.right.right = new Node(175);
        secObj.root.right.left = new Node(200);
        secObj.root.right.right = new Node(350);
        secObj.root.right.right.left = new Node(300);
        secObj.root.right.right.right = new Node(500);
        /////
        BinaryTree<Integer> secObjTow=new BinaryTree<>();
        secObjTow.root = new Node(42);
        secObjTow.root.left = new Node(100);
        secObjTow.root.right = new Node(600);
        secObjTow.root.left.left = new Node(15);
        secObjTow.root.left.right = new Node(160);
        secObjTow.root.left.right.left = new Node(125);
        secObjTow.root.left.right.right = new Node(175);
        secObjTow.root.right.left = new Node(200);
        secObjTow.root.right.right = new Node(350);
        secObjTow.root.right.right.left = new Node(4);
        secObjTow.root.right.right.right = new Node(500);
        List<Integer> result= new ArrayList();
        result.add(100);
        result.add(160);
        result.add(125);
        result.add(175);
        result.add(200);
        result.add(350);
        result.add(500);
        HashmapTreeIntersection<Integer>testTreeInsertion=new HashmapTreeIntersection<>();
        assertEquals(result, testTreeInsertion.hashmapTreeIntersectionFunction(secObj,secObjTow));

    }

}
