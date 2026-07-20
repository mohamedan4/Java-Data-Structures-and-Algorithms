package LinkQueue;

public class LinkQueue {
    LinkList linkQueue;
    public LinkQueue(){
        linkQueue = new LinkList();
    }

    public void enQueue(int data){
        linkQueue.insertHead(data);
    }

    public void deQueue(){
        linkQueue.deleteLast();
    }

    public void print(){
        linkQueue.print();
    }
}
