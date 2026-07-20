package LinkQueue;

public class LinkQueueApp {
    public static void main(String[] args) {
        LinkQueue linkQueue = new LinkQueue();
        linkQueue.enQueue(10);
        linkQueue.enQueue(20);
        linkQueue.enQueue(30);
        linkQueue.enQueue(40);
        linkQueue.enQueue(50);


        // listedeki tum elemanlari ekrana basalim
        linkQueue.print();

        // uc eleman silelim
        linkQueue.deQueue();
        linkQueue.deQueue();
        linkQueue.deQueue();

        // listedeki tum elemanlari ekrana basalim
        linkQueue.print();

        // iki eleman ekleyelim
        linkQueue.enQueue(100);
        linkQueue.enQueue(200);

        // listeyi ekrana basalim
        linkQueue.print();
    }
}
