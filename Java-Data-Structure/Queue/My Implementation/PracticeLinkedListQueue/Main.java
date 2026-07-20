package MyImplementationLinkedListQueue;

public class Main {
    public static void main(String[] args){
        QueueList theList = new QueueList();

        theList.enQueue(10);
        theList.enQueue(20);
        theList.enQueue(30);
        theList.enQueue(40);
        theList.display(); /*
                              The Queue is:
                              1: 10
                              2: 20
                              3: 30
                              4: 40
                                    */
        theList.deQueue();
        theList.display();  /*
                              The Queue is:
                              1: 20
                              2: 30
                              3: 40
                                    */

        theList.enQueue(100);
        theList.display();  /*
                              The Queue is:
                              1: 20
                              2: 30
                              3: 40
                              4: 100
                                     */
        theList.deQueue();
        theList.deQueue();
        theList.deQueue();
        theList.deQueue();
        theList.display();
                           /*
                             Queue is empty!!!
                            */
    }
}
