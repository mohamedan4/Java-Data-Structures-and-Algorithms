package Queue;

public class QueueApp {
    public static void main(String[] args){
        Queue queue = new Queue(5);

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        // liste doluyken bir eleman ekleyelim
        queue.enQueue(60);

        // listedeki tum elemanlari ekrana basalim
        queue.print();

        // iki eleman silelim
        queue.deQueue();
        queue.deQueue();

        // listedeki tum elemanlari ekrana basalim
        queue.print();

        // iki eleman ekleyelim
        queue.enQueue(100);
        queue.enQueue(200);

        // listeyi ekrana basalim
        queue.print();
    }
}
