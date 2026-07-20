package CircularQueue;

public class CircularQueue {
    int size = 5;
    int front,rear;
    int[] queue = new int[size];

    public CircularQueue(){
        front=-1;
        rear=-1;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public boolean isFull(){
        if(front == 0 && rear==size-1){
            return true;
        }else if(rear+1==front){
            return true;
        }
        return false;
    }

    public void enQueue(int data){
        if(isFull()){
            System.out.println("Queue is full!!!");
        }else if(isEmpty()){
            front = 0;
            rear=0;
            queue[rear]=data;
            System.out.println(rear + "= "+data); // delete
        }else {
            rear = (rear+1)%size;
            queue[rear]=data;
            System.out.println(rear + "= "+data); // delete
        }

//        if(rear==size-1){
//            rear = 0;
//        }else {
//            rear = rear+1;
//            queue[rear]=data;
//        }
    }

    public int deQueue(){
        int element;
        if(isEmpty()){
            System.out.println("Queue is empty!!!");
            return -1;
        }else if(front == rear){
            element = queue[front];
            front = -1;
            rear = -1;
            System.out.println("front: "+front); // delete
            return element;
        }else {
            element = queue[front];
            front = (front + 1) % size;
            System.out.println(element+" is deleted.");
            System.out.println("front: "+front); // delete
            return element;
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
        }else if(front == rear){
            System.out.println("There is only one element: "+queue[front]);
        }else if(rear == front+1){
            System.out.println("There is only two elements (: ");
            System.out.println("The first element is: "+queue[front]);
            System.out.println("The last element is: "+queue[rear]);
        }else {
            System.out.println("front: "+front); // delete
            System.out.println("rear: "+rear); // delete
            for (int i = front; i != rear; i = (i+1)%size) {
                System.out.println(queue[i]);
            }
            System.out.println(queue[rear]);
            System.out.println("Printed");
        }
    }
}
