package LinkedListQueue;

public class Main {
    public static void main(String[] args){
        Queue theQueue = new Queue();

        theQueue.enQueue(20);
        theQueue.enQueue(40);
        theQueue.enQueue(60);
        theQueue.enQueue(80);

        while (!theQueue.isEmpty()){
            System.out.print(theQueue.deQueue() + " ");
        }
        System.out.println();

//        theQueue.head();
//        theQueue.print();
    }
}
