/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package code10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test void testpush() {
        Stack<String> newobj=new Stack<>();
        System.out.println(newobj.isEmty());
        newobj.push("H");
        newobj.push("m");
        newobj.push("n");
       //output //System.out.println(newobj.top.nodeValue);
        String res="n";
        assertEquals(false,newobj.isEmty());
        assertEquals(res,newobj.top.nodeValue);
    }
    @Test void testpop() {
        Stack<String> newobj=new Stack<>();

        newobj.push("m");
        newobj.push("l");
        newobj.pop();
        newobj.pop();

        assertEquals(true,newobj.isEmty());
    }
    @Test void testpeekStack() {
        Stack<String> newobj=new Stack<>();
        newobj.push("H");
        newobj.push("m");
        String res="m";
        assertEquals(res,newobj.peek());
    }
    @Test void enqueue() {
        Queue<String> newobj2=new Queue<>();
        newobj2.enqueue("H");
        newobj2.enqueue("m");
        newobj2.enqueue("d");
        String resfront="H";
        String resrear="d";
        assertEquals(false,newobj2.isEmty());
        assertEquals(resfront,newobj2.front.nodeValue);
        assertEquals(resrear,newobj2.rear.nodeValue);
    }
    @Test void dequeue() {
        Queue<String> newobj2=new Queue<>();
        newobj2.enqueue("H");
        newobj2.enqueue("m");
        newobj2.dequeue();
        newobj2.dequeue();
        assertEquals(true,newobj2.isEmty());
    }
    @Test void testpeekQueue() {
        Queue<String> newobj2=new Queue<>();
        newobj2.enqueue("H");
        newobj2.enqueue("m");
        newobj2.enqueue("d");
        newobj2.dequeue();
        String res="m";
        assertEquals(res,newobj2.peek());
    }
    @Test void code12() {
                AnimalShelter<Animal>enQSh=new AnimalShelter<Animal>();
                Cat cat=new Cat("cat1");
                Dog dog=new Dog("Dog1");
                Dog dog2=new Dog("Dog2");
                enQSh.enqueue(cat);
                enQSh.enqueue(dog);
                enQSh.enqueue(dog2);
                String resfront="cat1";
                String resrear="Dog2";
              assertEquals(resfront,enQSh.front.nodeValue.animalName);
              assertEquals(resrear,enQSh.rear.nodeValue.animalName);
                //System.out.println(enQSh.front.nodeValue.animalName);
                //System.out.println(enQSh.dequeue().animalName);
        String resdequeue="Dog1";
        enQSh.dequeue();
        assertEquals(resdequeue,enQSh.front.nodeValue.animalName);
    }
    @Test void code13() {
        StackQueueBrackets<String> newObj=new StackQueueBrackets<>();
        String brackets="([])";
        String brackets2="([]";
        if (newObj.checkStackQueueBrackets(brackets)){
            System.out.println("Balanced");
        }else System.out.println("Not Balanced");
        if (newObj.checkStackQueueBrackets(brackets2)){
            System.out.println("Balanced");
        }else System.out.println("Not Balanced");
        assertTrue(newObj.checkStackQueueBrackets(brackets));
        assertFalse(newObj.checkStackQueueBrackets(brackets2));
    }

}