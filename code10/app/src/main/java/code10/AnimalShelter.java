package code10;

public class AnimalShelter<Animal>{
    public Node<Animal> front;
    public Node <Animal>rear;
    public void enqueue(Animal value) {
        Node<Animal> newnodeQueue = new Node<>(value);
        if (front==null){
            front=newnodeQueue;
            rear=newnodeQueue;
            //System.out.println(rear);
        }else {
            rear.next=newnodeQueue;
            rear=newnodeQueue;
           // System.out.println(rear.toString());
        }
    }
    public Animal dequeue() {
        Animal dequeuevalue = null;
        if (front == null) {
            try {
                throw new Exception("Empty");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            dequeuevalue =  front.nodeValue;
            front = front.next;

        }
        return dequeuevalue;
    }
//public String animalName;

//    @Override
//    public String toString() {
//        AnimalShelter<code10.Animal> enQSh = new AnimalShelter<code10.Animal>();
//        Cat cat = new Cat(enQSh.front.nodeValue.animalName);
//        Dog dog = new Dog(enQSh.front.nodeValue.animalName);
//        enQSh.enqueue(cat);
//
//        return "AnimalShelter{" +
//                "front=" + enQSh.front.nodeValue.animalName +
//                ", rear=" + enQSh.rear.nodeValue.animalName +
//                '}';
//    }
    }

