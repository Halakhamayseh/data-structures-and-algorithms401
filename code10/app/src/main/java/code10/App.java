/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package code10;

import java.util.Arrays;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new App().getGreeting());

//        Stack<String> newObject=new Stack<>();
//        newObject.push("m");
//        newObject.push("o");
//        System.out.println(newObject.top.nodeValue);
        //Stack<String> newobj=new Stack<>();
       // System.out.println(newobj.isEmty());
        //newobj.push("H");
        //newobj.push("m");
        //newobj.push("n");
       ///Arrays.toString(newobj.toArray());
       // for() System.out.println( + "");
     //  System.out.println(newobj.top.nodeValue);
       // System.out.println(newobj.isEmty());
      // newobj.pop();
      //  System.out.println(newobj.peek());
        //System.out.println(newobj.print());
       // System.out.println(newobj.isEmty());

       // System.out.println(newobj.top.nodeValue);
//        try {
//            System.out.println(newobj.pop());
//            System.out.println(newobj.top.nodeValue);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        Queue<String> newobj2=new Queue<>();
        //System.out.println(newobj2.isEmty());
        newobj2.enqueue("H");
        newobj2.enqueue("m");
        newobj2.enqueue("d");
        ///Arrays.toString(newobj.toArray());
        // for() System.out.println( + "");
        //System.out.println(newobj2.front.nodeValue);
        //System.out.println(newobj2.rear.nodeValue);
        // System.out.println(newobj.isEmty());
       // newobj2.dequeue();
       // System.out.println(newobj2.peek());
       // System.out.println(newobj2.print());
       // System.out.println(newobj2.isEmty());
        //stackQueuePseudo<Integer> newobjpesudo=new stackQueuePseudo<>();
//        newobjpesudo.enQueue(1);
//        newobjpesudo.enQueue(2);
//        System.out.println(newobjpesudo.firstS.toString());
//12//
        AnimalShelter<Animal>enQSh=new AnimalShelter<Animal>();
        Cat cat=new Cat("cat1");
        Dog dog=new Dog("Dog1");
        //AnimalShelter enQSh=new AnimalShelter();
       //Animal cat=new Cat("CAT NAME");
        enQSh.enqueue(dog);
        enQSh.enqueue(cat);

        //System.out.println(enQSh.front.nodeValue.animalName);
        //System.out.println(enQSh.toString());
        //System.out.println(cat.animalName);

        //System.out.println(enQSh.dequeue().animalName);

       //System.out.println(enQSh.rear.nodeValue);
      //System.out.println(enQSh.toString());
        //Animal cat2=new Animal("CAT2 NAME2");
       // enQSh.enqueue(cat2);
     //System.out.println(enQSh.toString());
        //code13//
        StackQueueBrackets<String> newObj=new StackQueueBrackets<>();
        String brackets="([])";
        String brackets2="([]";
        if (newObj.checkStackQueueBrackets(brackets)){
            System.out.println("Balanced");
        }else System.out.println("Not Balanced");
        if (newObj.checkStackQueueBrackets(brackets2)){
            System.out.println("Balanced");
        }else System.out.println("Not Balanced");

    }

}