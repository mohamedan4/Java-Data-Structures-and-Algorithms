package MyImplementationLinkedListQueue;

public class Queue {
    public int data;
    public Queue next;

    public Queue(int data){
        this.data = data;
        next = null;
    }

    public void print(){
        System.out.println(" "+data);
    }
}
