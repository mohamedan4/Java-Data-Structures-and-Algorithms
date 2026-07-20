package MyImplementationLinkedListQueue;

public class QueueList {
    public Queue head = null;
    public Queue tail = null;
    int size = 0;

    public boolean isEmpty(){
        return head == null;
    }

    public void enQueue(int data){
        Queue newQueue = new Queue(data);
        if(isEmpty()){
            head = tail = newQueue;
        }else {
            tail.next=newQueue;
            tail=newQueue;
        }
        size++;
    }

    public void deQueue(){
        if(isEmpty()){
            System.out.println("The queue is empty!");
        }else {
            head = head.next;
            size--;
        }
    }

    public void display(){
        Queue current = head;
        if(!isEmpty()){
            System.out.println("The Queue is: ");
            for (int i = 0; i < size; i++) {
                System.out.println((i+1)+": "+current.data);
                current=current.next;
            }
        }else {
            System.out.println("Queue is empty!!!");
        }
        System.out.println();
    }
}
