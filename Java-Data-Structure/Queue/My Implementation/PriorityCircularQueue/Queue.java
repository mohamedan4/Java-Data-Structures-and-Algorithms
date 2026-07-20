package PriorityCircularQueue;

public class Queue {
    int maxSize;
    int front,rear;
    int[] queue ;
    int[] priority;

    public Queue(int size){
        this.queue = new int[size];
        this.priority = new int[size];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty(){
        return front==-1;
    }

    public boolean isFull(){
        return (front==0 && rear==maxSize-1 || front==rear+1);
    }

    public void enQueue(int data, int priority){
        if(isFull()){
            System.out.println("Queue is full!!!");
        }else if(isEmpty()){
            front = rear = 0;
            queue[rear]=data;
            this.priority[rear]=priority;
        }else {
            rear = (rear+1)%maxSize;
            queue[rear]=data;
        }
    }

    public int deQueue(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }else if (front == rear){
            int temp = queue[front];
            front=-1;
            rear=-1;
            System.out.println(temp+" is deleted.");
            return temp;
        }else {
            int temp = queue[front];
            front = (front+1)%maxSize;
            System.out.println(temp+" is deleted.");
            return temp;
        }
    }

    public void display(){

    }
}
