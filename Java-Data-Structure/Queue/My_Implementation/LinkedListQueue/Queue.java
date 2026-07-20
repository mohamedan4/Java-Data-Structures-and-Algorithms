package LinkedListQueue;

public class Queue {
    private Node head, tail;
    private int size =0;

    public Queue(){
        head = tail = null;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void enQueue(int data){
        Node newNode = new Node(new NodeData(data));
        if(isEmpty()){
            head = tail = newNode;
        }else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public NodeData deQueue(){
        if (isEmpty()){
            System.out.println("Queue is empty!!!");
            return null;
        }else {
            NodeData temp = head.getData();
            head = head.getNext();
            if(head == null) {
                tail = null;
            }
            size--;
            return temp;
        }
    }

    public NodeData head(){
        if (isEmpty()){
            System.out.println("Queue is empty!!!");
            return null;
        }else {
            return head.getData();
        }
    }

    public NodeData tail(){
        if (isEmpty()){
            System.out.println("Queue is empty!!!");
            return null;
        }else {
            return tail.getData();
        }
    }

    public void print(){
        Node current = head;
        for (int i = 1; i <= size; i++) {
            System.out.println(i+": "+current.getData());
            current=current.getNext();
        }
        System.out.println();
    }
}
