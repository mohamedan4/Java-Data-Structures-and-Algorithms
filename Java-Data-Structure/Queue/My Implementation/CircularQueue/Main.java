package CircularQueue;

public class Main {
    public static void main(String[] args) {
        CircularQueue list = new CircularQueue();
        list.enQueue(22);
        list.enQueue(33);
        list.enQueue(44);
        list.enQueue(55);
        list.enQueue(66);
        list.display();

        list.deQueue();
        list.deQueue();
        list.enQueue(100);
        list.enQueue(200);

        list.display();



//        System.out.println();
//        list.display();
//        System.out.println();
//        list.deQueue();
//        list.deQueue();
//        list.deQueue();
//        System.out.println();
//        list.display();
//        System.out.println();
//        list.enQueue(100);
//        list.enQueue(200);
//        System.out.println();
//        list.display();
    }
}